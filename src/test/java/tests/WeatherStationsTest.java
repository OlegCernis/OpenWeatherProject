package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WeatherStationsPage;

import java.util.List;

public class WeatherStationsTest extends BaseTest {

    @Test
    public void testSummaryExistsAndActive() {
        final List<String> expectedSummaryTexts = List.of(
                "Three simple steps",
                "Basic methods to retrieve data from station",
                "Register station",
                "Send measurements for station",
                "Get measurements for station",
                "Additional features",
                "Get all stations",
                "Get station info",
                "Update station info",
                "Delete station",
                "Possible errors"
        );

        List<String> actualSummaryTexts =
                openBaseURL()
                        .scrollToPageBottom()
                        .clickConnectYourWeatherStationFooterMenu()
                        .waitAllSummaryElementsVisibleAndClickable()
                        .getSummaryTextsWeatherStations();

        Assert.assertEquals(actualSummaryTexts, expectedSummaryTexts);
    }

    @Test
    public void TestBlackTriangles() {
        final int expectedOpenedTriangles = 10;
        final int expectedOpenedTriangles2 = 0;
        final int expectedClosedTriangles = 13;
        final int expectedClosedTriangles2 = 0;

        int actualOpenTriangles  = openBaseURL()
                .scrollByCoordinatesToWeatherDashboardFooterMenu()
                .clickConnectYourWeatherStationFooterMenu()
                .getListOfOpenTriangles();

        int actualOpenTriangles2 = new WeatherStationsPage(getDriver())
                .clickToCloseAllTriangles()
                .getListOfOpenTriangles();

        int actualClosedTriangles = new WeatherStationsPage(getDriver())
                .getListOfCloseTriangles();

        int actualClosedTriangles2  = new WeatherStationsPage(getDriver())
                .clickToOpenAllTriangles()
                .getListOfCloseTriangles();

        Assert.assertEquals(actualOpenTriangles, expectedOpenedTriangles);
        Assert.assertEquals(actualOpenTriangles2, expectedOpenedTriangles2);
        Assert.assertEquals(actualClosedTriangles, expectedClosedTriangles);
        Assert.assertEquals(actualClosedTriangles2, expectedClosedTriangles2);

    }
}
