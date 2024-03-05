package selenium01;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Tc_KB_Rc {
	public static void main(String args[])throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	    driver.findElement(By.name("TxtUsername")).sendKeys("nareshit");
	    driver.findElement(By.name("TxtPassword")).sendKeys("nareshit");
	    Thread.sleep(3000);
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    r.keyRelease(KeyEvent.VK_TAB);
	    Thread.sleep(3000);
	    System.out.println("TAB");
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
	    System.out.println("ENTER");
	    System.out.println("Login completed");
	    driver.findElement(By.linkText("Logout")).click();
	    driver.close();
	}

}
