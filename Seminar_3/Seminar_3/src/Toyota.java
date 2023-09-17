public class Toyota extends Car implements IPetrolCar {

    public Toyota(String model, String color, String exter, String fluel_type, String control, int num_wheels, double vol_eng) {
        super("Toyota", model, color, exter, fluel_type, control, num_wheels, vol_eng);
        self.is_vecsicale = true;
    }

    public void isLight_on(boolean is_light) {
        is_light = true;
    }

    @Override
    public void refuelWithPetrol() {
        // Реализация заправки 

}
