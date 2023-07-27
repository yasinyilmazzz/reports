package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;



public class Hooks {

    //Hooks is used to run before and after each Scenario and Scenario Outline
    @Before//import io.cucumber.java.Before;
    public void setUpScenario() {
        System.out.println("Before Scenario Method");
    }

    @After//import io.cucumber.java.After;
    public void tearDownScenario(Scenario scenario) {
        System.out.println("After Scenario Method");
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) (Driver.getDriver())).getScreenshotAs(OutputType.BYTES);
            scenario.attach(failedScreenshot, "image/png", "failed_scenario" + scenario.getName());
            Driver.closeDriver();
        }
    }






}