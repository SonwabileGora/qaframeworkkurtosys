package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"kurtosys-menu-item-75710\"]/a/div/div")
    public WebElement insight;

    @FindBy(xpath = "//span[contains(text(), 'White Papers & eBooks')]")
    public WebElement whitePapersAndEbooks;

    @FindBy(xpath = "//h2[contains(text(), 'White Papers')]")
    public WebElement whitePapersHeading;

    @FindBy(linkText = "UCITS White Paper")
    public WebElement UCITSWhitePaper;

    @FindBy(css = "#form-field-firstname")
    public WebElement firstName;

    @FindBy(css = "#form-field-lastname")
    public WebElement lastName;

    @FindBy(css = "#form-field-company")
    public WebElement company;

    @FindBy(css = "#form-field-industry")
    public WebElement industry;
    @FindBy(xpath = "//span[text()='Get a Demo']")
    public WebElement getDemoBtn;

    @FindBy(xpath = "//button[.//span[@class='elementor-button-text' and text()='Send']]")
    public WebElement send;

    @FindBy(css = "#onetrust-accept-btn-handler")
    public WebElement comments;
    @FindBy(css = "#error_for_18882_268585pi_18882_268585")
    public WebElement error;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step
    public void navigateToWhitePapers() {
        waitPageBusy();
        Actions actions = new Actions(driver);
        actions.moveToElement(insight).perform();
        whitePapersAndEbooks.click();
        waitPageBusy();
    }
    @Step
    public void ClickGetADemo() {
        getDemoBtn.click();
        waitPageBusy();
        String currentTab = driver.getWindowHandle();
        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(currentTab)) {
                driver.switchTo().window(tab);
            }
        }
        waitPageBusy();
    }
    @Step
    public void fillDetails() {
        setValue(firstName, "Soso");
        setValue(lastName, "Gora");
        setValue(company, "Soso");
        selectFromList(industry,"Banking");
        waitPageBusy();
    }

    @Step
    public void ClickSend() {
        waitPageBusy();
        comments.click();
        selectFromList(industry,"Banking");
        send.click();
        waitPageBusy();
    }
}
