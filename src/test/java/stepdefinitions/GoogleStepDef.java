package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDef {
    GooglePage page = new GooglePage();

    @Given("Ana sayfaya gidilir")
    public void ana_sayfaya_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Given("Arama çubuğunda {string} yazılır")
    public void arama_çubuğunda_yazılır(String string) {
        page.search.sendKeys(string);
    }
    @Then("Sayfa başlığının {string} olduğu görülür.")
    public void sayfa_başlığının_olduğu_görülür(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @And("Arama tuşuna basılır")
    public void aramaTuşunaBasılır() {
        page.button.click();
    }
}
