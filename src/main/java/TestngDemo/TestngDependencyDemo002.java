package TestngDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Created by HWB on 2017/7/20.
 */
public class TestngDependencyDemo002 {
    private static Logger logger = LoggerFactory.getLogger(TestngDependencyDemo002.class);

    @Test(dependsOnMethods = "dependencyDemo002Test002")
    public void dependencyDemo002Test001(){
        logger.info("dependency021");
    }


    @Test
    public void dependencyDemo002Test002(){
        logger.info("dependency022");
    }
}
