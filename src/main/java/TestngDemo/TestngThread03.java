package TestngDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * @author: test-hwb
 * @date: 2017/11/13-下午1:50
 */
public class TestngThread03 {
    final Logger logger = LoggerFactory.getLogger(TestngThread03.class);

    @Test(threadPoolSize = 3, invocationCount = 6)
    public void test001() throws InterruptedException {
        logger.info("TestngThread03");
    }
}
