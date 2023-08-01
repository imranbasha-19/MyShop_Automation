package page_object_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.utility.RandomString;

public class Register_Page {

	public static WebDriver driver;

	public Register_Page(WebDriver driver2) {
		driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static String random_email() {
		String randomString = RandomString.make(5);
		return randomString;

	}

	public WebElement getSiginbutton() {
		return siginbutton;
	}

	public WebElement getEmail_create() {
		return Email_create;
	}

	public WebElement getCreate_account() {
		return create_account;
	}

	public WebElement getGender_Female() {
		return gender_Female;
	}

	public WebElement getGender_Male() {
		return gender_Male;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getEmail_register_Page() {
		return email_register_Page;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDob_Days() {
		return Dob_Days;
	}

	public WebElement getDob_Month() {
		return Dob_Month;
	}

	public WebElement getDob_Year() {
		return Dob_Year;
	}

	public WebElement getNewsletter() {
		return newsletter;
	}

	public WebElement getRegister() {
		return register;
	}

	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	private WebElement siginbutton;

	@FindBy(xpath = "//input[@id='email_create']")
	private WebElement Email_create;

	@FindBy(xpath = "//span[normalize-space()='Create an account']")
	private WebElement create_account;

	@FindBy(xpath = "//input[@id='id_gender2']")
	private WebElement gender_Female;

	@FindBy(xpath = "//input[@id='id_gender1']")
	private WebElement gender_Male;

	@FindBy(xpath = "//input[@id='customer_firstname']")
	private WebElement first_name;

	@FindBy(xpath = "//input[@id='customer_lastname']")
	private WebElement last_name;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email_register_Page;

	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement password;

	@FindBy(xpath = "//select[@id='days']")
	private WebElement Dob_Days;

	@FindBy(xpath = "//select[@id='months']")
	private WebElement Dob_Month;

	@FindBy(xpath = "//select[@id='years']")
	private WebElement Dob_Year;

	@FindBy(xpath = "//input[@id='newsletter']")
	private WebElement newsletter;

	@FindBy(xpath = "//span[normalize-space()='Register']")
	private WebElement register;

}
