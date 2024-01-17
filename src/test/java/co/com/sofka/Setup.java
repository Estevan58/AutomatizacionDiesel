package co.com.sofka;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Setup {

    @Managed()
    protected WebDriver webDriver;

    private void setupUser(String name, WebDriver webDriver) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(name).can(BrowseTheWeb.with(webDriver));
    }


    protected void actorSetupTheBrowser(String name) {
        setupUser(name, webDriver);


    }
public void quitarDriver() {

try {
        String filePath = "src/test/resources/limpiarEdge.bat";
        Process process = Runtime.getRuntime().exec(filePath);
        process.waitFor();
    } catch (IOException | InterruptedException e) {
        e.printStackTrace();
    }
}
}

