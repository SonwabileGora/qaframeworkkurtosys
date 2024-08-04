package tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import testng.BaseSeleniumTest;

import java.lang.reflect.Method;

public class BaseTest extends BaseSeleniumTest {
    @Override
    @AfterMethod
    public void afterTest(ITestResult result, Method method) {
        super.afterTest(result, method);
    }
}
