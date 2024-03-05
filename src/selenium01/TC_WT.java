package selenium01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_WT {
	public static void main(String args[])throws Exception {
		//test steps
		WebDriver driver=new FirefoxDriver();
		//enter ul
		driver.get("file:///C:/Users/RAMESH/Downloads/WebTable.html");
		//count
		int rows=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size();
		int cols=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td")).size();
		int rows_cols=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
		System.out.println("Rows count"+rows);
		System.out.println("Col count"+cols);
		System.out.println("Rows_Col"+rows_cols);
		//Data--cell
		String celldata=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[2]/td[2]")).getText();
		System.out.println(celldata);
		//data--table
		for(int i=1;i<=rows;i++) {
		String data=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr["+i+"]")).getText();
		System.out.println(data);
		Thread.sleep(3000);
	}
		
driver.quit();
}
}
