import core.Station;

import java.util.*;

public class RouteCalculator {
    private final StationIndex stationIndex;

    private static final double INTER_STATION_DURATION = 2.5;
    private static final double INTER_CONNECTION_DURATION = 3.5;

    public RouteCalculator(StationIndex stationIndex) {
        this.stationIndex = stationIndex;
    }

    public List<Station> getShortestRoute(Station from, Station to) {
        List<Station> route = getRouteOnTheLine(from, to);
        if (route != null) {
            return route;
        }

        route = getRouteWithOneConnection(from, to);
        if (route != null) {
            return route;
        }

        route = getRouteWithTwoConnections(from, to);
        return route;
    }

    public static double calculateDuration(List<Station> route) {
        double duration = 0;
        Station previousStation = null;
        for (int i = 0; i < route.size(); i++) {
            Station station = route.get(i);
            if (i > 0) {
                duration += previousStation.getLine().equals(station.getLine()) ?
                        INTER_STATION_DURATION : INTER_CONNECTION_DURATION;
            }
            previousStation = station;
        }
        return duration;
    }

    private List<Station> getRouteOnTheLine(Station from, Station to) {

        if (!from.getLine().equals(to.getLine())) {
            return null;
        }
        List<Station> route = new ArrayList<>();
        List<Station> stations = from.getLine().getStations();
        int startIndex = stations.indexOf(from);
        int endIndex = stations.indexOf(to);
        if (startIndex < endIndex) {
            for (int i = startIndex; i <= endIndex; i++) {
                route.add(stations.get(i));
            }
        } else {
            for (int i = startIndex; i >= endIndex; i--) {
                route.add(stations.get(i));
            }
        }
        return route;
    }

    private List<Station> getRouteWithOneConnection(Station from, Station to) {
        Set<Station> connectedStations = new HashSet<>();
        for (Station connectedStation : stationIndex.getConnectedStations(from)) {
            connectedStations.addAll(stationIndex.getConnectedStations(connectedStation));
        }
        connectedStations.remove(from);
        List<Station> directRoutes = new ArrayList<>();
        for (Station connectedStation : connectedStations) {
            if (getRouteOnTheLine(from, connectedStation) != null
                    && getRouteOnTheLine(connectedStation, to) != null) {
                directRoutes.add(connectedStation);
            }
        }
        if (directRoutes.isEmpty()) {
            return null;
        }
        Station minDurationStation = directRoutes.get(0);
        double minDuration = calculateDuration(getRouteOnTheLine(from, minDurationStation))
                + calculateDuration(getRouteOnTheLine(minDurationStation, to));
        for (int i = 1; i < directRoutes.size(); i++) {
            Station station = directRoutes.get(i);
            double duration = calculateDuration(getRouteOnTheLine(from, station))
                    + calculateDuration(getRouteOnTheLine(station, to));
            if (duration < minDuration) {
                minDuration = duration;
                minDurationStation = station;
            }
        }
        List<Station> route = new ArrayList<>();
        route.addAll(getRouteOnTheLine(from, minDurationStation));
        route.addAll(getRouteOnTheLine(minDurationStation, to));
        return route;
    }

    private List<Station> getRouteWithTwoConnections(Station from, Station to) {
        Set<Station> connectedStations1 = new HashSet<>();
        for (Station connectedStation : stationIndex.getConnectedStations(from)) {
            connectedStations1.addAll(stationIndex.getConnectedStations(connectedStation));
        }
        connectedStations1.remove(from);

        Set<Station> connectedStations2 = new HashSet<>();
        for (Station connectedStation : stationIndex.getConnectedStations(to)) {
            connectedStations2.addAll(stationIndex.getConnectedStations(connectedStation));
        }
        connectedStations2.remove(to);

        List<Station> directRoutes = new ArrayList<>();
        for (Station connectedStation1 : connectedStations1) {
            for (Station connectedStation2 : connectedStations2) {
                List<Station> route1 = getRouteOnTheLine(from, connectedStation1);
                List<Station> route2 = getRouteOnTheLine(connectedStation2, to);
                List<Station> route3 = getRouteOnTheLine(connectedStation1, connectedStation2);
                if (route1 != null && route2 != null && route3 != null) {
                    directRoutes.add(connectedStation1);
                    break;
                }
            }
        }
        if (directRoutes.isEmpty()) {
            return null;
        }
        Station minDurationStation1 = directRoutes.get(0);
        Station minDurationStation2 = null;
        double minDuration = calculateDuration(getRouteOnTheLine(from, minDurationStation1));
        minDuration += calculateDuration(getRouteOnTheLine(minDurationStation1,
                minDurationStation2 == null ? directRoutes.get(0) : minDurationStation2));
        minDuration += calculateDuration(getRouteOnTheLine(minDurationStation2 == null ? directRoutes.get(0) : minDurationStation2, to));
        for (int i = 0; i < directRoutes.size(); i++) {
            Station station1 = directRoutes.get(i);
            for (int j = i + 1; j < directRoutes.size(); j++) {
                Station station2 = directRoutes.get(j);
                double duration = calculateDuration(getRouteOnTheLine(from, station1));
                duration += calculateDuration(getRouteOnTheLine(station1, station2));
                duration += calculateDuration(getRouteOnTheLine(station2, to));
                if (duration < minDuration) {
                    minDuration = duration;
                    minDurationStation1 = station1;
                    minDurationStation2 = station2;
                }
            }
        }
        List<Station> route = new ArrayList<>();
        route.addAll(getRouteOnTheLine(from, minDurationStation1));
        route.addAll(getRouteOnTheLine(minDurationStation1,
                minDurationStation2 == null ? directRoutes.get(0) : minDurationStation2));
        if (minDurationStation2 != null) {
            route.addAll(getRouteOnTheLine(minDurationStation2, to));
        } else {
            route.addAll(getRouteOnTheLine(directRoutes.get(0), to));
        }
        return route;
    }

}