package com.cattlog.module.sel.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framesss {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/cqr/geckodriver.exe");
	       WebDriver driver = new FirefoxDriver();
           login(driver);
//           logout(driver);
		   

	}
	public static void login(WebDriver driver){
		driver.get("https://mail.qq.com/");
		driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div/div[2]/form/div[1]/div/input"));//.sendKeys("809155736");
//		driver.findElement(By.id("p")).clear();
//		driver.findElement(By.id("p")).sendKeys("chenqiaorui.");
//		driver.findElement(By.id("login_button")).submit();		
	}
	public static void logout(WebDriver driver){
		driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div[1]/div[1]/div[1]/a[3]")).click();
		
	}
}
