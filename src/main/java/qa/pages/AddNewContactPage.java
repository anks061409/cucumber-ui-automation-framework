package qa.pages;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import qa.utils.Helper;

// TODO: Auto-generated Javadoc
/**
 * The Class AddNewContactPage.
 */
public class AddNewContactPage extends BasePage{

	/**
	 * Instantiates a new adds the new contact page.
	 */
	//Initializing the Page Objects:
	public AddNewContactPage(){
		super();
	}

	/** The max frame. */
	@FindBy(xpath="//*[@id='phonebookContactForm--win_header-innerCt']/div/div[3]")
	@CacheLookup
	public WebElement maxFrame;

	/** The first nametxt. */
	@FindBy(name="firstname")
	@CacheLookup
	public WebElement firstNametxt;

	/** The last nametxt. */
	@FindBy(name="lastname")
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

	/** The sms notxt 2. */
	@FindBy(name="sms2")
	@CacheLookup
	public WebElement smsNotxt2;

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

	/** The buddy drop down. */
	@FindBy(name="buddy")
	@CacheLookup
	public WebElement buddyDropDown;

	/** The buddy option. */
	@FindBy(xpath="//*[@class='x-list-plain']/li[1]")
	@CacheLookup
	public WebElement buddyOption;

	/** The ring type drop down. */
	@FindBy(name="ringtype")
	@CacheLookup
	public WebElement ringTypeDropDown;

	/** The ring type option. */
	@FindBy(xpath="//*[text()='Default']")
	@CacheLookup
	public WebElement ringTypeOption;

	/** The ok btn. */
	@FindBy(xpath="(//*[text()='OK']//parent::span[1]//parent::span[1]//parent::a[1])")
	@CacheLookup
	public WebElement okBtn;

	/** The cancle btn. */
	@FindBy(xpath="//*[text()='Cancel']")
	@CacheLookup
	public WebElement cancleBtn;

	/** The msg get txt. */
	@FindBy(xpath="//*[@role='input']")
	@CacheLookup
	public WebElement msgGetTxt;

	/**
	 * Maxframe page.
	 *
	 * @return true, if successful
	 */
	public boolean maxframePage() {
		logger.info("access maxFramePage()");
		boolean flag=false;
		try {
		logger.info("click on maxminze page");
		Helper.clickOn( maxFrame, 1);
		flag=true;
		}
		catch (Exception e) {
			logger.error("Failed due to ::: REASON :: "+e.getMessage());
		}
		return flag;
	}


	/**
	 * Adds the new contact.
	 *
	 * @param fName the f name
	 * @param lName the l name
	 * @param fNameP the f name P
	 * @param lNameP the l name P
	 * @param otherName the other name
	 * @param nameTitle the name title
	 * @param company the company
	 * @param dept the dept
	 * @param jobTitle the job title
	 * @param phoneNo the phone no
	 * @param mobNo the mob no
	 * @param otherNo the other no
	 * @param sms1 the sms 1
	 * @param sms2 the sms 2
	 * @param fax the fax
	 * @param email the email
	 * @param location the location
	 * @return true, if successful
	 */
	public boolean addNewContact(String fName,String lName,String fNameP,String lNameP, String otherName,String nameTitle,String company,String dept,String jobTitle,
			String phoneNo, String mobNo, String otherNo, String sms1,String sms2,String fax,String email,String location) {
		logger.info("addNewContact()");
		boolean flag=false;
		try {
			logger.info("Enter first name");
			Helper.sendKeys( firstNametxt, fName, 1);
			logger.info("Enter last name");
			Helper.sendKeys( lastNametxt, lName, 1);
			logger.info("Enter first Name Pronunciation");
			Helper.sendKeys( firstNamePronunciationtxt, fNameP, 1);
			logger.info("Enter last Name Pronunciation");
			Helper.sendKeys( lastNamePronunciationtxt,lNameP , 1);
			logger.info("Enter other name");
			Helper.sendKeys( otherNametxt, otherName, 1);
			logger.info("Enter name title");
			Helper.sendKeys( nameTitletxt,nameTitle , 1);
			logger.info("Enter company");
			Helper.sendKeys(companytxt ,company , 1);
			logger.info("Enter department");
			Helper.sendKeys( departmenttxt, dept, 1);
			logger.info("Enter job Title");
			Helper.sendKeys( jobTitletxt,jobTitle, 1);
			logger.info("Enter phone No");
			Helper.sendKeys( phoneNotxt,phoneNo , 1);
			logger.info("Enter mobile No");
			Helper.sendKeys( mobileNotxt,mobNo , 1);
			logger.info("Enter other No");
			Helper.sendKeys( otherNotxt,otherNo , 1);
			logger.info("Enter ");
			Helper.sendKeys( smsNotxt1,sms1 , 1);
			logger.info("Enter sms No2");
			Helper.sendKeys( smsNotxt2,sms2 , 1);
			logger.info("Enter fax");
			Helper.sendKeys(faxtxt ,fax , 1);
			logger.info("Enter email");
			Helper.sendKeys(emailtxt ,email , 1);
			logger.info("Enter location");
			Helper.sendKeys( locationtxt,location , 1);
			logger.info("click on buddy dropdown ");
			Helper.clickOn( buddyDropDown, 5);
			Helper.explicitWait(1);
			logger.info("select buddy option ");
			Helper.clickOn( buddyOption, 5);
			Helper.explicitWait(1);
			logger.info("click on ring dropdown ");
			Helper.clickOn( ringTypeDropDown, 5);
			Helper.explicitWait(1);
			logger.info("select ring option  ");
			Helper.clickOn( ringTypeOption, 5);
			Helper.explicitWait(1);
			flag=true;
		}
		catch (Exception e) {
			logger.error("Failed due to ::: REASON :: "+e.getMessage());
		}
		return flag;


	}

	/**
	 * Ok btn.
	 *
	 * @return true, if successful
	 */
	public boolean okBtn() {
		logger.info("access okBtn()");
		boolean flag=true;
		try {
			logger.info("click on ok button");
			Helper.clickOn( okBtn, 5);
			Helper.explicitWait(1);
		}
		catch (Exception e) {
			logger.error("Failed due to ::: REASON :: "+e.getMessage());
		}
		return flag;
	}

	/**
	 * Message.
	 *
	 * @return true, if successful
	 */
	public boolean message() {
		logger.info("access message()");
		boolean flag=true;
		try {
			logger.info("get message after success add new contact");
			String msg=Helper.getText( msgGetTxt, 5);  //Contact created successfully.
			if (StringUtils.isNotBlank(msg)) {
				flag=true;
			}
		}
		catch (Exception e) {
			logger.error("Failed due to ::: REASON :: "+e.getMessage());
		}
		return flag;
	}








}








