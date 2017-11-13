package TestngDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * @author: test-hwb
 * @date: 2017/11/13-下午1:50
 */
public class TestngThread02 {
    final Logger logger = LoggerFactory.getLogger(TestngThread02.class);

    @Test
    public void test001() throws InterruptedException {
        logger.info("TestngThread02");
    }
}
