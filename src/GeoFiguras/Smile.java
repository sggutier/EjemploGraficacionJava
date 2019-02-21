package GeoFiguras;

import GeoBasica.Dibujable;
import GeoBasica.ElipseGrafico;

import java.awt.*;
import java.util.Collection;

public class Smile extends MultiDibujable {
    public Smile() {
        this.add(new ElipseGrafico(100, 100, 100, 100, Color.yellow, Color.black));
        this.add(new ElipseGrafico(125,130,20,20, Color.black));
        this.add(new ElipseGrafico(155,130,20,20, Color.black));
        this.add(new ElipseGrafico(125,165,50,15, Color.white, Color.black));
    }
}
