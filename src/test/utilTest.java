import org.testng.annotations.Test;
import utils.excelHelper;

import java.io.IOException;

/**
 * @author: test-hwb
 * @date: 2018/2/7-下午5:14
 */
public class utilTest {

    @Test
    public void testExcelHelper() throws IOException {
        excelHelper.readExcel("./data/testdata.xlsx", "工作表1");
    }
}
