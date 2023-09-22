package Seminar_5.Businesslogic;

public class MapController {
    private NetController netController;

    public MapController() {
        this.netController = new NetController();
    }

    public Map getMap() {
        return netController.getMap();
    }
}