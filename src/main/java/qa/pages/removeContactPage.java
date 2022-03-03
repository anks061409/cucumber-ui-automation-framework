package qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import qa.utils.Helper;

// TODO: Auto-generated Javadoc
/**
 * The Class removeContactPage.
 */
public class removeContactPage extends BasePage{
	
	/**
	 * Instantiates a new removes the contact page.
	 */
	//Initializing the Page Objects:
	public removeContactPage(){
		super();
	}

	/** The remove btn. */
	@FindBy(xpath="(//*[text()='Remove']//parent::span[1]//parent::span[1]//parent::a[1])")
	@CacheLookup
	public WebElement removeBtn;

	/** The clancel btn. */
	@FindBy(xpath="//*[text()='Cancel']")
	@CacheLookup
	public WebElement clancelBtn;
	
	/** The msg get txt. */
	@FindBy(xpath="//*[text()='Contact deleted successfully.']")
	@CacheLookup
	public WebElement msgGetTxt;
	
	/** The close btn. */
	@FindBy(xpath="(//*[text()='Close']//parent::span[1]//parent::span[1]//parent::a[1])")
	@CacheLookup
	public WebElement closeBtn;
	
	/**
	 * Removes the contact.
	 *
	 * @return true, if successful
	 */
	public boolean removeContact() {
		logger.info("access removeContact()");
		boolean flag=false;
		try {
		logger.info("click on remove button");
		Helper.clickOn( removeBtn, 5);
		flag=true;
		}
		catch (Exception e) {
			logger.error("Failed due to ::: REASON :: "+e.getMessage());
		}
		return flag;
	}
	
	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public boolean getMessage() {
		logger.info("access getMessage()");
		boolean flag=true;
		try {
		logger.info("get message");
		Helper.getText( msgGetTxt, 5);
		flag=true;
		}
		catch (Exception e) {
			//logger.error("Failed due to ::: REASON :: "+e.getMessage());
		}
		return flag;
	}
	
	/**
	 * Removes the btn.
	 *
	 * @return true, if successful
	 */
	public boolean removeBtn() {
		logger.info("access removerBtn()");
		boolean flag=false;
		try {
		logger.info("click on close button");
		Helper.clickOn( closeBtn, 5);
		flag=true;
		}
		catch (Exception e) {
			logger.error("Failed due to ::: REASON :: "+e.getMessage());
		}
		return flag;
	}








}








