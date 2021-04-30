package Guru99telecom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCustomerInvalid {
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

		String t1 = driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[1]/h3/a")).getText();
		System.out.println(t1);
		if (t1.contains("Add Customer")) {
			System.out.println("present");
			driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[1]/h3/a")).click();
			;
			System.out.println("clicked");

		} else {
			System.out.println("not present");
		}
		String t2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/h3")).getText();
		System.out.println(t2);
		if (t2.contains("Background Check")) {
			System.out.println("present");
		} else {
			System.out.println("not present");
		}

		driver.findElement(By.xpath("//label[text()='Done']")).click();
		System.out.println("clicked the radio buttion");

		String t3 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[3]/h3")).getText();
		System.out.println(t3);
		if (t3.contains("Billing address")) {
			System.out.println("present");
		} else {
			System.out.println("not present");
		}
		
		driver.findElement(By.id("fname")).sendKeys("12345as");
		System.out.println("value entered");
		driver.findElement(By.id("lname")).sendKeys("1231323sw");
		System.out.println("value entered");
		driver.findElement(By.id("email")).sendKeys("Lucifer.Rathor99@gmail.com");
		System.out.println("value entered");
		driver.findElement(By.xpath("//div[@class='12u$']//textarea[1]")).sendKeys("We have paid your bill");
		System.out.println("value entered");
		driver.findElement(By.id("telephoneno")).sendKeys("8571054swsw");
		System.out.println("value entered");
		driver.findElement(By.xpath("(//ul[@class='actions']//input)[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/ul/li/a")).click();
		/*
		* Alert alert = driver.switchTo().alert(); String alertMessage =
		* alert.getText(); System.out.println(alertMessage);
		*/
		driver.switchTo().alert().accept();
		System.out.println("worked");
		System.out.println("Task 2 complete");
		
	}

	@After
	public void end() {
		//driver.quit();

	}
}
