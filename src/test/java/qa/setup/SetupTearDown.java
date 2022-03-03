package qa.setup;

import global.framework.initialize.ClsInitialize;
import global.framework.initialize.ClsInitializeWeb;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class SetupTearDown {

    public static Logger logger = LogManager.getLogger();

    /**
     * This function will be use before every scenario to setup the webdriver
     * @param  scenarioName  the name of the scenario which is currently being executed
     * @return     void
     */

    @Before
    public void beforeSetup(Scenario scenarioName)  {

        logger.info(scenarioName.getName());
        try {
            ClsInitialize.intializeFramework(ClsInitialize.ClsInitializeFrameworkType.WEB,scenarioName);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    //@After(order=1)
    //Method to take screenshot on scenario failure
    public void takeScreenshotOnFailure(Scenario scenario) {
    	TakesScreenshot ts =(TakesScreenshot)ClsInitializeWeb.automationWebDriver;
    	byte[] src = ts.getScreenshotAs(OutputType.BYTES);
    	if(scenario.isFailed()) {
    	scenario.attach(src, "image/png", "screenshot");
    	}
    }
    
  //Close browser instance
  	@After(order=0)
  	public void tearDown() throws IOException, InterruptedException {
  	  ClsInitializeWeb.quitBrowser();
      logger.info("Closing browser instance....");   
  	}


}
