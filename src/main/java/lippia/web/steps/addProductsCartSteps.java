package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static lippia.web.services.addProductsCartService.*;

public class addProductsCartSteps extends PageSteps {

    @And("El usuario clickea en el boton de Add to Cart del producto Sauce Labs Backpack")
    public void elUsuarioClickeaEnElBotonDeAddToCartDelProductoSauceLabsBackpack() {
        clickAddToCart();
    }

    @And("El usuario clickea en el icono del carrito")
    public void elUsuarioClickeaEnElIconoDelCarrito() {
        clickIconCart();
    }

    @Then("Se verifica que el Producto se haya cargado al carrito")
    public void seVerificaQueElProductoSeHayaCargadoAlCarrito() {
        VerificarProductoAñadido();
    }


    @And("El usuario clickea en el producto Sauce Labs Backpack")
    public void elUsuarioClickeaEnElProductoSauceLabsBackpack() {
        clickProductBackpack();
    }


    @Then("Se verifica que los Productos se hayan cargado al carrito")
    public void seVerificaQueLosProductosSeHayanCargadoAlCarrito() {
        VerificarProductosAñadidos();
    }

    @And("El usuario añade varios productos al carrito")
    public void elUsuarioAñadeVariosProductosAlCarrito() {
        AddProductsCart();
    }
}
