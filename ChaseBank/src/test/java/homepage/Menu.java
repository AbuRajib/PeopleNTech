package homepage;

import BaseApi.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by HP on 5/12/2015.
 */
public class Menu extends Base {
    @Test
    public void mainMenu() throws InterruptedException {
        clickByCss(".firstCrumb #primaryMenu0");
        sleepFor(1);
       List<String> list=getListOfTextByCss(".megamenu-primary-navigation-item .megamenu-secondary-navigation li>ul>li>a");
        //List<String > list=getListOfTextByXpath(".//*[@id='primaryMenu0']");
        displayText(list);
    }
}
