package Guru99telecom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class AddCustomer {
	WebDriver driver;
	 String cID;

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

		driver.findElement(By.id("fname")).sendKeys("Lucifer");
		System.out.println("value entered");
		driver.findElement(By.id("lname")).sendKeys("Rathor");
		System.out.println("value entered");
		driver.findElement(By.id("email")).sendKeys("Lucifer.Rathor99@gmail.com");
		System.out.println("value entered");
		

		driver.findElement(By.xpath("/html/body/section/div/form/div/div[7]/textarea"))
				.sendKeys("India Asia Earth World Milky Way");
		System.out.println("value entered");
		driver.findElement(By.id("telephoneno")).sendKeys("857105412179");
		System.out.println("value entered");
		System.out.println("you are ready to sumbit");

		driver.findElement(By.name("submit")).click();
		System.out.println("submited");

		cID = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[1]/td[2]/h3")).getText();
		System.out.println("you coustomer ID -->");
		System.out.println(cID);

		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/ul/li/a")).click();
		System.out.println("now you have come back to HOME page ");
		System.out.println("Task 1 complete");

	}

	@After
	public void end() {
		driver.quit();

	}
}
