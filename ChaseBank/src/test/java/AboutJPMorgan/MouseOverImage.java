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
public class MouseOverImage extends Base{
    @Test
    public void mouseOverImage() throws InterruptedException {
        clickByXpath(".//*[@id='chaseui-pagefooter']/div[2]/div/div[1]/div/div[2]/div/div/div/div/div[1]/ul/li[3]/span/a");
        sleepFor(4);


        clickByXpath(".//*[@id='jpmc_careers']");
        sleepFor(2);
        clickByXpath(".//*[@id='jpmcNav']/ul/li[5]/div/ul/li[1]/a");
        sleepFor(2);

        //Locate the image icon
       // WebElement iconhover = driver.findElement(By.xpath("html/body/div[4]/div/article[1]/div[2]/div/a/img"));
        List<WebElement> iconhover= getWebElements(".careers-footer .col4-careers article");
        //Hover mouse above the image icon - **DONT click**
        mouseOver(iconhover);
    }
}
