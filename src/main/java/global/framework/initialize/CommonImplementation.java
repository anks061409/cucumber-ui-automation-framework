package global.framework.initialize;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Interface CommonImplementation.
 */
public interface CommonImplementation {
    
    /** The get path separator. */
    String getPathSeparator = File.separator;
    
    /** The dateformat. */
    DateFormat dateformat = new SimpleDateFormat("MM-dd-yyyy HHmmss");
    
    /** The date. */
    Date date = new Date();
    
    /** The Constant propertyDir. */
    final static String propertyDir = System.getProperty("user.dir")
            + getPathSeparator + "src" + getPathSeparator + "test" + getPathSeparator + "resources" + getPathSeparator + "configuration";
    
    /** The Constant propertyFilePath. */
    final static String propertyFilePath = System.getProperty("user.dir")
            + getPathSeparator + "src" + getPathSeparator + "test" + getPathSeparator + "resources" + getPathSeparator + "configuration" + getPathSeparator + "Configuration.properties";
    
    /** The str path. */
    public static String strPath = System.getProperty("user.dir") + getPathSeparator + "src" + getPathSeparator + "test" + getPathSeparator + "resources" + getPathSeparator + "";
    
    /** The str path JSON data. */
    public static String strPath_JSONData = "\"" + strPath + "Data" + getPathSeparator + "CommonData.json" + "\"";
    
    /** The str report path extent reports. */
    public static String strReportPathExtentReports = System.getProperty("user.dir") + getPathSeparator + "target" + getPathSeparator + "Test_Report"
            + dateformat.format(date) + ".html";
    
    /** The drivers path. */
    public static String driversPath =System.getProperty("user.dir")
    		+getPathSeparator + "src"+ getPathSeparator+ "test"+getPathSeparator+"resources"+getPathSeparator+"drivers";
    
    /**
     * The Enum browsers.
     */
    enum browsers {
    	
        /** The chrome. */
        CHROME,
        
        /** The Firefox. */
        Firefox, 
        
        /** The Edge. */
        Edge;
    }
    
    
}
