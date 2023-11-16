package org.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Deepak\\Documents\\mouseActions\\drivers\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		Actions a = new Actions(d);
		Thread.sleep(3000);
		WebElement signin = d.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']"));
		a.moveToElement(signin).perform();
		WebElement seller = d.findElement(By.xpath("//span[text()='Your Seller Account']"));
		a.click(seller).perform();
		
	}

}
