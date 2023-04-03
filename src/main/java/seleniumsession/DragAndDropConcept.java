package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		Actions act = new Actions(driver);

		WebElement SourceID = driver.findElement(By.id("draggable"));
		WebElement TargetID = driver.findElement(By.id("droppable"));

		act.clickAndHold(SourceID).moveToElement(TargetID).build().perform();

	}

}
