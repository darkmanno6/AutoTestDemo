package TestngDemo;

import org.testng.annotations.Test;

/**
 * @author: test-hwb
 * @date: 2018/3/14-上午11:33
 * testng异常测试, 针对期望异常进行测试
 * expectedExceptions期望抛出的异常类, expectedExceptionsMessageRegExp异常抛出时的信息
 */
public class TestngException {

    @Test(expectedExceptions = NumberFormatException.class)
    public void testException(){
//        throw new NullPointerException();
        throw new NumberFormatException();
    }

    @Test(expectedExceptions = NullPointerException.class, expectedExceptionsMessageRegExp = "asd12")
    public void testException1(){
        throw new NullPointerException("asd");
//        throw new NumberFormatException();
    }
}
