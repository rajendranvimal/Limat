package commonActions;
import org.openqa.selenium.WebElement;

import base.Base;
public class mouseactions extends Base {
public static void movelement(WebElement ele) {
	act.moveToElement(ele).click().build().perform();
}
}
