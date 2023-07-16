import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private By importantQuestionsDropdown = By.id("accordion__heading-8");
    private By orderScooterButtonTop = By.xpath("//div[@class='Home_FinishButton__1_cWm']//button[text()='Заказать']");
    private By firstName = By.xpath("//div[@class='Input_InputContainer__3NykH']//input[@placeholder='* Имя']");
    private By lastName = By.xpath("//div[@class='Input_InputContainer__3NykH']//input[@placeholder='* Фамилия']");
    private By address = By.xpath("//div[@class='Input_InputContainer__3NykH']//input[@placeholder='* Адрес: куда привезти заказ']");
    private By metroStation = By.xpath("//div[@class='Input_InputContainer__3NykH']//input[@placeholder='* Станция метро']");
    private By phoneNumber = By.xpath("//div[@class='Input_InputContainer__3NykH']//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By nextStep = By.xpath("//div[@class='Order_NextButton__1_rCA']//button[text()='Далее']");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public By getImportantQuestionsDropdown() {
        return importantQuestionsDropdown;
    }

    public By getOrderScooterButtonTop() {
        return orderScooterButtonTop;
    }

    public By getFirstName() {
        return firstName;
    }

    public By getLastName() {
        return lastName;
    }

    public By getAddress() {
        return address;
    }

    public By getMetroStation() {
        return metroStation;
    }

    public By getPhoneNumber() {
        return phoneNumber;
    }

    public By getNextStep() {
        return nextStep;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void setImportantQuestionsDropdown(By importantQuestionsDropdown) {
        this.importantQuestionsDropdown = importantQuestionsDropdown;
    }

    public void setOrderScooterButtonTop(By orderScooterButtonTop) {
        this.orderScooterButtonTop = orderScooterButtonTop;
    }

    public void setFirstName(By firstName) {
        this.firstName = firstName;
    }

    public void setLastName(By lastName) {
        this.lastName = lastName;
    }

    public void setAddress(By address) {
        this.address = address;
    }

    public void setMetroStation(By metroStation) {
        this.metroStation = metroStation;
    }

    public void setPhoneNumber(By phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setNextStep(By nextStep) {
        this.nextStep = nextStep;
    }
}
