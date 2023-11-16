package org.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge15 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Deepak\\Documents\\mouseActions\\drivers\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		Actions a = new Actions(d);
		Thread.sleep(3000);
		WebElement x = d.findElement(By.xpath("//span[text()='✕']"));
		a.click(x).perform();
		WebElement toy = d.findElement(By.xpath("(//div[@class='_1ch8e_'])[4]"));
		a.moveToElement(toy).perform();
		WebElement toys = d.findElement(By.xpath("//a[text()='Toys & School Supplies']"));
		a.moveToElement(toys).perform();
		WebElement remote = d.findElement(By.xpath("//a[text()='Remote Control Toys']"));
		a.click(remote).perform();
	}

}
