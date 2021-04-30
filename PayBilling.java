package Guru99telecom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PayBilling  {
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

		String t1 = driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[3]/div[2]/h3/a")).getText();
		System.out.println(t1);
		if (t1.contains("Pay Billing")) {
			System.out.println("present");
			driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[3]/div[2]/h3/a")).click();
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
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[6]/input")).click();
		System.out.println("clicked");

		String t3 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/h3")).getText();
		System.out.println(t3);

		String t4 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[4]/td[1]")).getText();
		System.out.println(t4);
		if (t4.contains("Tariff Plan Amount")) {
			System.out.println("present");
			String t5 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[4]/td[2]")).getText();
			System.out.println(t4 + " -- > " + t5);

		} else {
			System.out.println("not present");
		}

		String t6 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[5]/td[1]/b")).getText();
		System.out.println(t6);
		if (t6.contains("Usage Charges")) {
			System.out.println("present");
			String t7 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[5]/td[2]/b")).getText();
			System.out.println(t6 + " -- > " + t7);

		} else {
			System.out.println("not present");
		}

		String t8 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[6]/td[1]/b")).getText();
		System.out.println(t8);
		if (t8.contains("Total Bill")) {
			System.out.println("present");
			String t9 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[6]/td[2]/b")).getText();
			System.out.println(t8 + " -- > " + t9);

		} else {
			System.out.println("not present");
		}

		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/a[2]")).click();
		
		String t10 = driver.getTitle();
		System.out.println(t10);
		System.out.println("now you have come back to HOME page ");
		System.out.println("Task 7 complete");
	}

	@After
	public void end() {
		driver.quit();

	}
}