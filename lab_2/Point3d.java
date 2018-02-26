/*
    Класс, описывающий трехмерную точку
*/
public class Point3d {
    private double x, y, z;

    public Point3d(double _x, double _y, double _z) {
        x = _x;
        y = _y;
        z = _z;
    }

    public Point3d() {
        this(0., 0., 0.);
    }

    public void setX(double _x) {
        x = _x;
    }

    public void setY(double _y) {
        y = _y;
    }

    public void setZ(double _z) {
        z = _z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    //Проверяет равенство 2-х точек
    public boolean equals(Point3d point) {
        return this.getX() == point.getX() && 
            this.getY() == point.getY() && 
            this.getZ() == point.getZ();
    }

    //Вычисляет расстояние между точками
    public double distanceTo(Point3d point) {
        return Math.sqrt(Math.pow(point.getX() - this.getX(), 2) + 
            Math.pow(point.getY() - this.getY(), 2));
    }
}