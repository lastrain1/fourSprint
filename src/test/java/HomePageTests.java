import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HomePageTests {

    private WebDriver driver;
    private HomePage homePage;
    private WhoTheScooterIsForPage whoTheScooterIsForPage;
    private AboutRentPage aboutRentPage;

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        System.setProperty("webdriver.chrome.driver", "/Users/msauchanka/IdeaProjects/rsl-ui/ref-impl/etcs/rsl-v20-automation/src/test/resources/chromedriver");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void testImportantQuestionsDropdown() throws InterruptedException {
        Thread.sleep(10000);
        homePage.getImportantQuestionsDropdown().click();

        String expectedResult = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        assertEquals(homePage.getImportantQuestionsDropdownValue().getText(), expectedResult);
    }

    @Test
    public void testScooterOrder() throws InterruptedException {
        Thread.sleep(10000);
        homePage.getOrderScooterButtonTop().click();

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

