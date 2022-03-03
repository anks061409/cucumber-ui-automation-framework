package qa.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import qa.pages.BasePage;

// TODO: Auto-generated Javadoc
/**
 * The Class Helper.
 */
public class Helper extends BasePage {
	
	/** The timeout. */
	public static int timeout=3;
	
	/** The select. */
	public static Select select;

	/**
	 * Click on.
	 *
	 * @param element the element
	 * @param eleWait the ele wait
	 * @return true, if successful
	 */
	public static boolean clickOn( WebElement element, int eleWait) 
	{
		boolean flag=false;
		try {
			explicitWait(2);
			if(element.isDisplayed()) {
				new WebDriverWait(driver, eleWait).until(ExpectedConditions.elementToBeClickable(element));
				element.click();
				explicitWait(2);
				try {
				logger.info("Click on WebElement "+element.getText()); //+element.getText()
				}catch (Exception e) {
					logger.error("Failed due to ::: "+element+" REASON :: "+e.getMessage());
				}
				flag=true;
			}
		}catch (Exception  e) {
			logger.error("Failed due to ::: "+element+" REASON :: "+e.getMessage());
		}
		return flag;
	}


	/**
	 * Send keys.
	 *
	 * @param element the element
	 * @param value the value
	 * @param eleWait the ele wait
	 * @return true, if successful
	 */
	public static boolean sendKeys( WebElement element,String value,int eleWait ) 
	{
		boolean flag=false;
		try {
			//explicitWait(1);
			if(element.isDisplayed()) {
				new WebDriverWait(driver, eleWait).until(ExpectedConditions.visibilityOf(element));
				element.sendKeys(value);
				explicitWait(2);
				logger.info("Entered Test Data "+value);
				flag=true;
			}
		}catch (Exception  e) {
			logger.error("Failed due to ::: "+element+" REASON :: "+e.getMessage());
		}
		return flag;
	}
	
	/**
	 * Clean text field.
	 *
	 * @param element the element
	 * @param eleWait the ele wait
	 * @return true, if successful
	 */
	public static boolean CleanTextField( WebElement element,int eleWait) 
	{
		boolean flag=false;
		try {
			if(element.isDisplayed()) {
				new WebDriverWait(driver, eleWait).until(ExpectedConditions.visibilityOf(element));
				for (int i = 0; i <10; i++) {
					element.sendKeys(Keys.BACK_SPACE);
				}
				logger.info("Clear Text Field");
				flag=true;
			}
		}catch (Exception  e) {
			logger.error("Failed due to ::: "+element+" REASON :: "+e.getMessage());
		}
		return flag;
	}
	
	/**
	 * Send keys with encryption.
	 *
	 * @param element the element
	 * @param value the value
	 * @param eleWait the ele wait
	 * @return true, if successful
	 */
	public static boolean sendKeysWithEncryption( WebElement element,String value,int eleWait) 
	{
		boolean flag=false;
		try {
			if(element.isDisplayed()) {
				new WebDriverWait(driver, eleWait).until(ExpectedConditions.visibilityOf(element));
				element.sendKeys(value);
				explicitWait(5);
				logger.info("Entered password ************ ");
				flag=true;
			}
		}catch (Exception  e) {
			logger.error("Failed due to ::: "+element+" REASON :: "+e.getMessage());
		}
		return flag;
	}
	
	/**
	 * Gets the text.
	 *
	 * @param element the element
	 * @param eleWait the ele wait
	 * @return the text
	 */
	public static String getText(WebElement element, int eleWait) {
		String gettext=null;
		try {
			if(element.isDisplayed()) {
				new WebDriverWait(driver, eleWait).until(ExpectedConditions.visibilityOf(element));
				gettext=element.getText();
				logger.info("Get Actual Text :: "+gettext);
			}
		}catch (Exception  e) {
			logger.error("Failed due to ::: "+element+" REASON :: "+e.getMessage());
		}
		return gettext;
	}

	/**
	 * Select value from drop down by text.
	 *
	 * @param element the element
	 * @param text the text
	 * @param eleWait the ele wait
	 * @return true, if successful
	 */
	public static boolean selectValueFromDropDownByText(WebElement element, String text,int eleWait) 
	{
		boolean flag=false;
		try {
			if(element.isDisplayed()) {
				new WebDriverWait(driver, eleWait).until(ExpectedConditions.visibilityOf(element));
				select = new Select(element);
				select.selectByVisibleText(text);
				logger.info(element.getText()+" Element is displayed and Select dropDown text :: "+text);
				flag=true;
			}
		}catch (Exception  e) {
			logger.error("Failed due to ::: "+element+" REASON :: "+e.getMessage());
		}
		return flag;
	}

	/**
	 * Explicit wait.
	 *
	 * @param timeSeconds the time seconds
	 */
	public static void explicitWait(int timeSeconds) {
		try {
			TimeUnit.SECONDS.sleep(timeSeconds);
		} catch (Exception e) {
			logger.error("Error in TimeUnit wait");
		}
	}
	
	/**
	 * Browser and OS details.
	 */
	public static void BrowserAndOSDetails() {
		logger.info("Get Brower Details");
		try {
			Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
			String browserName = cap.getBrowserName().toLowerCase();
			String os = cap.getPlatform().toString();
			String v = cap.getVersion().toString();
			logger.info("OS = " + os + ", Browser = " + browserName + " "+ v);
		}catch (Exception e) {
			logger.error("Failed due to ::: REASON :: "+e.getMessage());
		}
	}
	
	/**
	 * Dynamic xpath check box.
	 *
	 * @param element the element
	 * @return true, if successful
	 */
	public static boolean dynamicXpathCheckBox(String element) {
		boolean flag=false;
		try {
		flag = driver.findElements(By.xpath("//*[text()='"+element+"']")).size() != 0;
        if (flag) {
        	driver.findElement(By.xpath("(//*[text()='"+element+"']//parent::td[1]/preceding-sibling::td[1])[1]")).click();
        	logger.info("Click on checkBox");
        	flag=true;
        }
		}catch (Exception e) {
			logger.error("Failed due to ::: "+element+" REASON :: "+e.getMessage());
		}
        return flag;
    }
	
	/**
	 * Dynamic xpath modify.
	 *
	 * @param element the element
	 * @return true, if successful
	 */
	public static boolean dynamicXpathModify(String element) {
		boolean flag=false;
		try {
		flag = driver.findElements(By.xpath("//*[text()='"+element+"']")).size() != 0;
        if (flag) {
        	driver.findElement(By.xpath("(//*[text()='"+element+"']//parent::td[1]/following-sibling::td[9]//img[1])[1]")).click();
        	logger.info("Click on modify contact link");
        	flag=true;
        }
		}catch (Exception e) {
			logger.error("Failed due to ::: "+element+" REASON :: "+e.getMessage());
		}
        return flag;
    }
	
	/**
	 * Dynamic xpath remove.
	 *
	 * @param element the element
	 * @return true, if successful
	 */
	public static boolean dynamicXpathRemove(String element) {
		boolean flag=false;
		try{
		flag = driver.findElements(By.xpath("//*[text()='"+element+"']")).size() != 0;
        if (flag) {
        	driver.findElement(By.xpath("(//*[text()='"+element+"']//parent::td[1]/following-sibling::td[9]//img[2])[1]")).click();
        	logger.info("Click on remove contact link");
        	flag=true;
        }
		}catch (Exception e) {
			logger.error("Failed due to ::: "+element+" REASON :: "+e.getMessage());
		}
        return flag;
    }
	
	
	/**
	 * Gets the title page.
	 *
	 * @return the title page
	 */
	public static String getTitlePage() {
		String title="";
		try {
		title=driver.getTitle();
		logger.info("Get Page title :: "+title);
		}catch (Exception e) {
			logger.error("Failed due to ::: REASON :: "+e.getMessage());
		}
		return title;
		
	}



}

