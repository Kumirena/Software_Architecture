package Seminar_5.Businesslogic;

public class TripController {
    private NetController netController;

    public TripController() {
        this.netController = new NetController();
    }

        public Trip getTrip() {
        return netController.getTrip();
    }

       public void createTrip(Trip trip) {
        netController.createTrip(trip);
    }

    // метод для обновления существующего путешествия
    public void updateTrip(Trip trip) {
        netController.updateTrip(trip);
    }

    
    public void deleteTrip(Trip trip) {
        netController.deleteTrip(trip);
    }
}