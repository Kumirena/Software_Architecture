package Seminar_5;

import Seminar_5.Businesslogic.ApplicationController;
import Seminar_5.Businesslogic.TripController;
import Seminar_5.UserIntrface.UXController;

public class Main {
    public static void main(String[] args) {
        ApplicationController applicationController = new ApplicationController();
        UXController uxController = new UXController(applicationController);

        TripController tripController = new TripController();

        uxController.showMap(applicationController.getMap());
        uxController.showRoute(applicationController.getRoute());
        uxController.showTrip(applicationController.getTrip());

    }
} 
