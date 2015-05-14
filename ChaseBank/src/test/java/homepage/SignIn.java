package homepage;

import BaseApi.Base;
import Utility.DataReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by HP on 5/12/2015.
 */
public class SignIn extends Base {

    public DataReader dr=new DataReader();
    String path="ChaseBank\\data\\file1.xls";

    @Test
    public void signIn() throws IOException, InterruptedException {
        String[][] value=dr.fileReader(path);
        String emailLocator=value[1][0];
        String email=value[1][1];
        String passwordLocator=value[2][0];
        String password=value[2][1];

        typeByCss(emailLocator,email);
        sleepFor(2);
        typeByCss(passwordLocator,password);
        sleepFor(2);
        driver.findElement(By.xpath(".//*[@id='primary-hero']/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div/form/div[1]/div/div[5]/div/div/a")).click();
        sleepFor(4);
    }
}
