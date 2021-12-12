package extentManager;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
public static ExtentReports extent;

public static ExtentReports  getInstance(){
	if (extent==null) {
		//extent = new ExtentReports(new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date()) + "reports.html");
		extent = new ExtentReports("reports.html");
		   extent.loadConfig(new File(System.getProperty("user.dir")+"//ReportsConfig.xml"));
		  extent.addSystemInfo("Tester Name", "Samia")
		  .addSystemInfo("Project name", "Omecean")
		  .addSystemInfo("enviornment", "QA");
	
	}
	return extent;
	

	
	
}





}
