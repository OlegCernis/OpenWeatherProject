package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base_abstract.FooterMenuPage;

import java.util.List;

public class WeatherStationsPage extends FooterMenuPage {

    @FindBy(xpath = "//div[@class='doc-container']//nav//li/a")
    private List<WebElement> summaryListWeatherStations;

    @FindBy(xpath = "(//div[@class ='response open']//img[@class='toggleImg'])")
    private WebElement blackTrianglesOpen;

    @FindBy(xpath = "(//div[@class ='response']//img[@class='toggleImg'])")
    private WebElement blackTrianglesClosed;

    @FindBy(xpath = "(//div[@class ='response open']//img[@class='toggleImg'])")
    private List<WebElement> listBlackTrianglesOpen;

    @FindBy(xpath = "(//div[@class ='response']//img[@class='toggleImg'])")
    private List<WebElement> listBlackTrianglesClosed;

    @FindBy(xpath = "(//div[@class='api']//code[text()])")
    private List<WebElement> text;

    @FindBy(xpath = "(//img[@class='toggleImg'])")
    private WebElement triangle;

    @FindBy(xpath = "(//img[@class='toggleImg'])[1]")
    private WebElement triangle1;

    @FindBy(xpath = "(//img[@class='toggleImg'])[2]")
    private WebElement triangle2;

    @FindBy(xpath = "(//img[@class='toggleImg'])[3]")
    private WebElement triangle3;

    @FindBy(xpath = "(//img[@class='toggleImg'])[4]")
    private WebElement triangle4;

    @FindBy(xpath = "(//img[@class='toggleImg'])[5]")
    private WebElement triangle5;

    @FindBy(xpath = "(//img[@class='toggleImg'])[6]")
    private WebElement triangle6;

    @FindBy(xpath = "(//img[@class='toggleImg'])[7]")
    private WebElement triangle7;

    @FindBy(xpath = "(//img[@class='toggleImg'])[8]")
    private WebElement triangle8;

    @FindBy(xpath = "(//img[@class='toggleImg'])[9]")
    private WebElement triangle9;

    @FindBy(xpath = "(//img[@class='toggleImg'])[10]")
    private WebElement triangle10;

    @FindBy(xpath = "(//img[@class='toggleImg'])[11]")
    private WebElement triangle11;

    @FindBy(xpath = "(//img[@class='toggleImg'])[12]")
    private WebElement triangle12;

    @FindBy(xpath = "(//img[@class='toggleImg'])[13]")
    private WebElement triangle13;

    public WeatherStationsPage(WebDriver driver) {
        super(driver);
    }

    public List<String> getSummaryTextsWeatherStations() {

        return getTexts(summaryListWeatherStations);
    }

    public WeatherStationsPage waitAllSummaryElementsVisibleAndClickable() {
        areAllElementsVisibleAndClickable(summaryListWeatherStations);

        return this;
    }

    public int getListOfCloseTriangles() {
        int blackTriangleButton = 0;
        for (WebElement triangleElement : listBlackTrianglesClosed) {
            scrollByCoordinatesToElement(triangleElement);
            getWait10().until(ExpectedConditions.visibilityOfAllElements(listBlackTrianglesClosed));
            if (blackTrianglesClosed.isDisplayed()) {
                blackTriangleButton++;

            } else {
                System.out.println("fell on the count of closed triangles!!!");
                break;
            }
        }

        return blackTriangleButton;
    }

    public int getListOfOpenTriangles() {
        int blackTriangleButton = 0;
        for (WebElement triangleElement : listBlackTrianglesOpen) {
            scrollByCoordinatesToElement(triangleElement);
            getWait10().until(ExpectedConditions.visibilityOfAllElements(listBlackTrianglesOpen));
            if (blackTrianglesOpen.isDisplayed()) {
                blackTriangleButton++;

            } else {
                System.out.println("fell on the count of open triangles!!!");
                break;
            }
        }

        return blackTriangleButton;
    }

    public WeatherStationsPage clickToCloseAllTriangles() {
        scrollByCoordinatesToElement(triangle1);
        click(triangle1);

        scrollByCoordinatesToElement(triangle2);
        click(triangle2);

        scrollByCoordinatesToElement(triangle3);
        click(triangle3);

        scrollByCoordinatesToElement(triangle4);
        click(triangle4);

        scrollByCoordinatesToElement(triangle5);
        click(triangle5);

        scrollByCoordinatesToElement(triangle6);
        click(triangle6);

        scrollByCoordinatesToElement(triangle8);
        click(triangle8);

        scrollByCoordinatesToElement(triangle10);
        click(triangle10);

        scrollByCoordinatesToElement(triangle11);
        click(triangle11);

        scrollByCoordinatesToElement(triangle12);
        click(triangle12);

        return this;
    }

    public WeatherStationsPage clickToOpenAllTriangles() {
        scrollByCoordinatesToElement(triangle1);
        click(triangle1);

        scrollByCoordinatesToElement(triangle2);
        click(triangle2);

        scrollByCoordinatesToElement(triangle3);
        click(triangle3);

        scrollByCoordinatesToElement(triangle4);
        click(triangle4);

        scrollByCoordinatesToElement(triangle5);
        click(triangle5);

        scrollByCoordinatesToElement(triangle6);
        click(triangle6);

        scrollByCoordinatesToElement(triangle7);
        click(triangle7);

        scrollByCoordinatesToElement(triangle8);
        click(triangle8);

        scrollByCoordinatesToElement(triangle9);
        click(triangle9);

        scrollByCoordinatesToElement(triangle10);
        click(triangle10);

        scrollByCoordinatesToElement(triangle11);
        click(triangle11);

        scrollByCoordinatesToElement(triangle12);
        click(triangle12);

        scrollByCoordinatesToElement(triangle13);
        click(triangle13);

        return this;
    }
}
