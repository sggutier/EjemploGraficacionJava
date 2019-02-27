package GeoBasica;

import java.awt.*;
import java.util.Collection;

public class PoligonoGrafico extends Poligono implements Dibujable {
    private Color color;
    public Paint pnt = null;

    public PoligonoGrafico(Punto[] puntos, Color color) {
        super(puntos);
        this.color = color;
    }

    public PoligonoGrafico(Punto[] puntos, Color color, Paint pnt) {
        super(puntos);
        this.color = color;
        this.pnt = pnt;
    }

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

    public PoligonoGrafico(Collection<Punto> w, Color color, Paint pnt) {
        super(w);
        this.color = color;
        this.pnt = pnt;
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
        ((Graphics2D) dw).setPaint(pnt);
        Polygon pol = new Polygon(xs, ys, xs.length);
        if(pnt == null)
            dw.setColor(color);
        dw.fillPolygon(pol);
        ((Graphics2D) dw).setPaint(null);
    }

    @Override
    public PoligonoGrafico trasladar(double dx, double dy) {
        return new PoligonoGrafico(super.trasladarP(dx, dy), color, pnt);
    }

    @Override
    public PoligonoGrafico rotar(double deg) {
        return new PoligonoGrafico(super.rotarP(deg), color, pnt);
    }

    @Override
    public PoligonoGrafico escalar(double fx, double fy) {
        return new PoligonoGrafico(super.escalarP(fx, fy), color,pnt);
    }

    @Override
    public PoligonoGrafico sizallar(double a, double b) {
        return new PoligonoGrafico(super.sizallarP(a, b), color,pnt);
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
