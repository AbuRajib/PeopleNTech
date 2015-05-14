package AboutJPMorgan;

import BaseApi.Base;
import org.testng.annotations.Test;

/**
 * Created by HP on 5/14/2015.
 */
public class Heading extends Base {
    @Test
    public void heading() throws InterruptedException {
        clickByXpath(".//*[@id='chaseui-pagefooter']/div[2]/div/div[1]/div/div[2]/div/div/div/div/div[1]/ul/li[3]/span/a");
        sleepFor(4);
        String heading =getTextByXpath("html/body/div[3]/div[2]/div/div[1]/article/div[1]/div/h2");
        System.out.println(heading);
        String descreption=getTextByXpath("html/body/div[3]/div[2]/div/div[1]/article/div[1]/div/p");
        System.out.println(descreption);
    }
}
