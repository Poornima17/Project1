package org.read;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Exec extends Baseclass{

	public static void main(String[] args) {
		launch("https://www.facebook.com/");
		url();
		WebElement user=driver.findElement(By.id("email"));
		fill(user,"mail@mail.com");
	    WebElement pass= driver.findElement(By.id("pass"));
	    fill(pass,"123344");
	    WebElement btn = driver.findElement(By.id("login"));
	    klik(btn);
	    kill();
	}

}
