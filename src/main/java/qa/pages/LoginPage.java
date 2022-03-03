package qa.pages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import qa.utils.Helper;

// TODO: Auto-generated Javadoc
/**
 * The Class LoginPage.
 */
public class LoginPage extends BasePage{

	/** The logger. */
	public static Logger logger = LogManager.getLogger();

	/**
	 * Instantiates a new login page.
	 */
	//Initializing the Page Objects:
	public LoginPage(){
		super();
	}

	/** The cookies. */
	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='Accept'])[1]/following::span[1]") 
	@CacheLookup
	public static WebElement cookies;

	/** The usertxt. */
	//Page Factory - OR:
	@FindBy(name="userId") 
	@CacheLookup
	public WebElement usertxt;

	/** The passwordtxt. */
	@FindBy(name="password")
	@CacheLookup
	public WebElement passwordtxt;

	/** The login btn. */
	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='Login'])[1]/following::span[1]")
	@CacheLookup
	public WebElement loginBtn;

	/**
	 * User login.
	 *
	 * @param email the email
	 * @param password the password
	 * @return true, if successful
	 */
	public boolean userLogin(String email,String password) {
		logger.info("access userLogin()");
		boolean status=false;
		try {
			logger.info("enter on user name");
			Helper.sendKeys( usertxt,email,5);
			logger.info("enter password");
			Helper.sendKeysWithEncryption( passwordtxt,password,5);
			logger.info("click on login button");
			Helper.clickOn( loginBtn,5);
			Helper.explicitWait(5);
			status=true;
		}
		catch (Exception e) {
			logger.error("Failed due to ::: REASON :: "+e.getMessage());
		}
		return status;
	}

	/**
	 * Accept cookies.
	 *
	 * @param driver the driver
	 */
	public static void acceptCookies(WebDriver driver) {
		logger.info("access acceptCookies()");
		try {
		Helper.explicitWait(3);
		By cookies_accept = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Accept'])[1]/following::span[1]");
		WebDriverWait wait = new WebDriverWait(driver,10);
		logger.info("click on accept button");
		wait.until(ExpectedConditions.elementToBeClickable(cookies_accept)).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(cookies_accept));
		Helper.explicitWait(3);
		}	
	catch (Exception e) {
		logger.error("Failed due to ::: REASON :: "+e.getMessage());
	}
	}




}








