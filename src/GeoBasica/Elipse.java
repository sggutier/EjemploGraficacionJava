package GeoBasica;

public class Elipse {
    protected double x, y, w, h;
    public Elipse(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    public Elipse() {
        this(0, 0, 1, 1);
    }
}
