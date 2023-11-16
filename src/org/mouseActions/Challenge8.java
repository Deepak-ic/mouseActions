package org.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\\\Users\\\\Deepak\\\\Documents\\\\mouseActions\\\\drivers\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.homedepot.com/");
		d.manage().window().maximize();
		Actions a = new Actions(d);
		WebElement alldpt = d.findElement(By.xpath("//a[text()='All Departments']"));
		a.moveToElement(alldpt).perform();
		WebElement air = d.findElement(By.xpath("//a[text()='Heating, Cooling & Air Quality']"));
		a.moveToElement(air).perform();
		WebElement aircd = d.findElement(By.xpath("//a[text()='Air Conditioners']"));
		a.moveToElement(aircd).perform();
		WebElement pac = d.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		a.click(pac).perform();
	}

}
