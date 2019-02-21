package GeoBasica;

import java.awt.*;
import java.util.Collection;

public class PoligonoGrafico extends Poligono implements Dibujable {
    private Color color;

    public PoligonoGrafico(double[] xs, double[] ys, Color color) {
        super(xs, ys);
        this.color = color;
    }

    public PoligonoGrafico(Poligono p, Color c) {
        super(p);
        color = c;
    }

    public PoligonoGrafico(Collection<Punto> w, Color color) {
        super(w);
        this.color = color;
    }

    public PoligonoGrafico(Color color) {
        this.color = color;
    }

    @Override
    public void dibujar(Graphics dw) {
        int n = super.size();
        int[] xs = new int[n], ys = new int[n];
        for(int i=0; i<n; i++) {
            xs[i] = (int) Math.round(super.get(i).x);
            ys[i] = (int) Math.round(super.get(i).y);
        }
        Polygon pol = new Polygon(xs, ys, xs.length);
//        dw.setColor(Color.BLACK);
//        dw.drawPolygon(pol);
        dw.setColor(color);
        dw.fillPolygon(pol);
    }

    @Override
    public Dibujable trasladar(double dx, double dy) {
        return new PoligonoGrafico(super.trasladarP(dx, dy), color);
    }

    @Override
    public Dibujable rotar(double deg) {
        return new PoligonoGrafico(super.rotarP(deg), color);
    }

    @Override
    public Dibujable escalar(double fx, double fy) {
        return new PoligonoGrafico(super.escalarP(fx, fy), color);
    }

    @Override
    public Dibujable sizallar(double a, double b) {
        return new PoligonoGrafico(super.sizallarP(a, b), color);
    }
}
