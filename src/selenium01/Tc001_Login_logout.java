package selenium01;
   import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
public class Tc001_Login_logout{
	public static void main(String args[])throws Exception {
		WebDriver driver=new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php&quot;");

Thread.sleep(3000);
driver.close();
	}
}
