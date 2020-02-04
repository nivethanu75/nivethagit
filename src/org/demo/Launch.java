package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini\\eclipse-workspace\\A\\dri\\chromedriver.exe");
		WebDriver dr =  new ChromeDriver();
		dr.get("https://adactin.com/HotelApp/");
		
		
	}
}

