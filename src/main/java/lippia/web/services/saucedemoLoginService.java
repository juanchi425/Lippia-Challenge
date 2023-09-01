package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.saucedemoLoginConstants.*;


public class saucedemoLoginService extends ActionManager {
    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void  ingresarUsuario(String username){
        waitVisibility(INPUT_USERNAME_ID);
        setInput(INPUT_USERNAME_ID,username);
    }

    public static void  ingresarPassword(String password){
        waitVisibility(INPUT_PASSWORD_ID);
        setInput(INPUT_PASSWORD_ID,password);
    }

    public static void  clickLogin(){
        waitVisibility(BTN_LOGIN_ID);
        click(BTN_LOGIN_ID);
    }

    public static void validarLogin(){
        waitVisibility(TEXT_SWAG_LABS_ID);
    }
    public static void validarLoginFallido(){
        waitVisibility(BTN_LOGIN_ID);
    }


   public static void validarMensajeErrorLogin(){
      Assert.assertEquals(getAttribute(TEXT_ERROR_LOGIN,"innerText"),"Epic sadface: Username and password do not match any user in this service");
   }


}

