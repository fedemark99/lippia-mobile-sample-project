package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClockifyHomeConstants;
import com.crowdar.examples.services.ClockifyHomeService;
import com.crowdar.examples.services.ClockifyLoginService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class ClockifyHomeSteps extends PageSteps {


    @Then("Se muestra la pagina de inicio")
    public void seMuestraLaPaginaDeInicio() {
        ClockifyHomeService.isViewLoaded();
    }

    @And("El usuario hace click en el menu desplegable")
    public void elUsuarioHaceClickEnElMenuDesplegable() {
        MobileActionManager.click(ClockifyHomeConstants.BTN_BURGER_ACCESS);
    }

    @And("El usuario hace click en la opcion Settings")
    public void elUsuarioHaceClickEnLaOpcionSettings() {
        MobileActionManager.click(ClockifyHomeConstants.BTN_SETTINGS_XPATH);
    }

    @And("El usuario cambia el valor a la opcion de Enable dark mode")
    public void elUsuarioCambiaElValorALaOpcionDeEnableDarkMode() {
        MobileActionManager.waitVisibility(ClockifyHomeConstants.BTN_ENABLEDARKMODE_ID);
        MobileActionManager.click(ClockifyHomeConstants.BTN_ENABLEDARKMODE_ID);
    }

    @And("El usuario hace click en la opcion Time tracker")
    public void elUsuarioHaceClickEnLaOpcionTimeTracker() {
        MobileActionManager.click(ClockifyHomeConstants.BTN_TIMETRACKER_ID);
    }

    @And("El usuario hace click en el boton +")
    public void elUsuarioHaceClickEnElBoton() {
        MobileActionManager.click(ClockifyHomeConstants.BTN_ADDTIMETRACKER_ACCES);
    }

    @And("El usuario selecciona la opcion de Project")
    public void elUsuarioSeleccionaLaOpcionDeProject() {
        MobileActionManager.click(ClockifyHomeConstants.BTN_SELECTPROJECT_ID);
    }

    @And("El usuario selecciona uno de los proyectos previamente creados")
    public void elUsuarioSeleccionaUnoDeLosProyectosPreviamenteCreados() {
        MobileActionManager.click(ClockifyHomeConstants.BTN_OPTIONPROJECT_XPATH);
    }

    @And("El usuario selecciona el horario")
    public void elUsuarioSeleccionaElHorario() {
        ClockifyHomeService.seleccionarHorario();
    }

    @And("el usuario hace click en el boton save")
    public void elUsuarioHaceClickEnElBotonSave() {
        MobileActionManager.click(ClockifyHomeConstants.BTN_SAVE_ID);
    }

    @Then("Se visualiza una nueva entrada al proyecto")
    public void seVisualizaUnaNuevaEntradaAlProyecto() {
        ClockifyHomeService.verNuevaEntrada();
    }

    @Then("Se puede ver el fondo oscuro en la aplicacion")
    public void sePuedeVerElFondoOscuroEnLaAplicacion() {
        ClockifyHomeService.cambioFondo();
    }
}
