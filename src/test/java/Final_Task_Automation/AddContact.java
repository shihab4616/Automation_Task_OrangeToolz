package Final_Task_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddContact {
	public static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
		
		// Set the location of the ChromeDriver
					System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		    
				    // Create a new instance of the ChromeDriver
				    WebDriver driver = new ChromeDriver();
				    driver.manage().deleteAllCookies();
					driver.manage().window().maximize();

				    // Navigate to the URL
				    driver.get("http://159.89.38.11/login");
	
				//Select for E-mail
				driver.findElement(By.id("email-1")).sendKeys("test@orangetoolz.com");    

				//Select for Password
				driver.findElement(By.id("password-1")).sendKeys("8Kh8nTe*^jdk");

				//Click for SignIn 
				driver.findElement(By.xpath("//*[@id=\"m_login_signin_submit\"]")).click();
			
				// for server respons time dely
				Thread.sleep(8000);
				
				//Contact Management page 
				driver.get("http://159.89.38.11/contact/manage");
				
				//Click to add a contact 
				driver.findElement(By.linkText("Add Contact")).click();
				Thread.sleep(3000);
				
				//Iput a number 
				driver.findElement(By.name("number")).sendKeys("2250");
				Thread.sleep(4000);
				
				//Iput Email Address
				driver.findElement(By.name("email")).sendKeys("tamim@gmail.com");
				Thread.sleep(2000);
				
				//Iput First Name
				driver.findElement(By.name("first_name")).sendKeys("Tamim");
				Thread.sleep(3000);
				
				//Iput Last Name
				driver.findElement(By.name("last_name")).sendKeys("Iqbal");
				Thread.sleep(2000);
				
				
				//Iput Date Of Birth
				//driver.findElement(By.xpath("//*[@id=\"date-time-picker-1\"]/input")).sendKeys("1999-05-12");
				//driver.findElement(By.xpath("//*[@id=\\\"date-time-picker-1\\\"]/input")).click();
				Thread.sleep(3000);
				
				
				//=======Iput Address=========
				
				//Inpit City
				driver.findElement(By.name("city")).sendKeys("Chattagram");
				
				Thread.sleep(4000);
				
				//Iput State
				driver.findElement(By.name("state")).sendKeys("South");
				Thread.sleep(3000);
				
				//Iput Zip Code
				driver.findElement(By.name("zip")).sendKeys("0008");
				Thread.sleep(3000);
				
				//Iput Country
				driver.findElement(By.name("country")).sendKeys("Bangladesh");
				Thread.sleep(4000);
				
				//Iput Address
				driver.findElement(By.name("address")).sendKeys("9/18, block-D, Chattagram");
				Thread.sleep(3000);
				
				
				//Click for Add Contact
				driver.findElement(By.xpath("//*[@id=\"contact-form\"]/button")).click();
				

	}
}