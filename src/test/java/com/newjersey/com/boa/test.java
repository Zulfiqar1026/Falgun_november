package com.newjersey.com.boa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
				
		driver.findElement(By.id("onlineId1")).sendKeys("Falgun");
		Thread.sleep(5000);
		driver.findElement(By.id("passcode1")).sendKeys("Falgun#12345");
		Thread.sleep(10000);
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("forgot-oid-pwd")).click();
//		driver.findElement(By.id("security")).click();
//		driver.findElement(By.id("enroll")).click();
//		driver.findElement(By.id("finCenterLocator")).click();
//		driver.findElement(By.id("apptScheduler")).click();
		
		Thread.sleep(10000);
		
		driver.quit();
		
		
		
		

	}

}