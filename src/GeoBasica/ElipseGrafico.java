package GeoBasica;

import java.awt.*;

public class ElipseGrafico extends Elipse implements Dibujable {
    private Color fill, bord;

    public ElipseGrafico(double x1, double y1, double w, double h, Color c) {
        super(x1, y1, w, h);
        this.fill = c;
        this.bord = null;
    }

    public ElipseGrafico(double x1, double y1, double w, double h, Color c, Color b) {
        this(x1, y1, w, h, c);
        this.bord = b;
    }

    public void dibujar(Graphics dw) {
        dw.setColor(fill);
        dw.fillOval((int) Math.round(x), (int) Math.round(y), (int) Math.round(w), (int) Math.round(h));
        if(bord != null) {
            dw.setColor(bord);
            dw.drawOval((int) Math.round(x), (int) Math.round(y), (int) Math.round(w), (int) Math.round(h));
        }
    }

    @Override
    public Dibujable trasladar(double dx, double dy) {
        return new ElipseGrafico(x + dx, y + dy, w, h, fill, bord);
    }

    @Override
    public Dibujable rotar(double deg) {
        return null;
    }

    @Override
    public Dibujable escalar(double fx, double fy) {
        return new ElipseGrafico(x*fx, y*fy, w*fx, h*fy, fill, bord);
    }

    @Override
    public Dibujable sizallar(double a, double b) {
        return null;
    }

    @Override
    public double minX() {
        return x;
    }

    @Override
    public double maxX() {
        return x + h;
    }

    @Override
    public double minY() {
        return y;
    }

    @Override
    public double maxY() {
        return y + w ;
    }
}
