package org.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge14 {
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
		WebElement fasn = d.findElement(By.xpath("(//div[@class='_1ch8e_'])[1]"));
		a.moveToElement(fasn).perform();
		WebElement womenfoot = d.findElement(By.xpath("//a[text()='Women Footwear']"));
		a.moveToElement(womenfoot).perform();
		WebElement flats = d.findElement(By.xpath("//a[text()='Women Flats']"));
		a.click(flats).perform();
	}

}
