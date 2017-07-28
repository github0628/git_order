package com.cattlog.module.sel.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaiduData {
	Log log =LogFactory.getLog(BaiduData.class);
	
	public static void baiduTest(String testData) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:/cqr/geckodriver.exe");
	       WebDriver driver = new FirefoxDriver();
	       driver.get("https://www.baidu.com");
	       driver.get("http://www.baidu.com");
	       driver.findElement(By.id("kw")).sendKeys(testData); 
	       driver.findElement(By.id("su")).click(); 
	       Thread.sleep(2000);
	     //  driver.close();

		
		
	}
	
	
  public static void readTxtFile(String path){
	  try{
		  String encoding="GBK";
    File file=new File(path);
    if(file.isFile()&&file.exists()){
    	InputStreamReader read=new InputStreamReader(new FileInputStream(file),encoding);
    	BufferedReader bufferedReader=new BufferedReader(read);
    	String lineTxt=null;
    	while((lineTxt=bufferedReader.readLine())!=null){
    		System.out.println(lineTxt);
    	  baiduTest(lineTxt);
    	}
    	read.close();
    	
    }
    else{
    	System.out.println("找不到指定的文件");
    }
    
	  }
	  catch(Exception e){
		  
		  System.out.println("读取文件失败！");
	  }
  }
  public static void main(String[] args) {
	  String path="C:/cqr/test.txt";
	readTxtFile(path);
}
}
