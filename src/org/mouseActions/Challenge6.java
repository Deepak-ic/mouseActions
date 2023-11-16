package org.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\Deepak\\\\Documents\\\\mouseActions\\\\drivers\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://lh.inmakesedu.com/home");
		d.manage().window().maximize();
		Actions a = new Actions(d);
		WebElement course = d.findElement(By.xpath("//ul[@class='navbar-nav']"));
		a.moveToElement(course).perform();
		WebElement st = d.findElement(By.xpath("(//div[@class='dropdown dropright p-0 m-0'])[10]"));
		a.moveToElement(st).perform();
		WebElement mc = d.findElement(By.xpath("//a[text()='ST Master Class']"));
		a.click(mc).perform();
	}

}
