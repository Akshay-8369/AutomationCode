package Broker_Holiday_Confi;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_Holiday {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ifuture_class\\java_workplace\\Broker\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://brocode.fynity.in");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"layoutBG\"]/div/div/div/div[2]/div/form/div/div[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hamburger-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[3]//li[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/main/div/div[2]/div[1]/div/button[2]")).click();
		Thread.sleep(3000);
		//Event name 
		driver.findElement(By.id("event_name")).sendKeys("Christmas Day");
		driver.findElement(By.id("office_code")).sendKeys("776");
		Thread.sleep(3000);
		driver.close();

	}

}
