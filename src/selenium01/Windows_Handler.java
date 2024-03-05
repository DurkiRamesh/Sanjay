package selenium01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;



public class Windows_Handler {
	public static  void main(String args[]) throws Exception{
		WebDriver driver=new FirefoxDriver();
		//1st window
		driver.navigate().to("file:///C:/Users/RAMESH/Downloads/multiplewindows.html");
		Thread.sleep(3000);
		//2nd window
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(3000);
		//3rd window
		driver.findElement(By.id("btn3")).click();
		Thread.sleep(3000);
		ArrayList<String>Windowinfo=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(Windowinfo.get(2));
		//driver.close();
		driver.quit();
	}

}
