package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static lippia.web.services.saucedemoLoginService.*;

public class saucedemoLoginSteps extends PageSteps {


    @Given("El usuario se encuentra en la web sausedemo para iniciar sesion")
    public void elUsuarioSeEncuentraEnLaWebSausedemoParaIniciarSesion() {
        navegarWeb();
    }

    @When("El usuario ingresa un '(.*)' correcto")
    public void elUsuarioIngresaUnUsernameCorrecto(String username) {
        ingresarUsuario(username);
    }

    @And("El usuario ingresa una '(.*)' correcta")
    public void elUsuarioIngresaUnaPasswordCorrecta(String password) {
        ingresarPassword(password);
    }

    @And("El usuario clickea en el boton Login")
    public void elUsuarioClickeaEnElBotonLogin() {
        clickLogin();
    }

    @Then("Se verifica que se ingreso al sitio web")
    public void seVerificaQueSeIngresoAlSitioWeb() {
        validarLogin();
    }





    @When("El usuario ingresa un '(.*)' incorrecto")
    public void elUsuarioIngresaUnUsernameIncorrecto(String username){
        ingresarUsuario(username);
    }

    @And("El usuario ingresa una '(.*)' incorrecto")
    public void elUsuarioIngresaUnaPasswordIncorrecto(String password){
        ingresarPassword(password);
    }

    @Then("se verifica que se muestre un mensaje de error que usuario o contraseña no coinciden")
    public void seVerificaQueSeMuestreUnMensajeDeErrorQueUsuarioOContraseñaNoCoinciden() {
        validarMensajeErrorLogin();
    }


    @Then("Se verifica que se ingreso al sitio correctamente")
    public void seVerificaQueSeIngresoAlSitioCorrectamente() {
        validarLoginFallido();
    }
}
