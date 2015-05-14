package homepage;

import BaseApi.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by HP on 5/11/2015.
 */
public class Header extends Base {
    @Test
    public void headerPage() throws InterruptedException {
        sleepFor(2);
        List<String> list=getListOfTextByCss(".static-nav ul>li>a");
        displayText(list);
        //List<WebElement> elements=getWebElements(".static-nav ul>li");
        for (int i=0;i<list.size();i++){
            clickByText(list.get(i));
            sleepFor(4);
        }

    }

}
