import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhoTheScooterIsForPage {

    private final WebDriver driver;
    private final WebElement switchToMainPageButton = getDriver().findElement(By.xpath("//a[@class='Header_LogoScooter__3lsAR']"));

    //Поле 'Имя"
    private final WebElement firstName = getDriver().findElement(By.xpath("//div[@class='Input_InputContainer__3NykH']//input[@placeholder='* Имя']"));
    //Поле 'Фамилия"
    private final WebElement lastName = getDriver().findElement(By.xpath("//div[@class='Input_InputContainer__3NykH']//input[@placeholder='* Фамилия']"));
    //Поле 'Адрес: куда привести заказ'
    private final WebElement address = getDriver().findElement(By.xpath("//div[@class='Input_InputContainer__3NykH']//input[@placeholder='* Адрес: куда привезти заказ']"));
    //Поле 'Станция'
    private final WebElement metroStation = getDriver().findElement(By.xpath("//div[@class='Input_InputContainer__3NykH']//input[@placeholder='* Станция метро']"));
    //Поле 'Телефон: на него позвонит курьер'
    private final WebElement phoneNumber = getDriver().findElement(By.xpath("//div[@class='Input_InputContainer__3NykH']//input[@placeholder='* Телефон: на него позвонит курьер']"));
    //Кнопка 'Далее'
    private final WebElement nextStep = getDriver().findElement(By.xpath("//div[@class='Order_NextButton__1_rCA']//button[text()='Далее']"));

    public WhoTheScooterIsForPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getAddress() {
        return address;
    }

    public WebElement getMetroStation() {
        return metroStation;
    }

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public WebElement getNextStep() {
        return nextStep;
    }

    public WebElement getSwitchToMainPageButton() {
        return switchToMainPageButton;
    }
}
