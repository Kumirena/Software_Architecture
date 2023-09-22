package Seminar_5.UserInterface;

import Seminar_5.Businesslogic.ApplicationController;
import Seminar_5.Businesslogic.Map;
import Seminar_5.Businesslogic.Route;
import Seminar_5.Businesslogic.Trip;

public class UXController implements IUserInterface {
    private ApplicationController applicationController;

    public UXController(ApplicationController applicationController) {
        this.applicationController = applicationController;
    }

    // методы для отображения карты, маршрута и поездки


    @Override
    public void showMap(Map map) {
        Map mapData = applicationController.getMap();
       
    }

    @Override
    public void showRoute(Route route) {
        Route routeData = applicationController.getRoute();
        
    }

    @Override
    public void showTrip(Trip trip) {
        Trip tripData = applicationController.getTrip();
        
    }
}