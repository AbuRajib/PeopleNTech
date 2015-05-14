package homepage;

import BaseApi.Base;
import Utility.DataReader;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by HP on 5/13/2015.
 */
public class Search extends Base {
    DataReader dr=new DataReader();
    String path="ChaseBank\\data\\search.xls";
    @Test
    public void search() throws IOException, InterruptedException {
        String[][] value=dr.fileReader(path);
        typeAndEnterByCss(value[1][0],value[1][1]);
        sleepFor(4);
    }
}
