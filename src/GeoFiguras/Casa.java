package GeoFiguras;

import GeoBasica.*;

import java.awt.*;

public class Casa extends MultiDibujable {
    public Casa() {
        this.add(new Pino().escalar(0.25, 0.25).trasladar(-28,4));
        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(26, 104),
                new Punto(26, 58),
                new Punto(60,30),
                new Punto(94,58),
                new Punto(94,104),
                },
                Color.white));
        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(15, 61),
                new Punto(18,64),
                new Punto(60,30),
                new Punto(102,64),
                new Punto(105,61),
                new Punto(60,24),
                },
                Color.red));
        this.add(new RectanguloGrafico(62,104,84,67,Color.decode("#c16f25")));
        this.add(new CirculoGrafico(67,87,4,Color.decode("#fff1a1")));
        this.add(new RectanguloGrafico(35,85,53,67,Color.decode("#259dfa")));
        this.add(new RectanguloGrafico(35,71,53,67,Color.decode("#006fd4")));
        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(26, 57),
                new Punto(26,62),
                new Punto(60, 35),
                new Punto(94, 62),
                new Punto(94, 57),
                new Punto(60,30),
                },
                Color.decode("#ca0000")));
    }
}
