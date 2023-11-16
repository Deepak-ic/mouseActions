package org.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Deepak\\Documents\\mouseActions\\drivers\\msedgedriver.exe");
	WebDriver d = new EdgeDriver();
	d.get("https://www.flipkart.com/");
	d.manage().window().maximize();
	Actions a = new Actions(d);
	Thread.sleep(3000);
	WebElement home = d.findElement(By.xpath("(//div[@class='YBLJE4'])[5]"));
	a.moveToElement(home).perform();
	WebElement bathtwl = d.findElement(By.xpath("//a[text()='Bath linen']"));
	bathtwl.click();
}
}