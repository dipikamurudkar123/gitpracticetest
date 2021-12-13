package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverclass {

	
		String chromeDriverPath="C:\\Users\\dipika.murudkar\\MyPracticeProject\\RestAssuredProject\\src\\main\\resources\\Driver\\chromedriver.exe";
		
		public void setbrowsr() {
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);  
		WebDriver driver=new ChromeDriver();  
		driver.navigate().to("http://www.javatpoint.com/");  
		  driver.manage().window().maximize();  
		}
	

}