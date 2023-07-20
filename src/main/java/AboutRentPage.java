import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutRentPage {

    private final WebDriver driver;

    //Поле 'Когда привезти самокат'
    private final WebElement whenToBringScooter = getDriver().findElement(By.xpath("//div[@class='react-datepicker__input-container']//input[@placeholder='* Когда привезти самокат']"));
    //Поле выбора даты
    private final WebElement selectDate = getDriver().findElement(By.xpath("//div[@class='react-datepicker__week']//div[text()='18']"));
    //Дропдаун 'Срок аренды'
    private final WebElement rentalPeriod = getDriver().findElement(By.xpath("//div[@class='Dropdown-control']//div[text()='* Срок аренды']"));
    //Чекбокс 'Цвет самоката'
    private final WebElement scooterColor = getDriver().findElement(By.xpath("//label[@class='Checkbox_Label__3wxSf']/input"));
    //Поле 'Комментарий для курьера'
    private final WebElement courierComment = getDriver().findElement(By.xpath("//div[@class='Input_InputContainer__3NykH']//input[@placeholder='Комментарий для курьера']"));
    //Кнопка 'Заказать'
    private final WebElement orderScooter = getDriver().findElement(By.xpath("//div[@class='Order_Buttons__1xGrp']//button[text()='Заказать']"));
    //Кнопка 'Да'
    private final WebElement placeOrder = getDriver().findElement(By.xpath("//div[@class='Order_Buttons__1xGrp']//button[text()='Да']"));
    //Окно успешного оформления заказа
    private final WebElement successfulOrderWindow = getDriver().findElement(By.xpath("//div[@class='Order_ModalHeader__3FDaJ']"));

    public AboutRentPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
    public WebElement getWhenToBringScooter() {
        return whenToBringScooter;
    }

    public WebElement getSelectDate() {
        return selectDate;
    }

    public WebElement getRentalPeriod() {
        return rentalPeriod;
    }

    public WebElement getScooterColor() {
        return scooterColor;
    }

    public WebElement getCourierComment() {
        return courierComment;
    }

    public WebElement getOrderScooter() {
        return orderScooter;
    }
    public WebElement getPlaceOrder() {
        return placeOrder;
    }

    public WebElement getSuccessfulOrderWindow() {
        return successfulOrderWindow;
    }
}
