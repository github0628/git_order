package com.cattlog.module.sel.test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBaidu {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:/cqr/geckodriver.exe");
		driver = new FirefoxDriver();// 这里我们可以使用firefox来运行测试用例
		baseUrl = "https://www.baidu.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testCase() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.id("kw")).clear();
		driver.findElement(By.id("kw")).sendKeys("junit");
		driver.findElement(By.id("su")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		assertEquals(title, "junit_百度搜索");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

}
