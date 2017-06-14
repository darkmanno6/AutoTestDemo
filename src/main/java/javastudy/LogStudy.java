package javastudy;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by HWB on 2017/5/18.
 */
public class LogStudy {

    public LogStudy(){
        PropertyConfigurator.configure("log4j.properties");
    }

    final Logger logger = LoggerFactory.getLogger(LogStudy.class);



    public void logAA(){
        logger.info("hello {}", "shabi");
    }

    public static void main(String[] args){

        LogStudy l = new LogStudy();
        l.logAA();
    }
}
