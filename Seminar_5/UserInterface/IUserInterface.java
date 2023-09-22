package Seminar_5.UserInterface;

import Seminar_5.Businesslogic.Map;
import Seminar_5.Businesslogic.Route;
import Seminar_5.Businesslogic.Trip;



public interface IUserInterface {
    void showMap(Map map);
    void showRoute(Route route);
    void showTrip(Trip trip);
}