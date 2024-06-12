package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CuraProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		
		driver.findElement(By.id("btn-make-appointment")).click();
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		
		driver.findElement(By.xpath("//*[@id=\"combo_facility\"]/option[2]")).click();
		driver.findElement(By.id("chk_hospotal_readmission")).click();
		//driver.findElement(By.id("radio_program_medicaid")).click();
		driver.findElement(By.id("radio_program_none")).click();
		driver.findElement(By.id("txt_visit_date")).sendKeys("11-06-2024");
		driver.findElement(By.id("txt_comment")).sendKeys("service was good");
		driver.findElement(By.id("btn-book-appointment")).click();
		driver.findElement(By.xpath("//*[@id=\"summary\"]/div/div/div[7]/p/a")).click();
		}

}
//*[@id="combo_facility"]/option[2]