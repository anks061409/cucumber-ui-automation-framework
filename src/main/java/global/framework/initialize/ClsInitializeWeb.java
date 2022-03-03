package global.framework.initialize;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import qa.pages.LoginPage;
import qa.utils.Helper;

// TODO: Auto-generated Javadoc
/**
 * The Class ClsInitializeWeb.
 */
public class ClsInitializeWeb implements CommonImplementation {
    
    /** The remote url. */
    public static String remote_url = "http://hub:4444/wd/hub";
    
    /** The automation web driver. */
    public static RemoteWebDriver automationWebDriver = null;
   
   /** The logger. */
   // public static WebDriver automationWebDriver = null;
    public static Logger logger = LogManager.getLogger();
    
    /** The elm. */
    public static WebElement elm;
    
    /** The driver name. */
    private static String driverName;
    
    /** The Constant className. */
    private static final String className = "ClsInitializeWeb";
    
    /** The get path separator. */
    private static String getPathSeparator = File.separator;
    
    /** The browser name. */
    private static browsers browserName = browsers.valueOf(ClsInitialize.getConfigProperties().getProperty("browser"));

    /**
     * Fn get automation web driver.
     *
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws InterruptedException the interrupted exception
     */
    //Method to initiate the webdriver & corresponding browser instance
    public static void fnGetAutomationWebDriver() throws IOException, InterruptedException {

        logger.info( "Automation Driver Initialization - Create Instance");
        automationWebDriver = createInstance(browserName);

    }
    
    /**
     * Creates the instance.
     *
     * @param browType the brow type
     * @return the remote web driver
     * @throws MalformedURLException the malformed URL exception
     */
    @SuppressWarnings("static-access")
    static RemoteWebDriver createInstance(browsers browType) throws MalformedURLException {
        RemoteWebDriver automationWebDriver = null;
        ChromeOptions optionsChrome;

        //InternetExplorerOptions optionsIE;
        switch (browType) {
            case CHROME:
                try {
                    String driverpath = driversPath+ getPathSeparator+"chrome" + getPathSeparator + "chromedriver.exe";
                    if(System.getProperty("os.name").contains("Linux")) {
                        driverpath = driversPath+ getPathSeparator+ "osLinux" + getPathSeparator + "chromedriver";

                    }
                    optionsChrome = new ChromeOptions();
                    optionsChrome.addArguments("ignore-certificate-errors");
                    optionsChrome.addArguments("test-type");
                    optionsChrome.addArguments("--window-size=1920,1080");
                    optionsChrome.addArguments("disable-popup-blocking");
                    optionsChrome.addArguments("--disable-notifications");
                    optionsChrome.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
                    optionsChrome.setAcceptInsecureCerts(true);
                    if (ClsInitialize.getConfigProperties().getProperty("headless").equalsIgnoreCase("true"))
                    {
                        optionsChrome.addArguments("headless");
                    }
                    if (ClsInitialize.getConfigProperties().getProperty("grid").equalsIgnoreCase("true"))
                    {
                        automationWebDriver = new RemoteWebDriver(new URL(remote_url), optionsChrome);
                    }
                    else {
                        System.setProperty("webdriver.chrome.driver", driverpath);
                        automationWebDriver = new ChromeDriver(optionsChrome);
                    }
                 //

                } catch (Exception e) {
                    logger.error(e);
                }

                break;
            case Firefox:
                try {
                    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/firefox/geckodriver.exe");

                } catch (Exception e) {
                    logger.error(e);

                }
                automationWebDriver = new FirefoxDriver();
                break;
            case Edge:
                try {
                    System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/microsoftEdge/msedgedriver.exe");

                } catch (Exception e) {
                    logger.error(e);

                }
                automationWebDriver = new EdgeDriver();
                break;

            default:
                break;
        }
        logger.info(browType +" Driver to be referenced");

        automationWebDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(automationWebDriver, 1000).until(webDriver -> ((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState").equals("complete"));
        //launch application URL from configuration
        launchConfigURL(automationWebDriver);
        return automationWebDriver;
    }

    /**
     * Launch config URL.
     *
     * @param driver the driver
     */
    //Method to launch the browser with provided application URL
    public static void launchConfigURL(WebDriver driver) {
        try {
            if (System.getProperty("appUrl") != null) {
                driver.navigate().to(System.getProperty("appUrl").toString());
                logger.info( "Application URL: " + System.getProperty("appUrl").toString());
            
            }else{
            	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.navigate().to(ClsInitialize.getConfigProperties().getProperty("url"));
                driver.manage().window().maximize();
                logger.info( "Application URL: " + ClsInitialize.getConfigProperties().getProperty("url"));
                Helper.explicitWait(3);
                LoginPage.acceptCookies(driver);
                Helper.explicitWait(2);
            }
        } catch (Exception e) {
            logger.error("Initialization of WebDriver - Launch URL");
        }
    }

    /**
     * Quit browser.
     *
     * @return true, if successful
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws InterruptedException the interrupted exception
     */
    //Method to quit the all instances of launched browser.
    public static boolean quitBrowser() throws IOException, InterruptedException {
        boolean blnResult = false;
        try {
            logger.info(className, "quitBrowser() - in Quit Browser Function");
            automationWebDriver.quit();
            blnResult = true;
        } catch (Exception objException) {
            blnResult = false;
            logger.error( objException);
        }
        return blnResult;
    }
    


}

