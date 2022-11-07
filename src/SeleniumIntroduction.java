import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Invoking browser
		//Chrome -- ChromeDriver -->Methods close get
		//Firefox -- FirefoxDriver -->Methods close get
		//Safari -- SafariDriver --> Methods close get
		//WebDriver close get
		//WebDriver methods + class methods
		//chromedriver.exe --> Chrome browser
		//webdriver.chrome.driver-->value of path
		
		System.setProperty("webdriver.chrome.driver", "D:/Eclipse projects/chromedriver_win32/chromedriver.exe/");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("inputUsername")).sendKeys("rosculescu"); 
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("inputPassword")).sendKeys("adrian");   
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("submit")).click();
		
		Thread.sleep(2000);     
		
		driver.findElement(By.linkText("Forgot your password?")).click(); //press forgot password 
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("adrian");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("roscu88@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567890");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
	}

}
