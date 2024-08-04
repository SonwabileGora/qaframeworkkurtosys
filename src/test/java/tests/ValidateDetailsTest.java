package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import testng.SoftAssert;

public class ValidateDetailsTest extends BaseTest{
    @Test
    public void LoginTest() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToWhitePapers();
        softAssert.assertEquals(homePage.whitePapersHeading.getText(),"White Papers");
        homePage.ClickGetADemo();

        homePage.fillDetails();
        Thread.sleep(2000);
        homePage.ClickSend();
        homePage.takeScreenshot();
        softAssert.assertEquals(homePage.error.getText(), "Please fill out this field.");
    }
}
