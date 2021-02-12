package vtiger_crm_class_testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainClass {
	
	
	@Test
     public	void run() throws Throwable {
    	 
    	 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Datadriven data=new Datadriven();
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(data.getCellData("./Data/inputData.xlsx", "Sheet1",1,0));
		
	}
	

}
