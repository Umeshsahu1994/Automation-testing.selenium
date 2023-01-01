package genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	public void getscreenshot(WebDriver driver,String name) throws IOException {
		Date d1=new Date();
		String currentdate = d1.toString().replaceAll(":", "-");
		
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des=new File(AutoConstant.photopath+currentdate+name+".png");
		FileUtils.copyFile(src, des);
		
	}
}
