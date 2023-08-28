package Broker_configration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

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
		driver.findElement(By.id("edit-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("address1")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("address1")).sendKeys("Kalyan");
		Thread.sleep(3000);
//		driver.findElement(By.id("pincode")).clear();
		Thread.sleep(2000);
//		driver.findElement(By.id("pincode")).sendKeys("421302");
		driver.findElement(By.id("update_btn")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
