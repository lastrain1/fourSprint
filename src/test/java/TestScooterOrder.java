import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestScooterOrder {

    private WebDriver driver;
    private HomePage homePage;
    private WhoTheScooterIsForPage whoTheScooterIsForPage;
    private AboutRentPage aboutRentPage;

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        System.setProperty("webdriver.chrome.driver", "/Users/darialankina/Downloads/WebDriver/bin/chromedriver");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void testScooterOrder() {
        homePage.getOrderScooterButtonTop().click();
        boolean isTextDisplayed = whoTheScooterIsForPage.getFirstName().isDisplayed();
        assertEquals(isTextDisplayed,true);

        whoTheScooterIsForPage.getSwitchToMainPageButton().click();
        homePage.getOrderScooterButtonDown().click();

        whoTheScooterIsForPage.getFirstName().sendKeys("Иван");
        whoTheScooterIsForPage.getLastName().sendKeys("Смирнов");
        whoTheScooterIsForPage.getAddress().sendKeys("Москва");
        whoTheScooterIsForPage.getMetroStation().sendKeys("Мякинино");
        whoTheScooterIsForPage.getPhoneNumber().sendKeys("435345345534");
        whoTheScooterIsForPage.getNextStep().click();

        aboutRentPage.getWhenToBringScooter().click();
        aboutRentPage.getSelectDate().click();
        aboutRentPage.getRentalPeriod().sendKeys("сутки");
        aboutRentPage.getScooterColor().click();
        aboutRentPage.getCourierComment().sendKeys("Принеси самокат");
        aboutRentPage.getOrderScooter().click();
        aboutRentPage.getPlaceOrder().click();

        String expectedResult = "Заказ оформлен";
        assertEquals(aboutRentPage.getSuccessfulOrderWindow().getText(), expectedResult);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}

