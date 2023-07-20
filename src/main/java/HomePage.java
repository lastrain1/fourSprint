import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private final WebDriver driver;
    //Кнопка 'Вопросы о важном' - 'Сколько это стоит? И как оплатить?'
    private final WebElement  howMuchDoesItCostAndHowToPay = getDriver().findElement(By.xpath("//div[text()='Сколько это стоит? И как оплатить?']"));
    //Кнопка 'Вопросы о важном' - 'Хочу сразу несколько самокатов! Так можно?'
    private final WebElement  wantSeveralScootersAtOnce = getDriver().findElement(By.xpath("//div[text()='Хочу сразу несколько самокатов! Так можно?']"));
    //Кнопка 'Вопросы о важном' - 'Как рассчитывается время аренды?'
    private final WebElement  howTheRentalTimeIsCalculated = getDriver().findElement(By.xpath("//div[text()='Как рассчитывается время аренды?']"));
    //Кнопка 'Вопросы о важном' - 'Можно ли заказать самокат прямо на сегодня?'
    private final WebElement  orderAScooterRightForToday = getDriver().findElement(By.xpath("//div[text()='Можно ли заказать самокат прямо на сегодня?']"));
    //Кнопка 'Вопросы о важном' - 'Можно ли продлить заказ или вернуть самокат раньше?'
    private final WebElement  possibleToExtendTheOrder = getDriver().findElement(By.xpath("//div[text()='Можно ли продлить заказ или вернуть самокат раньше?']"));
    //Кнопка 'Вопросы о важном' - 'Вы привозите зарядку вместе с самокатом?'
    private final WebElement  chargingWithAScooter = getDriver().findElement(By.xpath("//div[text()='Вы привозите зарядку вместе с самокатом?']"));
    //Кнопка 'Вопросы о важном' - 'Можно ли отменить заказ?'
    private final WebElement  orderCancellation = getDriver().findElement(By.xpath("//div[text()='Можно ли отменить заказ?']"));
    //Кнопка 'Вопросы о важном' - 'Я жизу за МКАДом, привезёте?'
    private final WebElement  liveOutsideTheMkd = getDriver().findElement(By.xpath("//div[text()='Я жизу за МКАДом, привезёте?']"));

    //Кнопка 'Заказать' сверху
    private final WebElement orderScooterButtonTop = getDriver().findElement(By.xpath("//div[@class='Home_FinishButton__1_cWm']//button[text()='Заказать']"));
    //Кнопка 'Заказать' снизу
    private final WebElement orderScooterButtonDown = getDriver().findElement(By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"));

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getHowMuchDoesItCostAndHowToPay() {
        return howMuchDoesItCostAndHowToPay;
    }

    public WebElement getWantSeveralScootersAtOnce() {
        return wantSeveralScootersAtOnce;
    }

    public WebElement getHowTheRentalTimeIsCalculated() {
        return howTheRentalTimeIsCalculated;
    }

    public WebElement getOrderAScooterRightForToday() {
        return orderAScooterRightForToday;
    }

    public WebElement getPossibleToExtendTheOrder() {
        return possibleToExtendTheOrder;
    }

    public WebElement getChargingWithAScooter() {
        return chargingWithAScooter;
    }

    public WebElement getOrderCancellation() {
        return orderCancellation;
    }

    public WebElement getLiveOutsideTheMkd() {
        return liveOutsideTheMkd;
    }

    public WebElement getOrderScooterButtonTop() {
        return orderScooterButtonTop;
    }

    public WebElement getOrderScooterButtonDown() {
        return orderScooterButtonDown;
    }
}
