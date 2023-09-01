package ModelElements;

public class Point3D {
    private double x;
    private double y;
    private double z;
    //  Конструктор класса принимает параметры x, y и z,
    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void add(Point3D point){
        this.x += point.x;
        this.y += point.y;
        this.z += point.z;
    }

}