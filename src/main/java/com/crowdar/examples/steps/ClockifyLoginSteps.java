package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.ClockifyLoginService;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class ClockifyLoginSteps extends PageSteps {


    @io.cucumber.java.en.Given("La aplicacion carga correctamente")
    public void laAplicacionCargaCorrectamente() {
        ClockifyLoginService.isViewLoaded();
    }


    @io.cucumber.java.en.When("El usuario ingresa sus credenciales: (.*), (.*)")
    public void elUsuarioIngresaSusCredencialesEmailPassword(String email, String password) {
        ClockifyLoginService.doSignUp(email,password);
    }
}
