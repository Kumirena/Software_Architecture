package ModelElements;

import java.awt.*;

public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public Float power;

    
    public void rotate(Angle3D angle) {
        this.angle.add(angle);
    }

    public void move(Point3D direction) {
        this.location.add(direction);
    }
}