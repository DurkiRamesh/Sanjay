package selenium01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
public class Tc_002verify {
	public static void main(String args[])throws Exception{
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000);
	//verify Title
	//Actual Result compare with Expected Result
	if(driver.getTitle().equals("orangeHRM-New Level of HR Management")) {
	System.out.println("Title matched");	
	}
	else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
	}
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	System.out.println("Logout completed");
	driver.close();
	
	
	}
	}


