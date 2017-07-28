package com.cattlog.module.sel.test;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class Selenium2Example  {
	  Log log=LogFactory.getLog(Selenium2Example.class);
    public static void main(String[] args) {
        // 用Firefox driver创建一个新的的实例
        //注意:其他的代码依赖于界面
        //不执行
        
    	System.setProperty("webdriver.gecko.driver", "C:/cqr/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();// 这里我们可以使用firefox来运行测试用例
        //WebDriver driver = new ChromeDriver(); //这是chrome浏览器的驱动
        //WebDriver driver = new InternetExplorerDriver(); //这是IE浏览器的驱动
       // WebDriver driver = new HtmlUnitDriver(); //这是一个无界面测试模式，不用打开浏览器，通过后台输入来判断测试用例是否通过
        driver.get("https://www.baidu.com/");
        WebElement element = driver.findElement(By.id("kw"));
        element.sendKeys("selenium");
        WebElement element2 = driver.findElement(By.id("su"));
        element2.submit();
        try{
        	Thread.sleep(2000);
        }
        catch(Exception e){
        	e.printStackTrace();
        	
        }
        WebElement element3 = driver.findElement(By.id("kw"));
//        Assert.assertEquals(element3.getAttribute("value"),"");
            element3.clear();
            String a=element3.getAttribute("value");
            System.out.println(a+"-------------");
//      element.sendKeys("852@qq.com");
        // 现在用这个来访问谷歌
//        driver.get("http://123.206.204.103:8080/softslate/Account.do");
        // 也可以用下面的方式访问谷歌
        // driver.navigate().to("http://www.google.com");
        /*全局设置，当元素识别不到的时候，可以接受的最长等待时间。*/  
    //  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);  
      /*全局设置，页面加载的最长等待时间。*/  
     // driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);  

        // 找到文本输入元件的名字
//        WebElement element = driver.findElement(By.id("loginUserName"));
//        element.sendKeys("852@qq.com");
//        Assert.assertEquals(element.getAttribute("value"), "852@qq.com");
//        WebElement element2 = driver.findElement(By.id("loginDecryptedPassword"));
//        element2.sendKeys("8521");
//        WebElement element3 = driver.findElement(By.cssSelector("#loginButton .btn.btn-primary"));
//         element3.click();
//         WebElement element4 = driver.findElement(By.id("billingState"));
//         Select sel = new Select(driver.findElement(ById.cssSelector(".col-sm-8 #billingState")));   
//         sel.selectByValue("Other"); 
        
        // 在搜索框内输入“cheese!”
//        element.sendKeys("Cheese!");

        // 现在递交表格. WebDriver会发现我们的形式元素
//        element.submit();

        // 后台打印输出，检查网页的标题
//        System.out.println("Page title is: " + driver.getTitle());
        
        // 谷歌的搜索是渲染过的动态JavaScript. 等待页面加载，暂停10秒
//        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver d) {
//                return d.getTitle().toLowerCase().startsWith("cheese!");
//            }
//        });
//
//        // Should see: "cheese! - Google Search"
//        System.out.println("Page title is: " + driver.getTitle());
//        
        //关闭浏览器
      //  driver.quit();
    }
}
