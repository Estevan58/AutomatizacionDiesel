    package co.com.sofka.tasks.AutomationPage;

    import net.serenitybdd.screenplay.Actor;
    import net.serenitybdd.screenplay.Task;
    import net.serenitybdd.screenplay.actions.Click;
    import net.serenitybdd.screenplay.actions.Enter;
    import net.serenitybdd.screenplay.actions.Scroll;
    import net.serenitybdd.screenplay.waits.WaitUntil;

    import java.time.Duration;

    import static co.com.sofka.ui.PaymentProcessUi.*;
    import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

    public class PaymentProcessTasks implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(

                    Enter.theValue("Carlos").into(NOMBRE),
                    Enter.theValue("Uribe").into(APELLIDO),
                    Enter.theValue("6666666666").into(CEDULA),
                    Enter.theValue("3027315615").into(MOVIL),
                    //Scroll.to(BUTTONIRPARAPAGO),
                    WaitUntil.the(BUTTONIRPARAPAGO, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                    Click.on(BUTTONIRPARAPAGO),
                    WaitUntil.the(CLICKDEPARTAMENTO, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                    Click.on(CLICKDEPARTAMENTO),
                    WaitUntil.the(DEPARTAMENTO, isClickable()).forNoMoreThan(Duration.ofSeconds(200)),
                    Scroll.to(DEPARTAMENTO),
                    Click.on(DEPARTAMENTO),


                    WaitUntil.the(CLICKMUNICIPIO, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                    Click.on(CLICKMUNICIPIO),
                    WaitUntil.the(MUNICIPIO, isClickable()).forNoMoreThan(Duration.ofSeconds(200)),
                    Scroll.to(MUNICIPIO)
,                    Click.on(MUNICIPIO),


                    //Scroll.to(DIRECCION),
                    Enter.theValue("Calle 39 #92-1").into(DIRECCION),
                    Enter.theValue("Adicionalito").into(INFORADICIONAL),
                    Enter.theValue("Santo Domingo").into(BARRIO),
                    Enter.theValue("German Valencia").into(DESTINARIO),
                    WaitUntil.the(BUTTONIRALPAGO, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                    Click.on(BUTTONIRALPAGO),
                    WaitUntil.the(APPNEQUI, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                    Click.on(APPNEQUI),
                    WaitUntil.the(ACEPTARTERMINOS, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                    Click.on(ACEPTARTERMINOS)
                    //Scroll.to(BUTTONCOMPRARAHORA),
                    //WaitUntil.the(BUTTONCOMPRARAHORA, isClickable()).forNoMoreThan(Duration.ofSeconds(10))



            );
        }

        public static PaymentProcessTasks paymentProcessTasks() {
            return new PaymentProcessTasks();
        }
    }
