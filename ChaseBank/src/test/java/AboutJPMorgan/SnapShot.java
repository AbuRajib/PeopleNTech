package AboutJPMorgan;
import BaseApi.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by HP on 5/14/2015.
 */

public class SnapShot extends Base {

    @Test
    public void snapShot() throws IOException {
       takeScreenShoot("ScreenShot\\snap3.png");

   }

}
