package com.cattlog.module.sel.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleRul {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/cqr/geckodriver.exe");
	       WebDriver driver = new FirefoxDriver();// 这里我们可以使用firefox来运行测试用例
	       driver.get("http://www.126.com");
	       System.out.println("Before login================"); 
	       //获取当前的 title 和 url 
	   //    System.out.printf("title of current page is %s\n", driver.getTitle());
	     //  System.out.printf("url of current page is %s\n", driver.getCurrentUrl());
	     //登录 126 邮箱
	       driver.findElement(By.id("idInput")).clear(); 
	       driver.findElement(By.id("idInput")).sendKeys("testingwtb");
	       driver.findElement(By.id("pwdInput")).clear(); 
	       driver.findElement(By.id("pwdInput")).sendKeys("a123456"); 
	       driver.findElement(By.id("loginBtn")).click();


	}

}
