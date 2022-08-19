package jrherric;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Sel2 {
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedgedriver","msedgedriver.exe");
	    WebDriver driver=new EdgeDriver();
	    driver.navigate().to("https://demoqa.com/alerts");
	    driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
	    Alert alert = driver.switchTo().alert();
	    Thread.sleep(1000);
	    alert.accept();
		}}
