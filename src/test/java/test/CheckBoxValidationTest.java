package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.CheckBoxPage;
import util.BrowserFactory;

public class CheckBoxValidationTest {

	WebDriver driver;
	String name = "tech";

	@Test
	public void checkBoxValidation() throws IOException, InterruptedException {

		driver = BrowserFactory.init();

		CheckBoxPage check = PageFactory.initElements(driver, CheckBoxPage.class);
		check.insertListName(name);
		check.clickAdd();
		check.clickToggleAll();
		check.verifyAllListItemsAreChecked();
        Thread.sleep(2000);
		check.uncheckToggleAll();
	    check.removeItem();

		check.insertListName(name);
		check.clickAdd();
		check.clickToggleAll();
		
		check.removeAll();
		
		BrowserFactory.tearDown();
	}

}
