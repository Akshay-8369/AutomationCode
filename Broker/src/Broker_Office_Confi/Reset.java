package Broker_Office_Confi;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reset {

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
		driver.findElement(By.id("office_code")).sendKeys("999");
		Thread.sleep(3000);
		driver.findElement(By.id("broker_pincode")).sendKeys("421502");
		Thread.sleep(3000);
		driver.findElement(By.id("reset_btn")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
