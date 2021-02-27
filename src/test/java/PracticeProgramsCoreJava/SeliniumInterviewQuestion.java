package PracticeProgramsCoreJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeliniumInterviewQuestion {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeTest() {
		//System.setProperty("webdriver.gecko.driver","D:\\GeckoDriver\\geckodriver.exe" );   
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
		//capabilities.setCapability("marionette",true);  
		WebDriverManager.firefoxdriver().setup(); //WebDriverManager to invoke browsers directly without exe file from local
		WebDriver driver= new FirefoxDriver();  
		driver.manage().window().maximize();
		driver.navigate().to("http://example.com/doc.html");
	}
	
	@Test
	public void caseOne() {
		WebElement a=driver.findElement(By.xpath("//a[text()='terms and conditions']"));
		a.click();
		String currentTab=driver.getWindowHandle();
		for(String tab:driver.getWindowHandles()) {
			if(!tab.equals(currentTab)) {
				driver.switchTo().window(tab);
				//driver.findElement(By.id("accept").click();
			}				
		}
		driver.switchTo().window(currentTab);
		//driver.findElement(By.id("mydocpdf").click();
		//Assert.assertEqual
		
		
	}
	}
	



