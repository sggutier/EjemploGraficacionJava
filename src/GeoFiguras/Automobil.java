package GeoFiguras;

import GeoBasica.CirculoGrafico;
import GeoBasica.PoligonoGrafico;
import GeoBasica.Punto;
import GeoBasica.RectanguloGrafico;

import java.awt.*;

public class Automobil extends MultiDibujable {
    public Automobil() {
        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(7,73),
                new Punto(112,73),
                new Punto(112,51),
                new Punto(98,51),
                new Punto(86,28),
                new Punto(41,28),
                new Punto(29,51),
                new Punto(7,51),
                },
                Color.decode("#f03a17")));
        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(28,51),
                new Punto(55,51),
                new Punto(55,32),
                new Punto(39,32),
                },
                Color.decode("#31d2f7")));
        this.add(new RectanguloGrafico(60,51,77,32,Color.decode("#31d2f7")));
        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(82,32),
                new Punto(82,51),
                new Punto(98,51),
                new Punto(89,32),
                },
                Color.decode("#31d2f7")));
        this.add(new RectanguloGrafico(37,54,41,47,Color.decode("#cccccc")));
        this.add(new RectanguloGrafico(108,62,112,54,Color.decode("#ffb700")));
        this.add(new RectanguloGrafico(7,62,11,54,Color.decode("#f8fbb0")));
        int rad = 20;
        this.add(new CirculoGrafico(30,73,rad/2.0,Color.decode("#383838")));
        this.add(new CirculoGrafico(30,73,rad/4.0,Color.decode("#cccccc")));
        this.add(new CirculoGrafico(93,73,rad/2.0,Color.decode("#383838")));
        this.add(new CirculoGrafico(93,73,rad/4.0,Color.decode("#cccccc")));
    }
}
