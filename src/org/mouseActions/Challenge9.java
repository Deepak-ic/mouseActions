package org.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\\\Users\\\\Deepak\\\\Documents\\\\mouseActions\\\\drivers\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.homedepot.com/");
		d.manage().window().maximize();
		Actions a = new Actions(d);
		WebElement alldpt = d.findElement(By.xpath("//a[text()='All Departments']"));
		a.moveToElement(alldpt).perform();
		WebElement paint = d.findElement(By.xpath("//a[text()='Paint']"));
		a.moveToElement(paint).perform();
		WebElement interior = d.findElement(By.xpath("//a[text()='Interior Paint']"));
		a.moveToElement(interior).perform();
		WebElement cp = d.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		a.click(cp).perform();
	}

}
