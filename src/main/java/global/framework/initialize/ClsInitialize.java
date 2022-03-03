package global.framework.initialize;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.Scenario;

// TODO: Auto-generated Javadoc
/**
 * The Class ClsInitialize.
 */
public class ClsInitialize implements CommonImplementation {
    
    /** The logger. */
    public static Logger logger = LogManager.getLogger();;
    
    /** The Constant className. */
    private final static String className = "ClsInitialize";
    
    /** The reader. */
    public static BufferedReader reader = null;
    
    /** The properties. */
    public static Properties properties = null;
    
    /** The capabilities. */
    public static DesiredCapabilities capabilities = new DesiredCapabilities();
    
    /** The mobile properties flag. */
    public static boolean mobilePropertiesFlag = false;
    
    /** The str test case name. */
    public static String strTestCaseName = null;
    
    /** The str platform. */
    public static String strPlatform = null;
    
    /** The scenario thread. */
    private static Scenario scenarioThread;
    
    /** The arr data. */
    public HashMap<String,String> arrData = new HashMap<>();
    
    /**
     * The Enum ClsInitializeFrameworkType.
     */
    public enum ClsInitializeFrameworkType {
        
        /** The web. */
        WEB;
    }
    
    /**
     * The Enum propertyType.
     */
    public static enum propertyType {
        
        /** The config properties. */
        configProperties;
    }
    
    /**
     * Instantiates a new cls initialize.
     */
    public ClsInitialize() {
    }
    
    /**
     * This function will be use before every scenario to setup the webdriver.
     *
     * @param clsInitializeFrameworkType the cls initialize framework type
     * @param scenario the scenario
     * @return     void
     * @throws Exception the exception
     */
    public static void intializeFramework (ClsInitializeFrameworkType clsInitializeFrameworkType, Scenario scenario) throws Exception {
        getConfigProperties();
        /*
        logger.debug(className, "Retrieving the configuration from Configuration.properties.  ClsInitialize.properties " + ClsInitialize.properties);
        logger.info(className, "Loading Overall Configuration from src/test/resources/Configuration/Configuration.properties");
        logger.info(className, "Framework Type is: " + clsInitializeFrameworkType);
        */
        switch (clsInitializeFrameworkType) {
            case WEB:
                ClsInitializeWeb.fnGetAutomationWebDriver();
                break;
        }
    }
    
    /**
     * Gets the config properties.
     *
     * @return the config properties
     */
    public static synchronized Properties getConfigProperties() {
        try {
            if (ClsInitialize.properties == null) {
                ClsInitialize.reader = new BufferedReader(new FileReader(propertyFilePath));
                ClsInitialize.properties = new Properties();
                ClsInitialize.properties.load(ClsInitialize.reader);
                ClsInitialize.reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ClsInitialize.properties;
    }
    
    /**
     * Gets the properties.
     *
     * @param prop the prop
     * @return the properties
     */
    public static Properties getProperties(propertyType prop) {
        Properties propReturn = new Properties();
        switch (prop) {
            case configProperties:
                propReturn = ClsInitialize.getConfigProperties();
                break;
            default:
                break;
        }
        return propReturn;
    }
    

    	

    	
  	
   
    		
	  
	 
	
	  
	 
		

}
	