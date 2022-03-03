package qa.stepDefinition;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.pages.AddNewContactPage;
import qa.pages.BasePage;
import qa.pages.DashboardPage;
import qa.pages.LoginPage;
import qa.pages.ModifyContactPage;
import qa.pages.removeContactPage;
import qa.utils.Helper;

// TODO: Auto-generated Javadoc
/**
 * The Class Steps.
 */
public class Steps extends BasePage{
	
	/** The first name. */
	String firstName="";

	/**
	 * User on the login page.
	 */
	@Given("^User on the Login page$")
	public void user_on_the_Login_page() {
		logger.info("Running Test Method ::: User on the Login page");
		String msg=Helper.getTitlePage();
		Assert.assertEquals("Deltapath - Video & Voice Unified Communications Platform", msg);
	}

	/**
	 * Log in with credential.
	 *
	 * @param usercredentials the usercredentials
	 */
	@When("^Login with credential$")
	public void login_with_credential(DataTable usercredentials) {
		logger.info("Running Test Method ::: Login with credential");
		LoginPage loginpage=new LoginPage();
		List<List<String>> data = usercredentials.cells();
		boolean flag=loginpage.userLogin(data.get(1).get(0),data.get(1).get(1));
		Assert.assertTrue("User Not Login", flag);
	}

	/**
	 * User should be on dashboard page.
	 */
	@Then("^User should be on dashboard page$")
	public void user_should_be_on_dashboard_page() {
		logger.info("Running Test Method ::: User should be on dashboard page");
		DashboardPage  dashboardpage=new DashboardPage();
		boolean flag=dashboardpage.getUserDetails();
		Assert.assertTrue("User is not dashboard page", flag);
	}

	/**
	 * User on the dashboard page.
	 */
	@Given("^User on the dashboard page$")
	public void user_on_the_dashboard_page() {
		logger.info("Running Test Method ::: User on the dashboard page");
		DashboardPage  dashboardpage=new DashboardPage();
		boolean flag=dashboardpage.getUserDetails();
		Assert.assertTrue("User is not dashboard page", flag);
	}

	/**
	 * User logout successfully.
	 */
	@Then("^User logout successfully$")
	public void user_logout_successfully() {
		logger.info("Running Test Method ::: User logout successfully");
		DashboardPage  dashboardpage=new DashboardPage();
		dashboardpage.logOut();
		boolean flag=dashboardpage.getUserDetails();
		Assert.assertTrue("User not logout", flag);
	}

	/**
	 * Close browser.
	 */
	@Then("^Close browser$")
	public void close_browser() {
		logger.info("Running Test Method ::: Close browser");
		driver.close();
	}

	/**
	 * User click on menu link.
	 */
	@Given("^User click on menu link$")
	public void user_click_on_menu_link() {
		logger.info("Running Test Method ::: User click on menu link");
		DashboardPage  dashboardpage=new DashboardPage();
		boolean flag=dashboardpage.menulink();
		Assert.assertTrue("menu is not open", flag);
	}

	/**
	 * User click on phonebook link.
	 */
	@Given("^User click on phonebook link$")
	public void user_click_on_phonebook_link() {
		logger.info("Running Test Method ::: User click on phonebook link");
		DashboardPage  dashboardpage=new DashboardPage();
		boolean flag=dashboardpage.phonebookLink();
		Assert.assertTrue("Phonebook link not work", flag);
	}

	/**
	 * User click on add contact button.
	 */
	@Given("^User click on add contact button$")
	public void user_click_on_add_contact_button() {
		logger.info("Running Test Method ::: User click on add contact button");
		DashboardPage  dashboardpage=new DashboardPage();
		boolean flag=dashboardpage.addContact();
		Assert.assertTrue("add To Contact button not working", flag);
	    
	}

	/**
	 * User click on page maximize.
	 */
	@Given("^User click on page maximize$")
	public void user_click_on_page_maximize() {
		logger.info("Running Test Method ::: User click on page maximize");
		AddNewContactPage addnewcontact=new AddNewContactPage();
		boolean flag=addnewcontact.maxframePage();
		Assert.assertTrue("Frame not max", flag);
	}

	/**
	 * User enter some details.
	 *
	 * @param arg1 the arg 1
	 */
	@Given("^User Enter Some Details$")
	public void user_Enter_Some_Details(DataTable arg1) {
		logger.info("Running Test Method ::: User Enter Some Details");
		AddNewContactPage addnewcontact=new AddNewContactPage();
		List<List<String>> data = arg1.cells();
		boolean flag=addnewcontact.addNewContact(
				data.get(1).get(0),
				data.get(1).get(1),
				data.get(1).get(2),
				data.get(1).get(3),
				data.get(1).get(4),
				data.get(1).get(5),
				data.get(1).get(6),
				data.get(1).get(7),
				data.get(1).get(8),
				data.get(1).get(9),
				data.get(1).get(10),
				data.get(1).get(11),
				data.get(1).get(12),
				data.get(1).get(13),
				data.get(1).get(14),
				data.get(1).get(15),
				data.get(1).get(16));
		Assert.assertTrue("No new contact add",flag);
	}

	/**
	 * User click on ok button.
	 */
	@Given("^User click on ok button$")
	public void user_click_on_ok_button() {
		logger.info("Running Test Method ::: User click on ok button");
		AddNewContactPage addnewcontact=new AddNewContactPage();
		boolean flag=addnewcontact.okBtn();
		Assert.assertTrue("Ok button not work", flag);
	}

	/**
	 * User should validate add successful popup message.
	 */
	@Then("^User should validate add successful popup message$")
	public void user_should_validate_add_successful_popup_message() {
		logger.info("Running Test Method ::: User should validate add successful popup message");
		AddNewContactPage addnewcontact=new AddNewContactPage();
		boolean flag=addnewcontact.message();
		Assert.assertTrue("successful popup message not present", flag);
	}

	/**
	 * User click on O K button.
	 */
	@Then("^User click on OK button$")
	public void user_click_on_OK_button() {
		logger.info("Running Test Method ::: User click on OK button");
		AddNewContactPage addnewcontact=new AddNewContactPage();
		boolean flag=addnewcontact.okBtn();
		Assert.assertTrue("User not click on Ok button", flag);
	}

	/**
	 * User click on first name check box.
	 *
	 * @param arg2 the arg 2
	 */
	@Given("^User click on firstName checkBox$")
	public void user_click_on_firstName_checkBox(DataTable arg2) {
		logger.info("Running Test Method ::: User click on firstName checkBox");
		List<List<String>> data = arg2.cells();
		firstName=data.get(1).get(0);
		boolean flag=Helper.dynamicXpathCheckBox(firstName);
		Assert.assertTrue("check box not click", flag);
	}

	/**
	 * User click on modify link.
	 */
	@Given("^User click on modify link$")
	public void user_click_on_modify_link() {
		logger.info("Running Test Method ::: User click on modify link");
		boolean flag=Helper.dynamicXpathModify(firstName);
		Assert.assertTrue("modify link not work", flag);
	}

	/**
	 * User click on maximize modify page.
	 */
	@Given("^User click on maximize Modify page$")
	public void user_click_on_maximize_Modify_page() {
		logger.info("Running Test Method ::: User click on maximize Modify page");
		ModifyContactPage modifycontact=new ModifyContactPage();
		boolean flag=modifycontact.maxframePage();
		Assert.assertTrue("frame not max", flag);
	}

	/**
	 * User modify first name.
	 *
	 * @param arg1 the arg 1
	 */
	@Given("^User modify firstName$")
	public void user_modify_firstName(DataTable arg1) {
		logger.info("Running Test Method ::: User modify firstName");
		ModifyContactPage modifycontact=new ModifyContactPage();
		List<List<String>> data = arg1.cells();
		firstName=data.get(1).get(0);

		boolean flag=modifycontact.modifyContact(firstName);
		Assert.assertTrue("contact not modify", flag);
	}

	/**
	 * User should validate update successful popup message.
	 */
	@Then("^User should validate update successful popup message$")
	public void user_should_validate_update_successful_popup_message() {
		logger.info("Running Test Method ::: User should validate update successful popup message");
		AddNewContactPage addnewcontact=new AddNewContactPage();
		boolean flag=addnewcontact.message();
		Assert.assertTrue("contact not modify", flag);
	    
	}

	/**
	 * User click on remove link.
	 */
	@Given("^User click on Remove link$")
	public void user_click_on_Remove_link() {
		logger.info("Running Test Method ::: User click on Remove link");
		boolean flag=Helper.dynamicXpathRemove(firstName);
		Assert.assertTrue("Remove link not work", flag);
	    
	}

	/**
	 * User click on remove contact button.
	 */
	@Given("^User click on remove contact button$")
	public void user_click_on_remove_contact_button() {
		logger.info("Running Test Method ::: User click on remove contact button");
		removeContactPage removecontact=new removeContactPage();
		boolean flag=removecontact.removeContact();
		Assert.assertTrue("Remove contact link not working", flag);
	    
	}

	/**
	 * User should validate remove successful popup message.
	 */
	@Then("^User should validate remove successful popup message$")
	public void user_should_validate_remove_successful_popup_message() {
		logger.info("Running Test Method ::: User should validate remove successful popup message");
		removeContactPage removecontact=new removeContactPage();
		boolean flag=removecontact.getMessage();
		Assert.assertTrue("popup message not present", flag);
	}

	/**
	 * User click on remove button.
	 */
	@Then("^User click on remove button$")
	public void user_click_on_remove_button() {
		logger.info("Running Test Method ::: User click on remove button");
		removeContactPage removecontact=new removeContactPage();
		boolean flag=removecontact.removeBtn();
		Assert.assertTrue("close button not present", flag);
	}


}
