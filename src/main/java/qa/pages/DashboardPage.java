package qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import qa.utils.Helper;

// TODO: Auto-generated Javadoc
/**
 * The Class DashboardPage.
 */
public class DashboardPage extends BasePage{

	/**
	 * Instantiates a new dashboard page.
	 */
	//Initializing the Page Objects:
	public DashboardPage(){
		super();
	}

	/** The user details get txt. */
	@FindBy(xpath="//*[@id='frsiplicenseinfo']") 
	@CacheLookup
	public WebElement userDetailsGetTxt;

	/** The menu option link. */
	//Page Factory - OR:
	@FindBy(xpath="(//*[@class='x-box-inner ']//a)[1]") 
	@CacheLookup
	public WebElement menuOptionLink;

	/** The phone book link. */
	@FindBy(xpath="//*[@class='frsip-startmenu-shortcut']")
	@CacheLookup
	public WebElement phoneBookLink;

	/** The add contact btn. */
	@FindBy(xpath="//*[@data-qtip='Add a new contact']")
	@CacheLookup
	public WebElement addContactBtn;


	/** The relative check box. */
	@FindBy(xpath="(//*[text()='John']//parent::td[1]/preceding-sibling::td[1])[1]")
	@CacheLookup
	public WebElement relativeCheckBox;

	/** The relative modify. */
	@FindBy(xpath="(//*[text()='John']//parent::td[1]/following-sibling::td[9]//img[1])[1]")
	@CacheLookup
	public WebElement relativeModify;

	/** The relative remove. */
	@FindBy(xpath="(//*[text()='John']//parent::td[1]/following-sibling::td[9]//img[5])[1]")
	@CacheLookup
	public WebElement relativeRemove;

	/** The logout btn. */
	@FindBy(xpath="(//*[text()='Logout']//parent::span[1]//parent::span[1]//parent::a[1])") 
	@CacheLookup
	public WebElement logoutBtn;

	/** The yes btn. */
	@FindBy(xpath="(//*[text()='Yes']//parent::span[1]//parent::span[1]//parent::a[1])") 
	@CacheLookup
	public WebElement yesBtn;

	/**
	 * Gets the user details.
	 *
	 * @return the user details
	 */
	public boolean getUserDetails() {
		logger.info("access getUserDetails()");
		boolean flag=true;
		try {
			logger.info("get user details ");
			Helper.getText(userDetailsGetTxt, 5);
			flag=true;
		}
		catch (Exception e) {
			//logger.error("Failed due to ::: REASON :: "+e.getMessage());
		}
		return flag;
	}


	/**
	 * Menulink.
	 *
	 * @return true, if successful
	 */
	public boolean menulink() {
		logger.info("access menulink()");
		boolean flag=false;
		try {
			logger.info("click on menu option link");
			Helper.clickOn( menuOptionLink, 5);
			flag=true;
		}
		catch (Exception e) {
			logger.error("Failed due to ::: REASON :: "+e.getMessage());
		}
		return flag;
	}

	/**
	 * Phonebook link.
	 *
	 * @return true, if successful
	 */
	public boolean phonebookLink() {
		logger.info("access phonebook()");
		boolean flag=false;
		try {
			logger.info("click on phone book link");
			Helper.clickOn( phoneBookLink, 5);
			flag=true;
		}
		catch (Exception e) {
			logger.error("Failed due to ::: REASON :: "+e.getMessage());
		}
		return flag;
	}


	/**
	 * Adds the contact.
	 *
	 * @return true, if successful
	 */
	public boolean addContact() {
		logger.info("access addContact()");
		boolean flag=false;
		try {
			logger.info("click on add Contact button");
			Helper.clickOn( addContactBtn, 5);
			flag=true;
		}
		catch (Exception e) {
			logger.error("Failed due to ::: REASON :: "+e.getMessage());
		}
		return flag;
	}


	/**
	 * Log out.
	 *
	 * @return true, if successful
	 */
	public boolean logOut() {
		logger.info("access logOut()");
		boolean flag=false;
		try {
			logger.info("click on logout button");
			Helper.clickOn( logoutBtn, 5);
			logger.info("click on yes button");
			Helper.clickOn( yesBtn, 5);
			Helper.explicitWait(10);
			flag=true;
		}
		catch (Exception e) {
			logger.error("Failed due to ::: REASON :: "+e.getMessage());
		}

		return flag;
	}


}








