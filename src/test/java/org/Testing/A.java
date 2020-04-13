package org.Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
	@Parameters({"username","password"})
	@Test
	public void test1(String s1, String s2) {
		System.setProperty("webdriver.chrome.driver", "E:\\Myworkouts\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);
		driver.findElement(By.id("loginbutton")).click();
	}

}
