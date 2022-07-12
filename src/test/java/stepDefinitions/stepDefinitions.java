package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import pageObjects.ApplicationPage;
import utils.TestBase;


@RunWith(Cucumber.class)
public class stepDefinitions {
    TestBase testBase = new TestBase();
    ApplicationPage applicationPage = new ApplicationPage();

    @Given("That user is on iLab homepage")
    public void thatUserIsOnILabHomepage() throws Throwable {
        testBase.WebdriverManager();
    }

    @Then("User clicks on careers")
    public void userClicksOnCareers() throws Throwable {
        testBase.WebdriverManager().findElement(By.xpath("//*[@id=\"menu-item-1373\"]/a[1]")).click();
    }

    @Then("User clicks on South Africa")
    public void userClicksOnSouthAfrica() throws Throwable {
        testBase.WebdriverManager().findElement(By.linkText("South Africa")).click();
    }

    @Then("User clicks on the first available job")
    public void userClicksOnTheFirstAvailableJob() throws Throwable {
        testBase.WebdriverManager().findElement(By.linkText("Interns - BSC Computer Science, National Diploma: IT Development Graduates")).click();
    }

    @When("user clicks on Apply Online")
    public void userClicksOnApplyOnline() throws Throwable {
        testBase.WebdriverManager().findElement(By.xpath("//*[@id=\"wpjb-scroll\"]/div[1]/a[1]")).click();
    }


    @Then("User enters  name <First Name>")
    public void userEntersNameFirstName(String firstName) throws Throwable {
        testBase.WebdriverManager().findElement(By.xpath("//*[@id=\"applicant_name\"]")).sendKeys(firstName);
    }
    @Then("^User enters  name (.+)$")
    public void user_enters_name(String firstname) throws Throwable {
        testBase.WebdriverManager().findElement(By.xpath("//*[@id=\"applicant_name\"]")).sendKeys(firstname);

    }

    @Then("^User enters email(.+)$")
    public void user_enters_email(String email) throws Throwable {
        testBase.WebdriverManager().findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
    }

    @Then("^User enters mobile(.+)$")
    public void user_enters_mobile(String mobilenumber) throws Throwable {

        testBase.WebdriverManager().findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys(applicationPage.getRandomNumberString());

    }

    @And("^User clicks on Send Application$")
    public void user_clicks_on_send_application() throws Throwable {
        testBase.WebdriverManager().findElement(By.xpath("//*[@id=\"wpjb_submit\"]")).click();

    }

    @And("^Display error message (.+)$")
    public void display_error_message(String errormes) throws Throwable {
        String errorMsg = testBase.WebdriverManager().findElement(By.xpath("//*[@id=\"wpjb-apply-form\"]/fieldset[1]/div[5]/div[1]/ul[1]/li[1]")).getText();
        Assert.assertEquals(errormes, errorMsg);

    }
}
