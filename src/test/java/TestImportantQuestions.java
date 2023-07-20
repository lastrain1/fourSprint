import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static junit.framework.TestCase.assertEquals;

public class TestImportantQuestions {
    private WebDriver driver;
    private HomePage homePage;

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        System.setProperty("webdriver.chrome.driver", "/Users/darialankina/Downloads/WebDriver/bin/chromedriver");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void testImportantQuestions() {
        homePage.getHowMuchDoesItCostAndHowToPay().click();
        assertEquals(homePage.getHowMuchDoesItCostAndHowToPay().getText(), "Сутки — 400 рублей. Оплата курьеру — наличными или картой.");

        homePage.getWantSeveralScootersAtOnce().click();
        assertEquals(homePage.getWantSeveralScootersAtOnce().getText(), "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.");

        homePage.getHowTheRentalTimeIsCalculated().click();
        assertEquals(homePage.getHowTheRentalTimeIsCalculated().getText(), "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.");

        homePage.getOrderAScooterRightForToday().click();
        assertEquals(homePage.getOrderAScooterRightForToday().getText(), "Только начиная с завтрашнего дня. Но скоро станем расторопнее.");

        homePage.getPossibleToExtendTheOrder().click();
        assertEquals(homePage.getPossibleToExtendTheOrder().getText(), "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.");

        homePage.getChargingWithAScooter().click();
        assertEquals(homePage.getChargingWithAScooter().getText(), "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.");

        homePage.getOrderCancellation().click();
        assertEquals(homePage.getOrderCancellation().getText(), "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.");

        homePage.getLiveOutsideTheMkd().click();
        assertEquals(homePage.getLiveOutsideTheMkd().getText(), "Да, обязательно. Всем самокатов! И Москве, и Московской области.");
    }
}
