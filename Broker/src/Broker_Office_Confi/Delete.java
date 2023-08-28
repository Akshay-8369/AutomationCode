package Broker_Office_Confi;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete {

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
		driver.findElement(By.id("delete-22")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
//		Thread.sleep(3000);
		driver.close();

	}

}
