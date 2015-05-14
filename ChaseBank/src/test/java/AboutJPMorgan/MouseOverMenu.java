package AboutJPMorgan;

import BaseApi.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by HP on 5/14/2015.
 */
public class MouseOverMenu extends Base {
    @Test
    public void mouseOver() throws InterruptedException {
        clickByXpath(".//*[@id='chaseui-pagefooter']/div[2]/div/div[1]/div/div[2]/div/div/div/div/div[1]/ul/li[3]/span/a");
        sleepFor(4);

        List<String> list=getListOfTextByCss("#jpmcNav ul>.jpui-menu-item");
        displayText(list);
        List<WebElement> ele = getWebElements("#jpmcNav ul>.jpui-menu-item");
        mouseOver(ele);

    }
}
