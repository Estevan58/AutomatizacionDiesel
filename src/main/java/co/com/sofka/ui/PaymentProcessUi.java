package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentProcessUi extends PageObject {
    public static final Target BUTTONCONTINUAR = Target
            .the("BUTTONCONTINUAR")
            .located(By.id("proceed-to-checkout"));

    public static final Target FINALIZARCOMPRA = Target
            .the("FINALIZARCOMPRA")
            .located(By.id("cart-to-orderform"));
    public static final Target INGRESAREMAIL = Target
            .the("INGRESAREMAIL")
            .located(By.id("client-pre-email"));

    public static final Target CONTINUARENINGRESAREMAIL = Target
            .the("CONTINUARENINGRESAREMAIL")
            .located(By.xpath("//span[contains(text(), 'Continuar')]"));

    public static final Target NOMBRE = Target
            .the("NOMBRE")
            .located(By.id("client-first-name"));
    public static final Target APELLIDO = Target
            .the("APELLIDO")
            .located(By.id("client-last-name"));
    public static final Target CEDULA = Target
            .the("CEDULA")
            .located(By.id("client-document"));
    public static final Target MOVIL = Target
            .the("MOVIL")
            .located(By.id("client-phone"));
    public static final Target BUTTONIRPARAPAGO = Target
            .the("BUTTONENTREGA")
            .located(By.id("go-to-shipping"));

    public static final Target CLICKDEPARTAMENTO = Target
            .the("CLICKDEPARTAMENTO")
            .located(By.xpath("//*[@id=\"ship-state\"]"));
    public static final Target DEPARTAMENTO = Target
            .the("DEPARTAMENTO")
            .located(By.cssSelector("#ship-state > option:nth-child(3)"));

    public static final Target CLICKMUNICIPIO = Target
            .the("CLICKMUNICIPIO")
            .located(By.xpath("//*[@id=\"ship-city\"]"));
    public static final Target MUNICIPIO = Target
            .the("MUNICIPIO")
            .located(By.xpath("//select[@id='ship-city']/option[text()='Bello']"));
    public static final Target DIRECCION = Target
            .the("DIRECCION")
            .located(By.name("street"));
    public static final Target INFORADICIONAL = Target
            .the("INFORADICIONAL")
            .located(By.id("ship-complement"));
    public static final Target BARRIO = Target
            .the("BARRIO")
            .located(By.id("ship-neighborhood"));
    public static final Target DESTINARIO = Target
            .the("DESTINARIO")
            .located(By.id("ship-receiverName"));
    public static final Target BUTTONIRALPAGO = Target
            .the("BUTTONIRALPAGO")
            .located(By.id("btn-go-to-payment"));
    public static final Target APPNEQUI = Target
            .the("APPNEQUI")
            .located(By.id("payment-group-NequiPaymentGroup"));
    public static final Target ACEPTARTERMINOS = Target
            .the("ACEPTARTERMINOS")
            .located(By.id("terminos-condiciones"));
    public static final Target BUTTONCOMPRARAHORA = Target
            .the("BUTTONCOMPRARAHORA")
            .located(By.id("payment-data-submit"));
}
