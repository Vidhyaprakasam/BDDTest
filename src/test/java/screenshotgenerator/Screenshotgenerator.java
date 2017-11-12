package screenshotgenerator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;

public class Screenshotgenerator {


		public static void generateScreenshot(WebDriver wd,Scenario s) throws IOException{


			File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);

			InputStream stream=new FileInputStream(src);//input stream will store as 1s and 0s format

			s.embed(IOUtils.toByteArray(stream), "image/jpeg");//only for Utils import from apache as they have dynamic file rest all import java file 
/*embed-embed the SS to the specific scenario. tobytearray is used to converts that 01 format to html format*/

			}
	}


