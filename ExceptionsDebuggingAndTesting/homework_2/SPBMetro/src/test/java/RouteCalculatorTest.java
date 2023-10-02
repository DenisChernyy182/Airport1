import core.Line;
import core.Station;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
public class RouteCalculatorTest {
    private Line line;
    private StationIndex stationIndex;
    private RouteCalculator calculator;
    @BeforeEach
    public void setUp() {
        stationIndex = new StationIndex();
        calculator = new RouteCalculator(stationIndex);

        Line line1 = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");
        Line line3 = new Line(3, "Третья");

        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);

        Station station1 = new Station("Станция 1", line1);
        Station station2 = new Station("Станция 2", line1);
        Station station3 = new Station("Станция 3", line2);
        Station station4 = new Station("Станция 4", line2);
        Station station5 = new Station("Станция 5", line3);
        Station station6 = new Station("Станция 6", line3);

        stationIndex.addStation(station1);
        stationIndex.addStation(station2);
        stationIndex.addStation(station3);
        stationIndex.addStation(station4);
        stationIndex.addStation(station5);
        stationIndex.addStation(station6);

        stationIndex.addConnection(List.of(station1, station3));
        stationIndex.addConnection(List.of(station2, station4));
        stationIndex.addConnection(List.of(station3, station5));
        stationIndex.addConnection(List.of(station4, station6));
    }

    @Test
    public void testGetShortestRouteWithoutTransfers() {
        List<Station> actual = calculator.getShortestRoute(
                stationIndex.getStation("Станция 1"),
                stationIndex.getStation("Станция 2")
        );
        List<Station> expected = List.of(
                stationIndex.getStation("Станция 1"),
                stationIndex.getStation("Станция 2")
        );
        Assertions.assertEquals(expected, actual, "Маршрут без пересадок");
    }

    @Test
    public void testGetRouteWithOneTransfer() {
        List<Station> actual = calculator.getShortestRoute(
                stationIndex.getStation("Станция 1"),
                stationIndex.getStation("Станция 6")
        );
        List<Station> expected = List.of(
                stationIndex.getStation("Станция 1"),
                stationIndex.getStation("Станция 3"),
                stationIndex.getStation("Станция 5"),
                stationIndex.getStation("Станция 6")
        );
        Assertions.assertEquals(expected, actual, "Маршрут с одной пересадкой");
    }

    @Test
    public void testCalculateDurationWithoutTransfers() {
        List<Station> route = List.of(
                stationIndex.getStation("Станция 1"),
                stationIndex.getStation("Станция 2")
        );
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 2.5;
        Assertions.assertEquals(expected, actual, 0.01, "Длительность маршрута без пересадок");
    }

    @Test
    public void testCalculateDurationWithOneTransfer() {
        List<Station> route = List.of(
                stationIndex.getStation("Станция 1"),
                stationIndex.getStation("Станция 3"),
                stationIndex.getStation("Станция 5"),
                stationIndex.getStation("Станция 6")
        );
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 9.5;
        Assertions.assertEquals(expected, actual, 0.01, "Длительность маршрута с одной пересадкой");
    }

    @Test
    public void testGetRouteWithTwoTransfers() {
        List<Station> actual = calculator.getShortestRoute(
                stationIndex.getStation("Станция 2"),
                stationIndex.getStation("Станция 5")
        );
        List<Station> expected = List.of(
                stationIndex.getStation("Станция 2"),
                stationIndex.getStation("Станция 4"),
                stationIndex.getStation("Станция 6"),
                stationIndex.getStation("Станция 3"),
                stationIndex.getStation("Станция 5")
        );
        Assertions.assertEquals(expected, actual, "Маршрут с двумя пересадками");
    }

    @Test
    public void testCalculateDurationWithTwoTransfers() {
        List<Station> route = List.of(
                stationIndex.getStation("Станция 2"),
                stationIndex.getStation("Станция 4"),
                stationIndex.getStation("Станция 6"),
                stationIndex.getStation("Станция 3"),
                stationIndex.getStation("Станция 5")
        );
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 14.0;
        Assertions.assertEquals(expected, actual, 0.01, "Длительность маршрута с двумя пересадками");
    }
}