package SeleniumInterviewProblem;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateZiraIdMimu {
	
	public WebDriver driver;
	public WebDriverManager WebDriverManager;

	
	public String loginPageURL="https://automateme.atlassian.net/";
	public String summery="MimuTest2";
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(loginPageURL);
	}
	
	@AfterMethod
	public void tear() {
		driver.quit();;
	}
	
	@Test
	public void login() throws InterruptedException {
		WebElement Un=driver.findElement(By.id("username"));
		Un.sendKeys("uwillgetjob@gmail.com");
		WebElement contButton=driver.findElement(By.xpath("//span[text()='Continue']"));
		contButton.click();
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("mimudutta");
		WebElement login_button=driver.findElement(By.xpath("//span[text()='Log in']"));
		login_button.click();
		
		
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath("//span[text()='automateme']"))));
		driver.findElement(By.xpath("//span[text()='automateme']/parent::*/img")).click();
		System.out.println("clicked Succesfully on project");
		

		new WebDriverWait(driver, 10).until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath("//span[text()='Create']"))));
		driver.findElement(By.xpath("//span[text()='Create']")).click();
		System.out.println("clicked Succesfully on create button");
		

		driver.findElement(By.id("summary")).sendKeys(summery);
		System.out.println("Entered Text successfully on summery");
		
		
		WebElement cmpdropDown=driver.findElement(By.xpath("(//span[@class=\"icon noloading drop-menu\"])[1]"));
		cmpdropDown.click();
		System.out.println("clicked on component dropdown");
		driver.findElement(By.xpath("//textarea[@id=\"components-textarea\"]")).sendKeys("WebBased Component");;
		
		
		System.out.println("item selected component dropdown");
		
		driver.findElement(By.id("description")).sendKeys("new Description for Mimu test");
		System.out.println("Description is entered.");
		
		
		WebElement date_picker=driver.findElement(By.xpath("//input[@class=\"text medium-field\"]/parent::*/a"));
		date_picker.click();
		driver.findElement(By.xpath("(//td[text()='April, 2021']/ancestor::thead/following-sibling::tbody/tr/td[text()='23'])[1]")).click();
		System.out.println("date is selected");
		
	
		driver.findElement(By.xpath("//input[@id=\"create-issue-submit\"]")).click();
		System.out.println("clicked on create button and bug is created");
		
		String ack_msg=driver.findElement(By.xpath("//div[@class=\"aui-flag\"]/div/a")).getText();
		System.out.println("TicketNo. and Summery from pop-up message====>"+ack_msg);
		
		driver.navigate().refresh();
		WebElement autText=driver.findElement(By.xpath("//a[text()='"+summery+"']/parent::*/parent::*/preceding-sibling::td[1]/div/div/a/div"));
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(autText));
		autText.getText();
		System.out.println("TicketNo. from Webtable=========>:"+autText.getText());	
	}
}
