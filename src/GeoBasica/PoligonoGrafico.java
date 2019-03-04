package GeoBasica;

import java.awt.*;
import java.util.Collection;

public class PoligonoGrafico extends Poligono implements Dibujable {
    public Paint color = null;

    public PoligonoGrafico(Punto[] puntos, Paint color) {
        super(puntos);
        this.color = color;
    }

    public PoligonoGrafico(double[] xs, double[] ys, Paint color) {
        super(xs, ys);
        this.color = color;
    }

    public PoligonoGrafico(Poligono p, Paint c) {
        super(p);
        color = c;
    }

    public PoligonoGrafico(Collection<Punto> w, Paint color) {
        super(w);
        this.color = color;
    }

    public PoligonoGrafico(Paint color) {
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
        ((Graphics2D) dw).setPaint(color);
        Polygon pol = new Polygon(xs, ys, xs.length);
        dw.fillPolygon(pol);
        ((Graphics2D) dw).setPaint(null);
    }

    @Override
    public PoligonoGrafico trasladar(double dx, double dy) {
        return new PoligonoGrafico(super.trasladarP(dx, dy), color);
    }

    @Override
    public PoligonoGrafico rotar(double deg) {
        return new PoligonoGrafico(super.rotarP(deg), color);
    }

    @Override
    public PoligonoGrafico escalar(double fx, double fy) {
        return new PoligonoGrafico(super.escalarP(fx, fy), color);
    }

    @Override
    public PoligonoGrafico sizallar(double a, double b) {
        return new PoligonoGrafico(super.sizallarP(a, b), color);
    }

    @Override
    public double minX() {
        double ans = this.get(0).x;
        for(Punto p : this)
            ans = Math.min(ans, p.x);
        return ans;
    }

    @Override
    public double maxX() {
        double ans = this.get(0).x;
        for(Punto p : this)
            ans = Math.max(ans, p.x);
        return ans;
    }

    @Override
    public double minY() {
        double ans = this.get(0).y;
        for(Punto p : this)
            ans = Math.min(ans, p.y);
        return ans;
    }

    @Override
    public double maxY() {
        double ans = this.get(0).y;
        for(Punto p : this)
            ans = Math.max(ans, p.y);
        return ans;
    }
}
