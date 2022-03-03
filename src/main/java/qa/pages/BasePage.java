package qa.pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import global.framework.initialize.ClsInitializeWeb;



// TODO: Auto-generated Javadoc
/**
 * The Class BasePage.
 */
public class BasePage {	
	
	/** The logger. */
	public static Logger logger = LogManager.getLogger();
	
	/** The iframes. */
	@FindBy(how = How.XPATH, using = "//iframe")
    private List<WebElement> iframes;
	
	/** The accept cookies. */
	@FindBy(how = How.XPATH, using = "//a[contains(.,'Accept')]")
    private WebElement acceptCookies;
	
	/** The driver. */
	public static WebDriver driver;
	
	/**
	 * Instantiates a new base page.
	 */
	protected BasePage(){
		PageFactory.initElements(ClsInitializeWeb.automationWebDriver,this);
		this.driver =ClsInitializeWeb.automationWebDriver;
	}
	
/*	public void acceptCookiesAlert() {
		if(TestUtility.isElementPresent(acceptCookies)) {	
       	 Helper.clickOn( this.acceptCookies);
       }
	}*/
		
    
        
	
       
	
}
    



