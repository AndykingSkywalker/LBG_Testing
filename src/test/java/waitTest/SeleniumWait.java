package waitTest;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait {

	private RemoteWebDriver driver;
	private WebDriverWait wait;

	@BeforeEach
	void init() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		// Implicit Wait Example
//		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Explicit wait
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	@Test
	void test() {
		this.driver.get("http://127.0.0.1:5500/index.html");
		WebElement title = this.driver.findElement(By.tagName("h1"));
		Assertions.assertEquals("Hello", title.getText());
		// Explicit wait example
		WebElement greeting = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#myDiv>h2")));
		Assertions.assertEquals("Hello there!", greeting.getText());
	}

}
