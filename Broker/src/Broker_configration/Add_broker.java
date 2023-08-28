package Broker_configration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_broker {

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
		driver.findElement(By.xpath("//*[@id=\"layoutBG\"]/div/div[2]/div/div/ul/a[1]/li")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("add_broker")).click();
		driver.findElement(By.id("irdaRegistrationNo")).sendKeys("852369");
		driver.findElement(By.id("cinNo")).sendKeys("U52351MH2022PTC051891");
		driver.findElement(By.id("brokerName")).sendKeys("Sagar");
		driver.findElement(By.id("shortName")).sendKeys("sam");
		driver.findElement(By.id("address1")).sendKeys("Maharashtra");
		driver.findElement(By.id("pincode")).sendKeys("421502");
		driver.findElement(By.id("contactPersonFirstName")).sendKeys("sahil");
		driver.findElement(By.id("contactPersonLastName")).sendKeys("mane");
		driver.findElement(By.id("emailId")).sendKeys("sahil@fyntune.com");
		driver.findElement(By.id("contactNo")).sendKeys("8965231400");
		driver.findElement(By.xpath("//div[17]//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']//*[name()='path' and contains(@d,'M17 12h-5v')]")).click();
		
		

	}

}
