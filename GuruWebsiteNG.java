package Guru99telecom;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GuruWebsiteNG {
           
           WebDriver driver;
           public String tag1;
           
           @BeforeMethod
           public void setUp()
           {
                      System.setProperty("webdriver.edge.driver", "C:\\Users\\Trainee390\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
        System.out.println("Browser is opened");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.MILLISECONDS);
        driver.get("http://demo.guru99.com/telecom/index.html");
        driver.manage().deleteAllCookies();
        System.out.println("URL is opened");
           }
           
           @Test(priority=1, groups="AddCustomer")
           public void testAddCustomers()
           {
                      driver.findElement(By.xpath("(//a[@href='addcustomer.php'])[1]")).click();
                   
                   driver.findElement(By.xpath("(//div[@class='2u 12u$(small)']//label)[1]")).click();
           
                   driver.findElement(By.id("fname")).sendKeys("Lucifer");
                   driver.findElement(By.id("lname")).sendKeys("Rathor");
                   driver.findElement(By.id("email")).sendKeys("Lucifer.Rathor99@gmail.com");
                   driver.findElement(By.xpath("//div[@class='12u$']//textarea[1]")).sendKeys("We have paid your bill");
                   driver.findElement(By.id("telephoneno")).sendKeys("8571054121");
                   driver.findElement(By.xpath("(//ul[@class='actions']//input)[1]")).click();
                   tag1 = driver.findElement(By.tagName("h3")).getTagName();
                   System.out.println(tag1);
                   if(tag1.contains("h3"))
                   {
                      System.out.println(tag1);
                   }
                   driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/ul/li/a")).click();
                   System.out.println("Working well and test case is passed");
                   
           }
           
           
           @Test(priority=2, groups="AddCustomer")
           public void testAddCustomersInvalid()
           {
                      driver.findElement(By.xpath("(//a[@href='addcustomer.php'])[1]")).click();
        
        driver.findElement(By.xpath("(//div[@class='2u 12u$(small)']//label)[1]")).click();
        driver.findElement(By.id("fname")).sendKeys("12345as");
        driver.findElement(By.id("lname")).sendKeys("1231323sw");
        driver.findElement(By.id("email")).sendKeys("Lucifer.Rathor99@gmail.com");
        driver.findElement(By.xpath("//div[@class='12u$']//textarea[1]")).sendKeys("We have paid your bill");
        driver.findElement(By.id("telephoneno")).sendKeys("8571054swsw");
        driver.findElement(By.xpath("(//ul[@class='actions']//input)[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/ul/li/a")).click();
                      /*
                      * Alert alert = driver.switchTo().alert(); String alertMessage =
                      * alert.getText(); System.out.println(alertMessage);
                      */
        
        driver.switchTo().alert().accept();
        
        System.out.println("Working well and test case is passed");
           }
           
           
           @Test(priority=5, groups="AddTariffin")
           public void testAddTariffinPlanInvalid()
           {
driver.findElement(By.xpath("(//a[@href='addtariffplans.php'])[1]")).click();
        
        driver.findElement(By.id("rental1")).sendKeys("aw1");
        driver.findElement(By.id("local_minutes")).sendKeys("hys2");
        driver.findElement(By.id("inter_minutes")).sendKeys("de3");
        driver.findElement(By.id("sms_pack")).sendKeys("s3e");
        driver.findElement(By.id("minutes_charges")).sendKeys("23ee");
        driver.findElement(By.id("inter_charges")).sendKeys("s3");
        driver.findElement(By.id("sms_charges")).sendKeys("2332ww");
        driver.findElement(By.xpath("(//ul[@class='actions']//input)[1]")).click();
        
                      
                        Alert alert = driver.switchTo().alert(); String alertMessage=
                        alert.getText(); System.out.println(alertMessage); alert.accept();
                      
           }
           
           @Test(priority=6, groups="AddTariffin")
           public void testAddTariffinPlanReset()
           {
                      driver.findElement(By.xpath("(//a[@href='addtariffplans.php'])[1]")).click();
                      driver.findElement(By.id("rental1")).sendKeys("aw1");
        driver.findElement(By.id("local_minutes")).sendKeys("hys2");
        driver.findElement(By.id("inter_minutes")).sendKeys("de3");
        driver.findElement(By.id("sms_pack")).sendKeys("s3e");
        driver.findElement(By.id("minutes_charges")).sendKeys("23ee");
        driver.findElement(By.id("inter_charges")).sendKeys("s3");
        driver.findElement(By.id("sms_charges")).sendKeys("2332ww");
        driver.findElement(By.xpath("(//ul[@class='actions']//input)[1]")).click();
        
                      
                        Alert alert = driver.switchTo().alert(); String alertMessage=
                        alert.getText(); System.out.println(alertMessage); alert.accept();
                        driver.findElement(By.xpath("(//ul[@class='actions']//input)[2]")).click();
           }
           
           @Test(priority=3, groups="AddCustomer")
           public void testAddCustomersReset()
           {
driver.findElement(By.xpath("(//a[@href='addcustomer.php'])[1]")).click();
        
        driver.findElement(By.xpath("(//div[@class='2u 12u$(small)']//label)[1]")).click();
        driver.findElement(By.id("fname")).sendKeys("12345as");
        driver.findElement(By.id("lname")).sendKeys("1231323sw");
        driver.findElement(By.id("email")).sendKeys("Lucifer.Rathor99@gmail.com");
        driver.findElement(By.xpath("//div[@class='12u$']//textarea[1]")).sendKeys("We have paid your bill");
        driver.findElement(By.id("telephoneno")).sendKeys("8571054swsw");
        driver.findElement(By.xpath("(//ul[@class='actions']//input)[2]")).click();
        System.out.println("Working well and Test Case is Passed");
           }
           
           @Test(priority=7, groups="AddPlan")
           public void AddTariffPlanAToCustomerInvalid()
           {
                          driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[2]/h3/a")).click();
                                 driver.findElement(By.id("customer_id")).sendKeys("7362322");
                                 driver.findElement(By.xpath("(//div[@class='3u 12u$(small)']//input)[2]")).click();
                                 System.out.println("Working well and test case is passed");
           }
           
           @Test(priority=8, groups="AddPlan")
           public void AddTariffPlanAToCustomerValid()
           {
                          driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[2]/h3/a")).click();
                                 driver.findElement(By.id("customer_id")).sendKeys("681217");
                                 driver.findElement(By.xpath("(//div[@class='3u 12u$(small)']//input)[2]")).click();
                                 System.out.println("Working well and test case is passed");
           }
           
           @Test(priority=9, groups="AddPlan")
           public void AddTariffPlanAToCustomerEmpty()
           {
                          driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[2]/h3/a")).click();
                                 driver.findElement(By.xpath("(//div[@class='3u 12u$(small)']//input)[2]")).click();
                                 Alert alert = driver.switchTo().alert();
                                 String alertMessage  = alert.getText();
                                 System.out.println(alertMessage);
                                 alert.accept();
                                 System.out.println("Working well and test case is passed");
           }
           
           @Test(priority=10, groups="PayBill")
           public void payBillingEmpty()
           {
                      driver.findElement(By.xpath("(//div[@class='flex-item right']//a)[2]")).click();
                      driver.findElement(By.xpath("(//div[@class='3u 12u$(small)']//input)[2]")).click();
                      Alert alert = driver.switchTo().alert();
                      String alertMessage = alert.getText();
                      System.out.println(alertMessage);
                      System.out.println("Working well and test case is passed");
                      
           }
           
           @Test(priority=11, groups="PayBill")
           public void payBillingInvalid()
           {
                      driver.findElement(By.xpath("(//div[@class='flex-item right']//a)[2]")).click();
                      driver.findElement(By.id("customer_id")).sendKeys("343746");
                      driver.findElement(By.xpath("(//div[@class='3u 12u$(small)']//input)[2]")).click();
                      driver.findElement(By.xpath("//ul[@class='actions']//a[1]")).click();
                      System.out.println("Working well and test case is passed");
               
                      
                      
           }
           
          
           
           
             @AfterMethod 
             public void finishTest()
             {
                        driver.quit(); 
           
             }
           
}

