package selenium01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
public class Tc_TestData {
	static String url="http://183.82.103.245/nareshit/login.php";
	static String username="nareshit";
	static String password="nareshit";
	static String tittle1="OrangeHRM-New Level HR Management";
	static String tittle2="OrangeHRM";
	public static void main(String args[])throws Exception{
		//test steps
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000);
		//verify Tittle
		//Actual Result---- compare---Expected Result
	
		driver.findElement(By.name("txtUsername")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("login completed");
		if(driver.getTitle().equals(tittle2)) {
		System.out.println("Tittle not matched");
	}   
		else{
			System.out.println("Tittle not matched");
			System.out.println(driver.getTitle());
			}
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Logout completed");
		driver.close();
		
		
		}
	}


