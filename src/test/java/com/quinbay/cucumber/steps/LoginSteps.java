package com.quinbay.cucumber.steps;
import com.quinbay.cucumber.CucumberHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginSteps{

    CucumberHooks cucumberHooks=new CucumberHooks();;
    WebDriver driver=cucumberHooks.getDriver();
    @Given("I am on amazon login page")
    public void i_am_on_amazon_login_page() {

        driver.get("https://www.facebook.com");
    }
    @When("I enter username as \"([^\"]*)\"$")
    public void enterUsername(String username)
    {
        driver.findElement(By.id("email")).sendKeys(username);
        System.out.println("Username : "+username);

    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void enterPassword(String password)
    {
        driver.findElement(By.id("pass")).sendKeys(password);
        System.out.println("Password : "+password);

    }

    @Then("^Login should fail$")
    public void login ()
    {
        driver.findElement(By.xpath("//button[@name='login']")).click();
        System.out.println("Trying to Login");
        //Thread.sleep(3000);

    }
    @And("this is a test")
    public void test()
    {
        System.out.println("This is a test");
    }




}
