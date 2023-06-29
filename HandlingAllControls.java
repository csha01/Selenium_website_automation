package websiteAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class HandlingAllControls {
	
	
	 
	 static WebDriver driver;
	 
	 @Test(priority = 0)
	 public void profile() throws InterruptedException{
		 
		 ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\chitr\\chromedriver\\chromedriver.exe");
		 
		 driver = new ChromeDriver(chromeOptions);
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 driver.get("https://edureka.co/");

		 try {
			 Thread.sleep(1000);
		 }catch(InterruptedException e){
			 e.printStackTrace();
			 
		 }
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/ul[1]/li[4]/span[1]")).click();
		 
		 try {
			 Thread.sleep(1000);
		 }catch(InterruptedException e) {
			 e.printStackTrace();
			 
		 }
		 
		 Actions actions = new Actions(driver);
		 actions.moveToElement(driver.findElement(By.id("si_popup_email")));
		 Thread.sleep(2000);
		 actions.click();
		 actions.sendKeys("csha0734@gmail.com");
		 Thread.sleep(2000);
		 actions.build().perform();
		 
		 actions.moveToElement(driver.findElement(By.id("si_popup_passwd")));
		 Thread.sleep(2000);
		 actions.click();
		 actions.sendKeys("Edureka@2023");
		 Thread.sleep(2000);
		 actions.build().perform();
		 
		 
		 actions.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[3]/form[1]/button[1]")));
		 Thread.sleep(2000);
		 actions.click();
		 actions.build().perform();
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[4]/ul[1]/li[6]/a[1]/span[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[4]/ul[1]/li[6]/ul[1]/li[4]/a[1]")).click();
		 
		 WebDriverWait waitElement = new WebDriverWait(driver, Duration.ofSeconds(20) );
		 waitElement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-profile-main[1]/div[1]/div[1]/div[1]/app-profile-leftnav-pro[1]/div[1]/ul[1]/li[1]/a[1]")));
		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-profile-main[1]/div[1]/div[1]/div[1]/app-profile-leftnav-pro[1]/div[1]/ul[1]/li[1]/a[1]"));
		 String pageTitle = driver.getTitle();
		 
		 
		 driver.findElement(By.xpath("//a[@id='personal_details']//i[@class='icon-pr-edit']")).click();
		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-onboarding-user-details[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).click();
		 
//		actions.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-onboarding-user-details[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))).click().sendKeys("chitransh");
//		actions.build().perform();
		 
		 driver.findElement(By.xpath("//input[@id='fullName']")).clear();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("Chitransh");
		 Thread.sleep(2000);
		
//		 driver.findElement(By.cssSelector(".btn.btn-default.btn-lg.btn-save.btn_save.pull-right")).click();
//		 Thread.sleep(2000);
		 
		 driver.navigate().to("https://learning.edureka.co/my-profile");
		 Thread.sleep(2000);
		 
		 driver.navigate().to("https://learning.edureka.co/my-profile/career-service");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//a[@id='career_interest']//i[@class='icon-pr-edit']")).click();
		 
		 Select dropDownCurrentJob = new Select(driver.findElement(By.xpath("//select[@name='currentjob']")));
		 Thread.sleep(2000);
		 dropDownCurrentJob.selectByValue("Entry Level");
		 Thread.sleep(2000);
		 
		 Select dropDownIndustry = new Select(driver.findElement(By.xpath("//select[@name='currentIndustry']")));
		 Thread.sleep(2000);
		 dropDownIndustry.selectByValue("IT-Software / Software Services");
		 
		 driver.findElement(By.xpath("//input[@name='userSkill']")).sendKeys("Selenium");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(2000);
		 
		 Select jobs = new Select(driver.findElement(By.xpath("//select[@name='interestedJob']")));
		 Thread.sleep(2000);
		 jobs.selectByValue("Software Testing");
		 Thread.sleep(2000);
		 
		 Select employment = new Select(driver.findElement(By.xpath("//select[@name='elementType']")));
		 Thread.sleep(2000);
		 employment.selectByValue("Permanent");
		 Thread.sleep(2000);
		 
		 
		 driver.findElement(By.xpath("//input[@name='currentCity']")).sendKeys("Ujjain");
		 Thread.sleep(2000);
		 
		 
		 Select salary = new Select(driver.findElement(By.xpath("//select[@name='lastDrawnSalary']")));
		 Thread.sleep(2000);
		 salary.selectByValue("5-10 LPA");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//label[normalize-space()='Yes']//span[@class='checkmark']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@name='preferredCity']")).sendKeys("Pune");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 driver.findElement(By.xpath("//button[@class='btn pull-right onboarding-primary-button']")).click();
		 
		 driver.findElement(By.xpath("//span[@class='user_name']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//a[normalize-space()='Log Out']")).click();
		 
		 
		 
		 }
	 
	 
	 

}
