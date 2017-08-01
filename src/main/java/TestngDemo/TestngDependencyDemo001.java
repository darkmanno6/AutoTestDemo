package TestngDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Created by HWB on 2017/7/20.
 */
public class TestngDependencyDemo001 {
    private static Logger logger = LoggerFactory.getLogger(TestngDependencyDemo001.class);

    @Test
    public void dependencyDemo001Test001(){
        logger.info("dependency011");
    }


    @Test(dependsOnMethods = "dependencyDemo001Test001")
    public void dependencyDemo001Test002(){
        logger.info("dependency012");
    }
}
