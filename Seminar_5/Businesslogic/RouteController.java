package Seminar_5.Businesslogic;

public class RouteController {
    private NetController netController;

    public RouteController() {
        this.netController = new NetController();
    }

    // получениe маршрута из сети
    public Route getRoute() {
        return netController.getRoute();
    }
}