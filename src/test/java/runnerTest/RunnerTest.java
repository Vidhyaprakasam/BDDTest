package runnerTest;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "com.cucumber.listener.ExtentCucumberFormatter" },tags={"@HomePage1"},format={"pretty","html:report"},glue= {"cucumberTest"},features= {"C:\\Users\\vidhya_prakasam\\eclipse-workspace\\CucumberTest\\src\\test\\resources\\Feature"})

public class RunnerTest {


		@BeforeClass

		public static void setup() {

		// Initiates the extent report and generates the output in the

		// output/Run_<unique timestamp>/report.html file by default.

		ExtentCucumberFormatter.initiateExtentCucumberFormatter();



		// Loads the extent config xml to customize on the report.

		ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));



		// User can add the system information as follows

		ExtentCucumberFormatter.addSystemInfo("Browser Name", "Firefox");

		ExtentCucumberFormatter.addSystemInfo("Browser version", "v31.0");

		ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.0");



		// Also you can add system information using a hash map

		Map systemInfo = new HashMap();

		systemInfo.put("Cucumber version", "v1.2.3");

		systemInfo.put("Extent Cucumber Reporter version", "v1.1.1");

		ExtentCucumberFormatter.addSystemInfo(systemInfo);
		
		
		}
		
	}	
