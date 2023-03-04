package PaintsAndColors1PageFac;

	  import org.testng.annotations.Test;
	import org.testng.annotations.Test;

	  import PaintsAndColors1PageFac.PaintsAndColors1PageFactory;

	  import org.testng.annotations.Test;

	  import java.awt.Paint;

	  import org.openqa.selenium.WebDriver;
	  import org.openqa.selenium.chrome.ChromeDriver;
	  import org.testng.annotations.Test;

	  @SuppressWarnings("unused")
	  public class PaintAndColorsTest {
	  	WebDriver driver;
	    @Test
	    public void verification() throws InterruptedException {
	  	  System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	  	  driver = new ChromeDriver();
	  	  driver.get("https://www.asianpaints.com/");
	  	  driver.manage().window().maximize();
//	  	  PaintsAndColors1PageFactory pf = new PaintsAndColors1PageFactory(driver);
//	  	  pf.p1();
//	  	  pf.p2();
//	  	  pf.p3();
//	  	  pf.p4();
//	  	  pf.p5();
//	  	  
	    } 
	  }
