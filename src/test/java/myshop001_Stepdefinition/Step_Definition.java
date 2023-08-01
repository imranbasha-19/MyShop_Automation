package myshop001_Stepdefinition;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import myshop001_baseclass.Base_Class;
import page_object_manager.Login_Page;
import page_object_manager.Register_Page;

public class Step_Definition extends Base_Class {

	public Register_Page rp;
	public Login_Page lp;

	// Register Page
	// ...................................................................
	@Given("User Launch Application")
	public void user_launch_application() throws Throwable {
		getbrower("Chrome");
		rp = new Register_Page(driver);
		url("http://www.automationpractice.pl/index.php");
		Thread.sleep(3000);
	}

	@When("Click Sigin button")
	public void click_sigin_button() {
		rp.getSiginbutton().click();

	}

	@When("Provide Address")
	public void provide_address() {
		String email = rp.random_email() + "@gmail.com";
		rp.getEmail_create().sendKeys(email);
	}

	@Then("Click Create an Account Button")
	public void click_create_an_account_button() {
		rp.getCreate_account().click();

	}

	@Then("Fill all personal Details")
	public void fill_all_personal_details() throws Throwable {
		Thread.sleep(3000);
		rp.getGender_Male().click();
		rp.getFirst_name().sendKeys("Imran");
		rp.getLast_name().sendKeys("Basha");
		rp.getPassword().sendKeys("Admin@123");
		selectelement(rp.getDob_Days()).selectByValue("19");
		selectelement(rp.getDob_Month()).selectByValue("6");
		selectelement(rp.getDob_Year()).selectByValue("1998");
		rp.getNewsletter().click();

	}

	@Then("Click Register Button")
	public void click_register_button() {
		rp.getRegister().click();
		String message = driver.getPageSource();
		if (message.contains("Your account has been created")) {
			assertTrue(true);
		} else {
			assertFalse(false);
			System.out.println("User Not able to Craete an Account");
		}
		driver.quit();
	}
	// Login Functionality......................................................

	@Then("Provide {string} Email Address")
	public void provide_email_address(String email) {
		lp = new Login_Page(driver);
		lp.getEmail().sendKeys(email);
	}

	@Then("Provide {string} Password")
	public void provide_password(String password) {
		lp.getPassword().sendKeys(password);
	}

	@Then("Click Sigin and Verify")
	public void click_sigin_and_verify() {
		lp.getSigin().click();
		String pageSource = driver.getPageSource();
		if (pageSource.contains("My account - My Shop")) {
			assertTrue(true);
			System.out.println("User Login Successful");
		} else {
			assertFalse(false);
			System.out.println("User Not able to login");
		}
		driver.quit();

	}
	

}
