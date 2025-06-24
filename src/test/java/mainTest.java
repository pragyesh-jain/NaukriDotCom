import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class mainTest {

   @Test
   public void naukriTest() throws InterruptedException {
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.naukri.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      driver.findElement(By.cssSelector("#login_Layer")).click();
      driver.findElement(By.xpath("(//input[@placeholder='Enter your active Email ID / Username'])[1]")).sendKeys("jpragyesh786@gmail.com");
      driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Pragyesh@123");
      driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

      //view profile
      driver.findElement(By.xpath("//a[normalize-space()='View profile']")).click();

      //scroll page
      JavascriptExecutor js = (JavascriptExecutor) driver;


      js.executeScript("window.scrollBy(0,500)"); // Scroll down 500 pixels

      //Update profile
      driver.findElement(By.xpath("//div[@class='card mt15']//div//span[@class='edit icon'][normalize-space()='editOneTheme']")).click();
      driver.findElement(By.xpath("//textarea[@id='resumeHeadlineTxt']")).clear();
      driver.findElement(By.xpath("//textarea[@id='resumeHeadlineTxt']")).sendKeys("Skilled Automation and Manual Test Engineer | Expertise in Selenium, Rest Assured, API Testing, and End-to-End Software Quality Assurance.");
      driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

   }
}
