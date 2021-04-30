package Guru99telecom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AddTariffPlanCustomer  {
	WebDriver driver;

	@Before
	public void open() {
		driver = BrowserFactory.StartBrowser("Edge", "http://demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();
	}

	@Test
	public void run() {
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Guru99 Telecom")) {
			System.out.println("present");
		} else {
			System.out.println("not present");
		}

		String t1 = driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[2]/h3/a")).getText();
		System.out.println(t1);
		if (t1.contains("Add Tariff Plan to Customer")) {
			System.out.println("present");
			driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[2]/h3/a")).click();
			;
			System.out.println("clicked");

		} else {
			System.out.println("not present");
		}
		
		String t2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[2]/h3")).getText();
		System.out.println(t2);
		if (t2.contains("Enter Your Customer ID")) {
			System.out.println("present");
			driver.findElement(By.id("customer_id")).sendKeys("496104");
			System.out.println("value entered");
			
		} else {
			System.out.println("not present");
		}
		
		System.out.println("ready to submit");
		driver.findElement(By.name("submit")).click();
		System.out.println("submitted ...");
		
		////// rember it 
		String t3 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/p/font")).getText();
		System.out.println(t3);
		if (t3.contains("INACTIVE")) { // see the text 
			System.out.println("present");

		} else {
			System.out.println("not present");
		}
		
		/////////////////
		
		String t4 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[1]/table/thead/tr/th[2]")).getText();
		System.out.println(t4);
		if (t4.contains("Monthly Rental")) {
			System.out.println("present");
			String t5 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[1]/table/tbody/tr/td[2]")).getText();
			System.out.println( t4 +  " -- > "  + t5 );

		} else {
			System.out.println("not present");
		}
		
		String t6 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[1]/table/thead/tr/th[3]")).getText();
		System.out.println(t6);
		if (t6.contains("Local Minutes")) {
			System.out.println("present");
			String t7 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[1]/table/tbody/tr/td[3]")).getText();
			System.out.println( t6 +  " -- > "  + t7 );

		} else {
			System.out.println("not present");
		}
		
		String t8 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[1]/table/thead/tr/th[4]")).getText();
		System.out.println(t8);
		if (t8.contains("International Minutes")) {
			System.out.println("present");
			String t9 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[1]/table/tbody/tr/td[4]")).getText();
			System.out.println( t8 +  " -- > "  + t9 );

		} else {
			System.out.println("not present");
		}
		
		String t10 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[1]/table/thead/tr/th[5]")).getText();
		System.out.println(t10);
		if (t10.contains("SMS Pack")) {
			System.out.println("present");
			String t11 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[1]/table/tbody/tr/td[5]")).getText();
			System.out.println( t10 +  " -- > "  + t11 );

		} else {
			System.out.println("not present");
		}
		
		String t12 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[1]/table/thead/tr/th[6]")).getText();
		System.out.println(t12);
		if (t12.contains("Per Local Minutes Charges")) {
			System.out.println("present");
			String t13 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[1]/table/tbody/tr/td[6]")).getText();
			System.out.println( t12 +  " -- > "  + t13 );

		} else {
			System.out.println("not present");
		}
		
		String t14 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[1]/table/thead/tr/th[7]")).getText();
		System.out.println(t14);
		if (t14.contains("Per International Minutes Charges")) {
			System.out.println("present");
			String t15 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[1]/table/tbody/tr/td[7]")).getText();
			System.out.println( t14 +  " -- > "  + t15 );

		} else {
			System.out.println("not present");
		}
		
		String t16 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[1]/table/thead/tr/th[8]")).getText();
		System.out.println(t16);
		if (t16.contains("Per SMS Charges")) {
			System.out.println("present");
			String t17 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[1]/table/tbody/tr/td[8]")).getText();
			System.out.println( t16 +  " -- > "  + t17 );

		} else {
			System.out.println("not present");
		}
		
		System.out.println("ready to submit");
		driver.findElement(By.name("submit")).click();
		System.out.println("submitting...");
		
		
		String t18 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/h2")).getText();
		System.out.println(t18);
		if (t18.contains("Congratulation Tariff Plan assigned")) {
			System.out.println("present");
			driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li/a")).click();
			System.out.println("now you have come back to HOME page ");
			System.out.println("Task 5 complete");
		} else {
			System.out.println("not present");
		}
		
		
	}

	@After
	public void end() {
		driver.quit();

	}
}
