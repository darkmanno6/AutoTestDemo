package allurereportdemo;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.excelHelper;

import java.io.IOException;

/**
 * Created by HWB on 2017/5/11.
 */
public class AllureDemo {
    @Test
    public void test1(){
        Assert.assertEquals(1,3);
    }

    @Test(dataProvider = "data")
    public void test2(String a, String b){
        Assert.assertEquals(a, b);
    }

    @Test(dataProvider = "data2")
    public void 测试3(String a, String b){
        Assert.assertEquals(a, b);
    }

    @DataProvider(name = "data")
    public Object[][] getdata(){
        return new Object[][]{{"hello", "hello"}, {"hello", "world"}};
    }

    @DataProvider(name = "data2")
    public Object[][] getExcelData() throws IOException {
        return excelHelper.readExcel("./data/testdata.xlsx", "工作表1");
    }

}

