package selenium01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Tc001_Login_Logout_chrome {
	public static void main(String args[])throws Exception {
  WebDriver driver=new ChromeDriver();
  driver.navigate().to("http://183.82.103.245/nareshit/login.php");
  Thread.sleep(3000);
  //driver.close();
}
}
