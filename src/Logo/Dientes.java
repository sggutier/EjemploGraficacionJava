package Logo;

import GeoBasica.PoligonoGrafico;
import GeoBasica.Punto;
import GeoFiguras.MultiDibujable;

import java.awt.*;

public class Dientes extends MultiDibujable {
    public Dientes() {
        super.pasos = true;
        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(88.332578, 69.687265),
                new Punto(91.005273, 69.893792),
                new Punto(89.342263, 71.959059),
                new Punto(88.332578, 69.687265)
        }, Color.decode("#ffff7b")));
        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(91.005273, 69.893792),
                new Punto(93.677968, 70.100319),
                new Punto(92.014958, 72.165586),
                new Punto(91.005273, 69.893792)
        }, Color.decode("#ffff7b")));
        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(91.005273, 69.893792),
                new Punto(93.677968, 70.100319),
                new Punto(92.014958, 72.165586),
                new Punto(91.005273, 69.893792)
        }, Color.decode("#ffff7b")));
        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(93.677968, 69.571152),
                new Punto(96.350663, 69.777679),
                new Punto(95.37185, 70.993253),
                new Punto(94.687653, 71.842946),
                new Punto(93.677968, 69.571152)
        }, Color.decode("#ffff7b")));
        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(96.350663, 69.248512),
                new Punto(99.023358, 69.455039),
                new Punto(97.360348, 71.520306),
                new Punto(96.350663, 69.248512)
        }, Color.decode("#ffff7b")));
        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(99.148606, 68.908288),
                new Punto(101.8213, 69.114815),
                new Punto(100.15829, 71.180082),
                new Punto(99.148606, 68.908288)
        }, Color.decode("#ffff7b")));
        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(94.973054, 77.351967),
                new Punto(93.15918, 78.38856),
                new Punto(92.696917, 78.055145),
                new Punto(92.861811, 76.039275),
                new Punto(94.973054, 77.351967)
        }, Color.decode("#ffff7b")));
        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(96.961777, 76.593387),
                new Punto(94.634362, 77.923459),
                new Punto(94.850534, 75.280695),
                new Punto(96.961777, 76.593387)
        }, Color.decode("#ffff7b")));
        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(99.248534, 75.705141),
                new Punto(96.921119, 77.035213),
                new Punto(97.137291, 74.392449),
                new Punto(99.248534, 75.705141)
        }, Color.decode("#ffff7b")));
    }
}
