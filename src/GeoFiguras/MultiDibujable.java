package GeoFiguras;

import GeoBasica.Dibujable;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class MultiDibujable extends ArrayList<Dibujable> implements Dibujable {
    public MultiDibujable() {
    }

    public MultiDibujable(Collection<? extends Dibujable> collection) {
        super(collection);
    }

    @Override
    public void dibujar(Graphics dw) {
        for(Dibujable d : this)
            d.dibujar(dw);
    }

    @Override
    public Dibujable trasladar(double dx, double dy) {
        MultiDibujable ans = new MultiDibujable(this);
        for(Dibujable d : ans)
            d.trasladar(dx, dy);
        return ans;
    }

    @Override
    public Dibujable rotar(double deg) {
        MultiDibujable ans = new MultiDibujable(this);
        for(Dibujable d : ans)
            d.rotar(deg);
        return ans;
    }

    @Override
    public Dibujable escalar(double fx, double fy) {
        MultiDibujable ans = new MultiDibujable(this);
        for(Dibujable d : ans)
            d.escalar(fx, fy);
        return ans;
    }

    @Override
    public Dibujable sizallar(double a, double b) {
        MultiDibujable ans = new MultiDibujable(this);
        for(Dibujable d : ans)
            d.sizallar(a, b);
        return ans;
    }
}
