package org.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Deepak\\Documents\\mouseActions\\drivers\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.snapdeal.com/");
		d.manage().window().maximize();
		Actions a = new Actions(d);
		WebElement women = d.findElement(By.xpath("(//span[@class='catText'])[2]"));
		a.moveToElement(women).perform();
		WebElement foot = d.findElement(By.xpath("//span[text()='Heels']"));
		a.click(foot).perform();
	}

}
