package org.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\Deepak\\\\Documents\\\\mouseActions\\\\drivers\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.shopclues.com/wholesale.html");
		d.manage().window().maximize();
		Actions a = new Actions(d);
		WebElement sprt = d.findElement(By.xpath("//a[text()='Sports & More']"));
		a.moveToElement(sprt).perform();
		Thread.sleep(4000);
		WebElement wgnr = d.findElement(By.xpath("//a[text()='Weight Gainers']"));
		a.click(wgnr).perform();
	}

}