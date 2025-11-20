package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class TextBoxLocatorsUI extends PageObject {

    public static final Target HEADER_TEXT_BOX = Target.the("cabecera de la seleccion de TextBox")
            .located(By.xpath("//h1[@class='text-center' and text()='Text Box']"));

    public static final Target ITEM_TEXT_BOX = Target.the("item TextBox")
            .located(By.id("item-0"));

    public static final Target FULL_NAME_TEXT_BOX = Target.the("campo de nombre de usuario TextBox")
            .located(By.id("userName"));

    public static final Target EMAIL_TEXT_BOX = Target.the("campo de email de usuario TextBox")
            .located(By.id("userEmail"));

    public static final Target CURRENT_ADDRESS_TEXT_BOX = Target.the("campo de direccion actual de usuario TextBox")
            .located(By.id("currentAddress"));

    public static final Target PERMANENT_ADDRESS_TEXT_BOX = Target.the("campo de direccion permanente de usuario TextBox")
            .located(By.id("permanentAddress"));

    public static final Target BTN_SUBMIT_TEXT_BOX = Target.the("boton de envio de datos TextBox")
            .located(By.id("submit"));


    //****locator output****
    public static final Target OUTPUT_NAME = Target.the("campo de nombre output TextBox")
            .located(By.id("name"));

    public static final Target OUTPUT_EMAIL = Target.the("campo de email output TextBox")
            .located(By.id("email"));

    public static final Target OUTPUT_CURRENT_ADREESS = Target.the("campo de direccion actual output TextBox")
            .located(By.xpath("//p[@id='currentAddress']"));

    public static final Target OUTPUT_PERMANENT_ADREESS = Target.the("campo de direccion permanente output TextBox")
            .located(By.xpath("//p[@id='permanentAddress']"));

}
