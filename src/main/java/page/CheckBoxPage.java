package page;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class CheckBoxPage extends BasePage {
	WebDriver driver;
	String generatedName;
	@FindBy(how = How.NAME, using = "data")
	WebElement listName;
	@FindBy(how = How.XPATH, using = "//input[@value='Add']")
	WebElement addName;
	@FindBy(how = How.NAME, using = "allbox")
	WebElement toggleAll;
	@FindBy(how = How.XPATH, using = "//input[@name='todo[0]']")
	List<WebElement> checkbox;
	@FindBy(how = How.CSS, using = "input[value='Remove']")
	WebElement remove;

	public void insertListName(String name) {
     
		generatedName = name + generateRandomNumber(99);
		listName.sendKeys(generatedName);
	}

	public void clickAdd() {
		addName.click();
	}

	public CheckBoxPage(WebDriver driver) {
		this.driver = driver;

	}

	public void clickToggleAll() {

		toggleAll.click();

	}

	public void verifyAllListItemsAreChecked() {

		for (int i = 0; i < checkbox.size(); i++) {

			Assert.assertTrue(checkbox.get(i).isSelected());

		}
	}

	public void uncheckToggleAll() {

		toggleAll.click();

	}

	public void removeItem() throws InterruptedException {
	
		WebElement name = driver.findElement(By.name("todo[0]"));
		 name.click();
		 Thread.sleep(3000);
			remove.click();
			System.out.println("item removed");
        }
	

	public void removeAll() throws InterruptedException {
		Thread.sleep(3000);
		remove.click();
		
	}	
	}


