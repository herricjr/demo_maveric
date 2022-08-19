package jrherric;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class drill1 {
	 public static void main(String[] args) throws InterruptedException, IOException {
	        System.setProperty("webdriver.msedgedriver","msedgedriver.exe");
	        WebDriver driver=new EdgeDriver();
	        driver.navigate().to("https://askomdch.com/");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[3]/div/div/ul/li[1]/div[2]/a[2]")).click();
	        Thread.sleep(1000);
	        JavascriptExecutor j = (JavascriptExecutor)driver;
		    j.executeScript("window.scrollBy(0,500)");
	        driver.findElement(By.xpath("//*[@id=\"ast-site-header-cart\"]/div[1]/a/div/span")).click();
	        driver.findElement(By.xpath("//*[@id=\"astra-mobile-cart-drawer\"]/div[2]/div/div/p[2]/a[2]")).click();
	        driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[3]/div/div/ul/li[1]/div[2]/a[3]")).click();
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,350)", "");
		    driver.findElement(By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a")).click();
	          driver.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).sendKeys("Herric");
		      driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys("Joel R");
		      driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys("5/328C Defence Colony");
		      driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("Coimbatore");
		      driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).sendKeys("90025");
		      driver.findElement(By.xpath("//*[@id=\"billing_email\"]")).sendKeys("herricjoel2001@gmail.com");
		      driver.findElement(By.xpath("//*[@id=\"payment\"]/ul/li[2]")).click();
		      driver.findElement(By.xpath("//*[@id=\"place_order\"]")).click();
		    
}}
