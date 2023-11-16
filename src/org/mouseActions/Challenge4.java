package org.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\Deepak\\\\Documents\\\\mouseActions\\\\drivers\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.shopclues.com/wholesale.html");
		d.manage().window().maximize();
		Actions a = new Actions(d);
		WebElement mob = d.findElement(By.xpath("//a[text()='Mobiles & More']"));
		a.moveToElement(mob).perform();
		Thread.sleep(4000);
		WebElement apple = d.findElement(By.xpath("//a[text()='Apple']"));
		a.click(apple).perform();
	}

}
