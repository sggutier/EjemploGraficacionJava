package GeoBasica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Poligono extends ArrayList<Punto> {
    public Poligono(double[] xs, double[] ys) {
        int n = Math.min(xs.length, ys.length);
        for(int i=0; i<n; i++)
            this.add(new Punto(xs[i], ys[i]));
    }
    public Poligono(Punto[] puntos) {
        super(Arrays.asList(puntos));
    }

    public Poligono(Collection<Punto> w) {
        super(w);
    }

    public Poligono() {
        super();
    }

    private interface Transformada {
        Punto op(Punto p);
    }

    private Poligono transformar(Transformada t) {
        return new Poligono(this.stream().map(w -> t.op(w)).toArray(s -> new Punto[s]));
    }

    public Poligono trasladarP(double dx, double dy) {
        return transformar(p-> p.trasladar(dx, dy));
    }

    public Poligono rotarP(double deg) {
        return transformar(p-> p.rotar(deg));
    }

    public Poligono escalarP(double fx, double fy) {
        return transformar(p-> p.escalar(fx, fy));
    }

    public Poligono sizallarP(double a, double b) {
        return transformar(p-> p.sizallar(a, b));
    }
}
