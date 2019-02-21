package GeoFiguras;

import GeoBasica.Dibujable;
import GeoBasica.ElipseGrafico;
import GeoBasica.LineaGrafica;

import java.awt.*;
import java.util.Collection;

public class Smile extends MultiDibujable {
    public Smile() {
        this.add(new ElipseGrafico(100, 100, 100, 100, Color.yellow, Color.black));
        this.add(new ElipseGrafico(125,130,20,20, Color.black));
        this.add(new ElipseGrafico(155,130,20,20, Color.black));
        this.add(new ElipseGrafico(125,165,50,16, Color.white, Color.black));
        this.add(new LineaGrafica(125,173,175,173,Color.black));
        this.add(new LineaGrafica(150,165,150,181, Color.black));
        this.add(new LineaGrafica(150 - 10,165 + 2,150 - 10,181 - 2, Color.black));
        this.add(new LineaGrafica(150 - 20,165 + 4,150 - 20,181 - 4, Color.black));
        this.add(new LineaGrafica(150 + 10,165 + 2,150 + 10,181 - 2, Color.black));
        this.add(new LineaGrafica(150 + 20,165 + 4,150 + 20,181 - 4, Color.black));
    }
}
