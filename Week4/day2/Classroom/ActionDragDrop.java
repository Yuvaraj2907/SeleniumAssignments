package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDragDrop {

	public static void main(String[] args) {
		
		//To Add driver to the Code
		WebDriverManager.chromedriver().setup();
				
		//Open the browser
		ChromeDriver driver=new ChromeDriver();
				
		//To get URL
		driver.get("https://jqueryui.com/droppable/");
		
		//To Maximize the Browser
		driver.manage().window().maximize();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Frame
		driver.switchTo().frame(0);	
		//Action Class for Drag and Drop
		Actions builder=new Actions(driver);
		WebElement SourceDrag=driver.findElement(By.id("draggable"));
		WebElement SourceDrop=driver.findElement(By.id("droppable"));
        builder.dragAndDrop(SourceDrag, SourceDrop).perform();
        System.out.println("Drag and Drop successfully completed");
		
		
	}

}
