package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Maventest {
	private WebDriver driver;

	@Test
	public void testEasy() {
		System.setProperty("webdriver.gecko.driver", "Resourcess/geckodriver.exe");
		driver.manage().timeouts().pageLoadTimeout(180L, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/guru99home/");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Demo Guru99 Page"));
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(180L, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		System.out.println("unable to open Chromedriver");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
