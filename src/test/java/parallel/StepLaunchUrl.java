package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepLaunchUrl {
	WebDriver driver;
	
	@Before
	public void setup()
	{
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	}

@Given("Open the google url")
public void open_the_google_url() {
	
	
	driver.get("https://www.google.com");
    
}

@Given("open the fb url")
public void open_the_fb_url() {
    driver.get("https://www.facebook.com");
}


@Given("Open the amazon url")
public void open_the_amazon_url() {
  driver.get("https://www.amazon.in/s?k=iphone&ref=nb_sb_noss");
}

@After
public void tearDown()
{
	driver.close();
}


}
