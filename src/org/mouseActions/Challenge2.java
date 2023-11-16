package org.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge2 extends Challenge1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Deepak\\Documents\\mouseActions\\drivers\\msedgedriver.exe");
		WebDriver dr = new EdgeDriver();
		dr.get("https://www.amazon.in/");
		dr.manage().window().maximize();
		WebElement prm = dr.findElement(By.xpath("//span[text()='Prime']"));
		Actions a = new Actions(dr);
		a.moveToElement(prm).perform();
		WebElement joinprm = dr.findElement(By.xpath("//div[@class='prime-button-try']"));
		joinprm.click();
		//a.moveToElement(joinprm).perform();
		//a.click().perform();
	}

}
