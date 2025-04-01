package screenshort;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshort {

 public static void screenshort(WebDriver driver,String name) throws IOException
{
       File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File("./test2/"+name+".jpg");
        Files.copy(screenshotAs.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Screenshot saved successfully!");
}

		
}

