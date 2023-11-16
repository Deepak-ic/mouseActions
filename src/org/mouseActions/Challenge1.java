package org.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Deepak\\Documents\\mouseActions\\drivers\\msedgedriver.exe");
		WebDriver dri = new EdgeDriver();
		dri.get("https://demo.guru99.com/test/drag_drop.html");
		dri.manage().window().maximize();
		Actions a = new Actions(dri);
		WebElement bank = dri.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement bankplc = dri.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(bank, bankplc).perform();
		WebElement salesnm = dri.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement salesplc = dri.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(salesnm, salesplc).perform();
		Thread.sleep(3000);
		WebElement no = dri.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement debamt = dri.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(no, debamt).perform();
		WebElement crdt = dri.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement crdiamt = dri.findElement(By.xpath("//li[@class='placeholder']"));
		a.dragAndDrop(crdt, crdiamt).perform();

	}

}
