package com.mensajede.prueba;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MensajeAzimutTest {
	
private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pastebin.com/");
				
	}
	
	@Test 
	public void testAzimutMensaje() {
		
		WebElement searchbox = driver.findElement(By.id("postform-text"));
		
		searchbox.clear();
		
		searchbox.sendKeys("Esto   es   una   prueba   desde   Selenium.   Mi   nombre   es   Oscar,   y   esta   es   la   fecha   de   este  momento: <Timestamp>");
		
		searchbox.submit();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

		
	}
	
	@After 
	public void tearDown() {
		//driver.quit();
	}

}
