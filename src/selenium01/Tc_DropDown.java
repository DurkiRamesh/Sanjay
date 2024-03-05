package selenium01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.select;
public class Tc_DropDown {
	public static void main(String args[])throws Exception{
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUsername")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Login completed");
	driver.switchTo().frame("rightMenu");
	Select st=new Select(driver.findElement(By.name("loc_code")));
	st.selectByValue("0");
	Thread.sleep(3000);
	driver.findElement(By.name("loc_name")).sendKeys("1008");
	Thread.sleep(3000);
     driver.findElements(By.xpath("//input[@value='search']")).click();
     Thread.sleep(3000);
	driver.findElement(By.name(null))
	


}
