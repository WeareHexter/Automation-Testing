package Guru99telecom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PayBillingInvalid {
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

			driver.findElement(By.id("customer_id")).sendKeys();
			System.out.println("value entered");

		} else {
			System.out.println("not present");
		}
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[6]/input")).click();
		System.out.println("clicked");

		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		System.out.println(alertMessage);
		alert.accept();
		System.out.println("alert work !!");
		System.out.println("Working well and test case is passed");
		System.out.println("Task 8 complete");

	}

	@After
	public void end() {
		driver.quit();

	}
}
