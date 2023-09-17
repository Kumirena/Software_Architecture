package Seminar_4;

public class Circle implements IShape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius *radius;
    }

    @Override
    public double getPerimeter() {
        return  2*Math.PI*radius;
    }

    @Override
    public String getName() {
        return "cicle";
    }
}