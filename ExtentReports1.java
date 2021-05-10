package Guru99telecom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReports1 {

	@Test
	public void AddCustomers() throws IOException {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(
				"C:\\Users\\Trainee390\\eclipse-workspace Selenium\\Selenium\\Reports\\Selenium.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger1 = extent.createTest("testAddCustomers");
		logger1.log(Status.INFO, "Working well");
		logger1.log(Status.PASS, "Test case is passed");
		logger1.pass("Pass", MediaEntityBuilder
				.createScreenCaptureFromPath("C:\\Users\\Trainee390\\eclipse-workspace Selenium\\Selenium\\Reports\\logo1.jpg")
				.build());
		extent.flush();

		ExtentTest logger2 = extent.createTest("testAddCustomersReset");
		logger2.log(Status.INFO, "Working well");
		logger2.log(Status.PASS, "Test case is passed");
		logger2.pass("Pass", MediaEntityBuilder
				.createScreenCaptureFromPath("C:\\Users\\Trainee390\\eclipse-workspace Selenium\\Selenium\\Reports\\logo2.jpg")
				.build());
		extent.flush();

		ExtentTest logger3 = extent.createTest("testAddTariffinPlanInvalid");
		logger3.log(Status.INFO, "Working well");
		logger3.log(Status.PASS, "Test case is passed");
		logger3.pass("Pass", MediaEntityBuilder
				.createScreenCaptureFromPath("C:\\Users\\Trainee390\\eclipse-workspace Selenium\\Selenium\\Reports\\logo3.jpg")
				.build());
		extent.flush();

		ExtentTest logger4 = extent.createTest("testAddTariffinPlanReset");
		logger4.log(Status.INFO, "Working well");
		logger2.log(Status.PASS, "Test case is passed");
		logger4.pass("Pass", MediaEntityBuilder
				.createScreenCaptureFromPath("C:\\Users\\Trainee390\\eclipse-workspace Selenium\\Selenium\\Reports\\logo4.jpg")
				.build());
		extent.flush();

		ExtentTest logger5 = extent.createTest("AddTariffPlanAToCustomerInvalid");
		logger5.log(Status.INFO, "Working well");
		logger5.log(Status.PASS, "Test case is passed");
		logger5.pass("Pass", MediaEntityBuilder
				.createScreenCaptureFromPath("C:\\Users\\Trainee390\\eclipse-workspace Selenium\\Selenium\\Reports\\logo5.jpg")
				.build());
		extent.flush();

		ExtentTest logger6 = extent.createTest("AddTariffPlanAToCustomerValid");
		logger6.log(Status.INFO, "Working well");
		logger6.log(Status.PASS, "Test case is passed");
		logger6.pass("Pass", MediaEntityBuilder
				.createScreenCaptureFromPath("C:\\Users\\Trainee390\\eclipse-workspace Selenium\\Selenium\\Reports\\logo6.jpg")
				.build());
		extent.flush();

		ExtentTest logger7 = extent.createTest("AddTariffPlanAToCustomerEmpty");
		logger7.log(Status.INFO, "Working well");
		logger7.log(Status.PASS, "Test case is passed");
		logger7.pass("Pass", MediaEntityBuilder
				.createScreenCaptureFromPath("C:\\Users\\Trainee390\\eclipse-workspace Selenium\\Selenium\\Reports\\logo7.jpg")
				.build());
		extent.flush();

		ExtentTest logger8 = extent.createTest("payBillingEmpty");
		logger8.log(Status.INFO, "Working well");
		logger8.log(Status.PASS, "Test case is passed");
		logger8.pass("Pass", MediaEntityBuilder
				.createScreenCaptureFromPath("C:\\Users\\Trainee390\\eclipse-workspace Selenium\\Selenium\\Reports\\logo8.jpg")
				.build());
		extent.flush();

		ExtentTest logger9 = extent.createTest("payBillingInvalid");
		logger9.log(Status.INFO, "Working well");
		logger9.log(Status.PASS, "Test case is passed");
		logger9.pass("Pass", MediaEntityBuilder
				.createScreenCaptureFromPath("C:\\Users\\Trainee390\\eclipse-workspace Selenium\\Selenium\\Reportss\\logo9.jpg")
				.build());
		extent.flush();

		ExtentTest logger10 = extent.createTest("testAddCustomersInvalid");
		logger10.log(Status.FAIL, "Title verified");
		logger10.fail("Failed because of some issues", MediaEntityBuilder
				.createScreenCaptureFromPath("C:\\Users\\Trainee390\\eclipse-workspace Selenium\\Selenium\\Reports\\logo10.jpg")
				.build());
		extent.flush();

	
	}

}
