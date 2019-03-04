package Mascota;

import GeoBasica.PoligonoGrafico;
import GeoBasica.Punto;
import GeoFiguras.MultiDibujable;

import java.awt.*;

public class Brazo1 extends PoligonoGrafico {
    public Brazo1() {
        super(new Punto[]{
                new Punto(113.04974, 81.597533),
                new Punto(116.084345, 80.391079),
                new Punto(119.11895, 79.184625),
                new Punto(123.11183, 78.732207),
                new Punto(124.07013, 80.089467),
                new Punto(123.43127, 81.29592),
                new Punto(120.23695, 82.049955),
                new Punto(119.11895, 80.843501),
                new Punto(115.685055, 81.8991485),
                new Punto(112.25116, 82.954796),
                new Punto(110.654, 81.145115),
                new Punto(107.29998, 81.446728),
                new Punto(109.37628, 79.335434),
                new Punto(113.04974, 81.597533)
        }, Color.decode("#187020"));
    }
}
