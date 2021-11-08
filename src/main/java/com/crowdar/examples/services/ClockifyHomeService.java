package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClockifyHomeConstants;
import com.crowdar.examples.constants.HomeConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class ClockifyHomeService {

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(ClockifyHomeConstants.LBL_TIMEENTRIES_ACCESS);
        Assert.assertTrue(MobileActionManager.isVisible(ClockifyHomeConstants.LBL_TIMEENTRIES_ACCESS), ClockifyHomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void seleccionarHorario(){
        for (int i = 0; i <4 ; i++) {
            MobileActionManager.click(ClockifyHomeConstants.NumberPicker_SELECT_ID);
        }
        //MobileActionManager.setInput(ClockifyHomeConstants.NumberPicker_SELECT_ID,"10");
        //MobileActionManager.clickOptionSpinner();
    }

    public static void verNuevaEntrada(){
        MobileActionManager.waitVisibility(ClockifyHomeConstants.LBL_NAMEPROJECTTODAY_XPATH);
        Assert.assertTrue(MobileActionManager.isVisible(ClockifyHomeConstants.LBL_NAMEPROJECTTODAY_XPATH),ClockifyHomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void cambioFondo(){

        String dark = MobileActionManager.getElement(ClockifyHomeConstants.BTN_ENABLEDARKMODE_ID).getAttribute("checked");
        if(dark.contains("true")){
            Assert.assertTrue(MobileActionManager.isVisible(ClockifyHomeConstants.BTN_ENABLEDARKMODE_ID),ClockifyHomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
        }else{
            Assert.assertTrue(dark.contains("t"),ClockifyHomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
        }
    }
}
