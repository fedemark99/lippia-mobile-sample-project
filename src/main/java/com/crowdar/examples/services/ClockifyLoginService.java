package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClockifyHomeConstants;
import com.crowdar.examples.constants.ClockifyLoginConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class ClockifyLoginService {

    public static void doSignUp(String email, String password){
        MobileActionManager.setInput(ClockifyLoginConstants.INPUT_EMAIL_ID, email);
        MobileActionManager.setInput(ClockifyLoginConstants.INPUT_PASSWORD_ID, password);
        MobileActionManager.click(ClockifyLoginConstants.BTN_LOGIN_ID);
    }

    public static void isViewLoaded(){
        MobileActionManager.waitVisibility(ClockifyLoginConstants.BTN_LOGIN_ID);
        Assert.assertTrue(MobileActionManager.isVisible(ClockifyLoginConstants.INPUT_PASSWORD_ID), ClockifyHomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }
}
