package homepage;

import BaseApi.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by HP on 5/13/2015.
 */
public class Footer extends Base {
    @Test

    public void footerTest() throws InterruptedException {
        List<String> list=getListOfTextByCss(".chaseui-columns .chaseui-column.col3 ul>li");
        displayText(list);
         for(int i=0;i<list.size();i++){
            clickByText(list.get(i));
            sleepFor(3);

        }
    }

}
