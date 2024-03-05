package selenium01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
public class FileUpload {
	public static void main(String args[]) {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php&quot;");
		driver.findElement(By.xpath("//inut[@type='text'])).sendKeys("nareshit");
    driver.findElement(By.xpath("[//input[@name='txtPassword']").sendKeys("nareshit");
   driver.findElement(By.name("Submit")).click();
    Thread.sleep(5000);
    driver.switchTo().frame("rightMenu");
    driver.findElement(By.xpath("//input[@value='add']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath(null))).click();
    driver.findElement(By.xpath(null)).click();
    WebElement fileInput=driver.findElement(By.xpath(null))
    Thread.sleep(6000);
    System.out.println("Fileuploaded successfully");
    driver.findElement(By.xpath(")).click();"
    		Thread.sleep(6000);
    		System.out.println("New Employee Added");
    		driver.switchTo().defaultContent();
    		driver.findElement(By.linkText("Logout")).click();
    		driver.close()
    
    	

	}

}
