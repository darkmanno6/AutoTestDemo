package TestngDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * @author: test-hwb
 * @date: 2017/11/13-下午1:50
 */
public class TestngThread01 {
    final Logger logger = LoggerFactory.getLogger(TestngThread01.class);

    @Test
    public void test001() throws InterruptedException {
        Thread.sleep(5000);
        logger.info("TestngThread01");
    }

}
