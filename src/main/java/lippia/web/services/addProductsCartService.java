package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static lippia.web.constants.addProductsCartConstants.*;


public class addProductsCartService extends ActionManager {



    public static void clickAddToCart(){
        waitVisibility(BTN_ADD_TO_CART);
        click(BTN_ADD_TO_CART);
    }

    public static void clickIconCart(){
        waitVisibility(BTN_ICON_CART);
        click(BTN_ICON_CART);
    }

    public static void  VerificarProductoAñadido(){
        List<WebElement> lista = getElements(CART_ITEM);
        Assert.assertTrue(lista.size()>0);
       }

    public static void clickProductBackpack(){
        waitVisibility(TITLE_PRODUCT_BACKPACK);
        click(TITLE_PRODUCT_BACKPACK);
    }

    public static void AddProductsCart(){
        waitVisibility(BTN_ADD_TO_CART);
        click(BTN_ADD_TO_CART);
        waitVisibility(BTN_ADD_TO_CART_BL);
        click(BTN_ADD_TO_CART_BL);
        waitVisibility(BTN_ADD_TO_CART_BT);
        click(BTN_ADD_TO_CART_BT);
    }
    public static void VerificarProductosAñadidos(){
        List<WebElement> lista = getElements(CART_ITEM);
        Assert.assertTrue(lista.size()>1);
    }

}



