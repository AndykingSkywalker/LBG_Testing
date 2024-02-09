package uat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumDemoTest {

	private RemoteWebDriver driver;

	@BeforeEach
	void init() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
	}

//	@Test
//	void seleniumTest() {
//
//		// opens google.com
//		this.driver.get("https://demoqa.com/text-box");
//
//		WebElement consent = this.driver.findElement(By.cssSelector(
//				"body > div.fc-consent-root > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button"));
//		consent.click();
//
//		WebElement fullName = this.driver.findElement(By.id("userName"));
//		fullName.sendKeys("Andrew");
//
//		WebElement userEmail = this.driver.findElement(By.id("userEmail"));
//		userEmail.sendKeys("test@gmail.com");
//
//		WebElement userAddress = this.driver.findElement(By.id("currentAddress"));
//		userAddress.sendKeys("123 Fake Street");
//
//		WebElement permAddress = this.driver.findElement(By.id("permanentAddress"));
//		permAddress.sendKeys("321 Fake Lane");
//
//		WebElement submit = this.driver.findElement(By.id("submit"));
//		this.driver.executeScript("arguments[0].scrollIntoView(true);", submit);
//		submit.click();
//
//		WebElement display = this.driver.findElement(By.id("name"));
//
//		Assertions.assertEquals(true, display.getText().contains("Andrew"));
//	}

	@Test
	void seleniumCheckboxTest() {

		// opens google.com
		this.driver.get("https://demoqa.com/text-box");

		WebElement consent = this.driver.findElement(By.cssSelector(
				"body > div.fc-consent-root > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button"));
		consent.click();

		WebElement checkBoxTab = this.driver.findElement(By.id("item-1"));
		checkBoxTab.click();

		WebElement checkboxFirstBox = this.driver
				.findElement(By.cssSelector("#tree-node > ol > li > span > button > svg"));
		checkboxFirstBox.click();

		WebElement checkboxSecondBox = this.driver
				.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > span > button > svg"));
		checkboxSecondBox.click();

		WebElement checkboxThirdBox = this.driver.findElement(By.cssSelector(
				"#tree-node > ol > li > ol > li.rct-node.rct-node-parent.rct-node-expanded > ol > li:nth-child(1) > span > button"));
		checkboxThirdBox.click();

		WebElement checkboxFourthBox = this.driver.findElement(By.cssSelector(
				"#tree-node > ol > li > ol > li.rct-node.rct-node-parent.rct-node-expanded > ol > li.rct-node.rct-node-parent.rct-node-expanded > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg"));
		checkboxFourthBox.click();

		WebElement result = this.driver.findElement(By.id("result"));
		this.driver.executeScript("arguments[0].scrollIntoView(true);", result);
		result.click();

//		WebElement display = this.driver.findElement(By.id("result"));
//
//		Assertions.assertEquals(true, display.getText().contains("react"));

	}

//	@AfterEach
//	void tearDown() {
//		this.driver.quit();
//	}

}
