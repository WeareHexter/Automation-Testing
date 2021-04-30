package Guru99telecom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddTariffPlanInvalid {
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

		String t1 = driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[3]/div[1]/h3/a")).getText();
		System.out.println(t1);
		if (t1.contains("Add Tariff Plan")) {
			System.out.println("present");
			driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[3]/div[1]/h3/a")).click();
			;
			System.out.println("clicked");

		} else {
			System.out.println("not present");
		}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		String t2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/h3")).getText();
		System.out.println(t2);
		if (t2.contains("Monthly Rental")) {
			System.out.println("present");
			driver.findElement(By.id("rental1")).sendKeys("15ky0");
			System.out.println("value entered");

		} else {
			System.out.println("not present");
		}
////////////
		String t3 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[6]/h3")).getText();
		System.out.println(t3);
		if (t3.contains("Free Local Minutes")) {
			System.out.println("present");
			driver.findElement(By.id("local_minutes")).sendKeys("15ad0");
			System.out.println("value entered");

		} else {
			System.out.println("not present");
		}
		///////
		String t4 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[11]/h3")).getText();
		System.out.println(t4);
		if (t4.contains("Free International Minutes")) {
			System.out.println("present");
			driver.findElement(By.id("inter_minutes")).sendKeys("15fr0");
			System.out.println("value entered");

		} else {
			System.out.println("not present");
		}
		//////
		String t5 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[16]/h3")).getText();
		System.out.println(t5);
		if (t5.contains("Free SMS Pack")) {
			System.out.println("present");
			driver.findElement(By.id("sms_pack")).sendKeys("15cd0");
			System.out.println("value entered");

		} else {
			System.out.println("not present");
		}
		///////////
		String t6 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[21]/h3")).getText();
		System.out.println(t6);
		if (t6.contains("Local Per Minutes Charges")) {
			System.out.println("present");
			driver.findElement(By.id("minutes_charges")).sendKeys("15uk0");
			System.out.println("value entered");

		} else {
			System.out.println("not present");
		}
		////////////
		String t7 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[26]/h3")).getText();
		System.out.println(t7);
		if (t7.contains("International Per Minutes Charges")) {
			System.out.println("present");
			driver.findElement(By.id("inter_charges")).sendKeys("15wf0");
			System.out.println("value entered");

		} else {
			System.out.println("not present");
		}
		///////////

		String t8 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[31]/h3")).getText();
		System.out.println(t8);
		if (t8.contains("SMS Per Charges")) {
			System.out.println("present");
			driver.findElement(By.id("sms_charges")).sendKeys("15af0");
			System.out.println("value entered");

		} else {
			System.out.println("not present");
		}

		System.out.println("ready to submit");

		driver.findElement(By.name("submit")).click();
		System.out.println("submitting ...");

		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		System.out.println(alertMessage);
		alert.accept();

		System.out.println("alert worked !!");
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/a[2]")).click();
		
		String t10 = driver.getTitle();
		System.out.println(t10);

		System.out.println("Task 4 complete");

	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@After
	public void end() {
	//	driver.quit();

	}
}
