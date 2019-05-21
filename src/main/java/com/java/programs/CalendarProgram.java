package com.java.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarProgram {
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.crmpro.com/index.html");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rajasekharpoli");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("poli@123");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		String date ="18-September-2018";
		String datearr[] = date.split("-");
		String day = datearr[0];
		String month = datearr[1];
		String year = datearr[2];
		
		Thread.sleep(3000);
		
		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		
		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
		
		//input[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		
		/*/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]*/
		Thread.sleep(3000);
		String Beforexpath ="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td/table/tbody/tr[";
		String Afterxpath="]/td[";
		
		int totalweekdays =7;
		for(int rowNum=2; rowNum<=7;rowNum++) {
			for(int colNum=1;colNum<=totalweekdays;colNum++) {
				String dayval = driver.findElement(By.xpath(Beforexpath+rowNum+Afterxpath+colNum+"]")).getText();
				System.out.println(dayval);
				if(dayval.equals(day)) {
					driver.findElement(By.xpath(Beforexpath+rowNum+Afterxpath+colNum+"]")).click();
				}
			}
		}
	}

}
