import core.Line;
import core.Station;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RouteCalculatorTest {

    private static StationIndex stationIndex;
    private static RouteCalculator calculator;

    @BeforeClass
    public static void setUp() {
        createStationIndex();
        calculator = new RouteCalculator(stationIndex);
    }

    @Test
    public void testGetShortestRoute() {
        Station from = stationIndex.getStation("Станция 1", 1);
        Station to = stationIndex.getStation("Станция 2", 1);

        List<Station> expectedRoute = Arrays.asList(from, to);
        List<Station> actualRoute = calculator.getShortestRoute(from, to);

        assertEquals(expectedRoute, actualRoute);
    }

    @Test
    public void testCalculateDuration() {
        Station from = stationIndex.getStation("Станция 1", 1);
        Station to = stationIndex.getStation("Станция 2", 1);

        List<Station> route = calculator.getShortestRoute(from, to);
        double actualDuration = calculator.calculateDuration(route);
        double expectedDuration = 2.5;

        assertEquals(expectedDuration, actualDuration, 0.001);
    }

    private static void createStationIndex() {
        stationIndex = new StationIndex();

        Line line1 = new Line(1, "Линия 1");
        Line line2 = new Line(2, "Линия 2");

        Station station1 = new Station("Станция 1", line1);
        Station station2 = new Station("Станция 2", line1);
        Station station3 = new Station("Станция 3", line2);

        line1.addStation(station1);
        line1.addStation(station2);
        line2.addStation(station3);

        List<Station> connectionStations = new ArrayList<>();
        connectionStations.add(station2);
        connectionStations.add(station3);

        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addStation(station1);
        stationIndex.addStation(station2);
        stationIndex.addStation(station3);
        stationIndex.addConnection(connectionStations);
    }
}