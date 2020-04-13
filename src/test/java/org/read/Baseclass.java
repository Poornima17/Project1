
package org.read;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

		static WebDriver driver;
		public static void launch(String s) {
			System.setProperty("webdriver.chrome.driver","E:\\Myworkouts\\Selenium\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(s);
		}
		public static void url() {
			String u=driver.getCurrentUrl();
			System.out.println(u);
			}
		public static void klik(WebElement w) {
			w.click();
		}
		public static void fill(WebElement w,String s) {
			w.sendKeys(s);
		}
		public static void kill() {
			driver.quit();
		}

	}


