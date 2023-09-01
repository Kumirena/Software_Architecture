package ModelElements;
// класс Scene содержит свойства id, models и flashes,

public class Scene {
    public int id;
    public PoligonalModel models;
    public Flash flashes;

    public Scene(int id, PoligonalModel models, Flash flashes) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;

    }

}