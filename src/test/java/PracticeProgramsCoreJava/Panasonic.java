package PracticeProgramsCoreJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Panasonic {

	public WebDriver driver;
	public WebDriverManager WebDriverManager;
	
	private String loginPageURL="https://automateme.atlassian.net/";
	
	private String loginpage_email="username";
	private String loginpage_pass="password";
	
	@BeforeMethod
	public  void initialization(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(loginPageURL);
	}
	
	@Test
	public void login(String loginpage_email, String Pass) {
		driver.findElement(By.id(loginpage_email));
		driver.findElement(By.id(Pass));
	}
	

}
