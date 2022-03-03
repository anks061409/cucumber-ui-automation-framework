package qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import qa.utils.Helper;

// TODO: Auto-generated Javadoc
/**
 * The Class ModifyContactPage.
 */
public class ModifyContactPage extends BasePage{

	/**
	 * Instantiates a new modify contact page.
	 */
	//Initializing the Page Objects:
	public ModifyContactPage(){
		super();
	}

	/** The max frame. */
	@FindBy(xpath="(//*[contains(@id,'phonebookContactForm-')]//div[3])[1]")
	@CacheLookup
	public WebElement maxFrame;

	/** The first nametxt. */
	@FindBy(name="firstname")
	@CacheLookup
	public WebElement firstNametxt;

	/** The last nametxt. */
	@FindBy(name="firstname")
	@CacheLookup
	public WebElement lastNametxt;

	/** The first name pronunciationtxt. */
	@FindBy(name="firstname_p")
	@CacheLookup
	public WebElement firstNamePronunciationtxt;

	/** The last name pronunciationtxt. */
	@FindBy(name="lastname_p")
	@CacheLookup
	public WebElement lastNamePronunciationtxt;

	/** The other nametxt. */
	@FindBy(name="othername")
	@CacheLookup
	public WebElement otherNametxt;

	/** The name titletxt. */
	@FindBy(name="nametitle")
	@CacheLookup
	public WebElement nameTitletxt;

	/** The companytxt. */
	@FindBy(name="company")
	@CacheLookup
	public WebElement companytxt;

	/** The departmenttxt. */
	@FindBy(name="department")
	@CacheLookup
	public WebElement departmenttxt;

	/** The job titletxt. */
	@FindBy(name="jobTitle")
	@CacheLookup
	public WebElement jobTitletxt;

	/** The phone notxt. */
	@FindBy(name="phone_number")
	@CacheLookup
	public WebElement phoneNotxt;

	/** The mobile notxt. */
	@FindBy(name="mobile_number")
	@CacheLookup
	public WebElement mobileNotxt;

	/** The other notxt. */
	@FindBy(name="other_number")
	@CacheLookup
	public WebElement otherNotxt;

	/** The sms notxt 1. */
	@FindBy(name="sms1")
	@CacheLookup
	public WebElement smsNotxt1;

	/** The sms notxt 5. */
	@FindBy(name="sms5")
	@CacheLookup
	public WebElement smsNotxt5;

	/** The faxtxt. */
	@FindBy(name="fax")
	@CacheLookup
	public WebElement faxtxt;

	/** The emailtxt. */
	@FindBy(name="email")
	@CacheLookup
	public WebElement emailtxt;

	/** The locationtxt. */
	@FindBy(name="location")
	@CacheLookup
	public WebElement locationtxt;

	/** The buddytxt. */
	@FindBy(name="")
	@CacheLookup
	public WebElement buddytxt;

	/** The buddy option. */
	@FindBy(xpath="//*[@class='x-list-plain']/li[1]")
	@CacheLookup
	public WebElement buddyOption;

	/** The ring typetxt. */
	@FindBy(name="")
	@CacheLookup
	public WebElement ringTypetxt;

	/** The ok btn. */
	@FindBy(xpath="(//*[text()='OK']//parent::span[1]//parent::span[1]//parent::a[1])")
	@CacheLookup
	public WebElement okBtn;

	/** The cancle btn. */
	@FindBy(xpath="//*[text()='Cancel']")
	@CacheLookup
	public WebElement cancleBtn;


	/**
	 * Modify contact.
	 *
	 * @param fname the fname
	 * @return true, if successful
	 */
	public boolean modifyContact(String fname) {
		logger.info("access modifyContact()");
		boolean flag=false;
		try {
			logger.info("clean first name text field");
			Helper.CleanTextField( firstNametxt, 5);
			logger.info("enter first name");
			Helper.sendKeys( firstNametxt, fname, 5);
			logger.info("click on ok button");
			Helper.clickOn(okBtn, 5);
			flag=true;
		}
		catch (Exception e) {
			logger.error("Failed due to ::: REASON :: "+e.getMessage());
		}
		return flag;
	}

	/**
	 * Maxframe page.
	 *
	 * @return true, if successful
	 */
	public boolean maxframePage() {
		logger.info("access maxframePage()");
		boolean flag=false;
		try {
		Helper.explicitWait(5);
		logger.info("click on maxminze page");
		Helper.clickOn( maxFrame, 5);
		Helper.explicitWait(2);
		flag=true;
		}
		catch (Exception e) {
			logger.error("Failed due to ::: REASON :: "+e.getMessage());
		}
		return flag;
	}






}








