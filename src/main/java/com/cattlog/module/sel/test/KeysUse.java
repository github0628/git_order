package com.cattlog.module.sel.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysUse {
   public static void main(String[] args) {
	   System.setProperty("webdriver.gecko.driver", "C:/cqr/geckodriver.exe");
       WebDriver driver = new FirefoxDriver();// 这里我们可以使用firefox来运行测试用例
       driver.get("https://www.baidu.com"); 
       WebElement input = driver.findElement(By.id("kw"));
     //输入框输入内容 
       input.sendKeys("seleniumm");
     input.sendKeys(Keys.BACK_SPACE);
}
}
