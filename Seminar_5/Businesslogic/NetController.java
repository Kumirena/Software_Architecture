package Seminar_5.Businesslogic;

import Seminar_5.NetWork.ICamerasRepository;
import Seminar_5.NetWork.IRoadsRepository;

public class NetController implements ICamerasRepository, IRoadsRepository {
    // методы для получения карты, маршрута и путешествия из сети
    public Map getMap() {
        // получениe карты из сети
         Map map = new Map();
         return map;
    }

    public Route getRoute() {
        // получениe маршрута из сети
        Route route = new Route();
        return route;
    }

    public Trip getTrip() {
        // получениe путешествия из сети
        Route route = new Route();
        Trip trip = new Trip();
        return trip;
    }

    // методы для создания, обновления и удаления путешествия
    public void createTrip(Trip trip) {
    }

    public void updateTrip(Trip trip) {
        
    }

    public void deleteTrip(Trip trip) {
       
    }
}