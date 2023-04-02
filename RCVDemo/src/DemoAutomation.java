import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\chromedriver.exe"); //not nneeded for selenium server 4.6 and above for chrome, edge and firefox
		
		ChromeDriver driver = new ChromeDriver(); //create object driver
		//driver.get("http://www.google.com"); //launch chrome browser
		driver.get("http://www.ebay.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		driver.close();
		
		/*System.setProperty("webdriver.firefox.driver", "D:\\BrowserDriver\\geckodriver.exe");
		FirefoxDriver d = new FirefoxDriver();
		d.get("http://www.google.com");
		*/
	}

}
