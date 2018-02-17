package aNewMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenTest1 {

	@Test
	public static void fbtest() {

		FirefoxDriver driver = new FirefoxDriver();
		WebElement name = driver.findElement(By.className("fb_logo img sp_m7lN5cdLBIi sx_fe9e91"));

		Assert.assertEquals(name, "Facebook");

	}

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(180L, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		fbtest();

	}

}
