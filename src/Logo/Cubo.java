package Logo;

import GeoBasica.PoligonoGrafico;
import GeoBasica.Punto;
import GeoFiguras.MultiDibujable;

import java.awt.*;

public class Cubo extends MultiDibujable {
    public Cubo() {
        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(104.43866, 81.972144),
                new Punto(98.398874, 88.34221),
                new Punto(107.31573, 89.216295),
                new Punto(114.53948, 81.597528),
                new Punto(104.43866, 81.972144)
        }, Color.decode("#8686bf")));

        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(98.398874, 88.34221),
                new Punto(101.94371, 99.214169),
                new Punto(109.9067, 101.70394),
                new Punto(107.31573, 89.216295),
                new Punto(98.398874, 88.34221)
        }, Color.decode("#afafde")));

        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(109.9067, 101.70394),
                new Punto(115.89132, 95.392054),
                new Punto(114.53948, 81.597528),
                new Punto(107.31573, 89.216295),
                new Punto(109.9067, 101.70394)
        }, Color.decode("#d7d7ff")));
    }
}
