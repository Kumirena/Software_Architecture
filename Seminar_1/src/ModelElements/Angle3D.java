package ModelElements;

public class Angle3D {
        private double x;
        private double y;
        private double z;
    // Конструктор класса принимает параметры x, y и z
        public Angle3D(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
   
        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double getZ() {
            return z;
        }

        public void setZ(double z) {
            this.z = z;
        }

        
        public void add(Angle3D angle) {
        this.x += angle.getX();
        this.y += angle.getY();
        this.z += angle.getZ();
    }

    }