package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonActions.mouseactions;

public class locationMethods extends mouseactions {

	//location
	public static WebElement fromfiled=driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget "
	+ "ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
	@Test
	public static void from() {
		mouseactions.movelement(fromfiled);;
	}

}
