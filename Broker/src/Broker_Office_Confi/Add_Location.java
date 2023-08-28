package Broker_Office_Confi;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_Location {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ifuture_class\\java_workplace\\Broker\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://brocode.fynity.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"layoutBG\"]/div/div/div/div[2]/div/form/div/div[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hamburger-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"layoutBG\"]/div/div[2]/div/div/ul/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("add_location")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[2]/div/form/div[1]/div[1]/div/input")).sendKeys("258");
		Thread.sleep(3000);
		driver.findElement(By.id("pincode")).sendKeys("421502");
		Thread.sleep(3000);
		driver.findElement(By.id("office_address")).sendKeys("Turbhe");
		driver.findElement(By.id("contact_person_name")).sendKeys("Prathmesh");
		driver.findElement(By.id("mobile_no")).sendKeys("7854123690");
		driver.findElement(By.id("email_id")).sendKeys("prathmesh@fyntune.com");
		Thread.sleep(3000);
		//calender 
//		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[2]/div/form/div[1]/div[10]/div/div/div/div/button/svg")).click();
	/*	Thread.sleep(5000);
		By calendarIconLocator = By.className("MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv"); // Replace with the actual ID of the calendar icon element
		WebElement calendarIcon = driver.findElement(calendarIconLocator);
		calendarIcon.click();
		By dateLocator = By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[4]/button[6]"); // Replace with the appropriate XPath for the date
		WebElement dateElement = driver.findElement(dateLocator);
		dateElement.click();*/
		



		driver.findElement(By.id("save_btn")).click();
		
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
