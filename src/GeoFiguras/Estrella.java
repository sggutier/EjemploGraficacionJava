package GeoFiguras;

import GeoBasica.PoligonoGrafico;
import GeoBasica.Punto;

import java.awt.*;

public class Estrella extends PoligonoGrafico {
    public Estrella(int outr, int inr, int lads, Color c) {
        super(c);
        double deg = 360.0 / lads;
        Punto a = new Punto(0, -outr);
        Punto b = new Punto(0, -inr).rotar(deg / 2);
        for(int i=0; i<lads; i++) {
            super.add(a);
            super.add(b);
            a = a.rotar(deg);
            b = b.rotar(deg);
        }
    }
    public Estrella(Color c) {
        this(50, 18, 5, c);
    }
    public Estrella() {
        this(Color.red);
    }
}
