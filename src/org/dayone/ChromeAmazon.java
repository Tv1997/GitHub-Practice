package org.dayone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeAmazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\Desktop\\MIT\\eclipse\\ExternalJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		String Title = driver.getTitle();
		System.out.println(Title);
	}
}
