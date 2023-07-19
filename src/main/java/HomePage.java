import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private final WebDriver driver;

    //Кнопка 'Вопросы о важном' - 'Сколько это стоит? И как оплатить?'
    private final WebElement importantQuestionsDropdown = getDriver().findElement(By.id("accordion__heading-8"));
    //Значение дропдауна
    private final WebElement importantQuestionsDropdownValue = getDriver().findElement(By.id("accordion__panel-8"));
    //Кнопка 'Заказать'
    private final WebElement orderScooterButtonTop = getDriver().findElement(By.xpath("//div[@class='Home_FinishButton__1_cWm']//button[text()='Заказать']"));

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getImportantQuestionsDropdown() {
        return importantQuestionsDropdown;
    }

    public WebElement getOrderScooterButtonTop() {
        return orderScooterButtonTop;
    }

    public WebElement getImportantQuestionsDropdownValue() {
        return importantQuestionsDropdownValue;
    }
}
