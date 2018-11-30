package com.headlessbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJSDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("phantomjs.binary.path", "C:\\selelib\\phantomjs.exe");
	WebDriver driver= new PhantomJSDriver();
	driver.get("https://www.freecrm.com/");
	String tittle=driver.getTitle();
	System.out.println(tittle);
	
	driver.findElement(By.name("username")).sendKeys("naveenk");
	driver.findElement(By.name("password")).sendKeys("test@123");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(6000);

	String s2 =driver.getTitle();
	System.out.println(s2);
	
}
}
