package com.cattlog.module.sel.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Elements {
	public static void main(String[] args) {
        
        
    	System.setProperty("webdriver.gecko.driver", "C:/cqr/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();// 这里我们可以使用firefox来运行测试用例
        driver.get("https://www.baidu.com"); 
      //  WebElement element = driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div[3]/a[8]"));
       // element.click();
        
       Actions action=new Actions(driver);
     //  action.clickAndHold(driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div[3]/a[8]"))).perform();
       action.moveToElement(driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div[3]/a[8]"))).perform();
       
//        driver.get("https://www.baidu.com/");
//        WebElement element = driver.findElement(By.id("kw"));
//        element.sendKeys("selenium");
//        WebElement element2 = driver.findElement(By.id("su"));
//        element2.submit();
//        try{
//        	Thread.sleep(2000);
//        }
//        catch(Exception e){
//        	e.printStackTrace();
//        	
//        }
//        WebElement element3 = driver.findElement(By.id("kw"));

	}
}
