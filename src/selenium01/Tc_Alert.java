package selenium01;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Tc_Alert {
	public static void main(String args[])throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUsername")).sendKeys("nareshit");
	driver.findElement(By.name("submit")).click();
	Thread.sleep(3000);
	Alert a=driver.switchTo().alert();
	a.accept();
	Thread.sleep(4000);
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	System.out.println("Login complted");
	driver.findElement(By.linkText("logout")).click();
	System.out.println("logout completed");
	driver.close();
	}

}
