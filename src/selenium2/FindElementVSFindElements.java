package selenium2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindElementVSFindElements {
public static void main (String args[]) {
	WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.nopcommerce.com/");
//findElement() ---->Return single WebElement 

}
}
