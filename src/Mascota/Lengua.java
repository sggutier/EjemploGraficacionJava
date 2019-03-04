package Mascota;

import GeoBasica.PoligonoGrafico;
import GeoBasica.Punto;
import GeoFiguras.MultiDibujable;

import java.awt.*;

public class Lengua extends PoligonoGrafico {
    public Lengua() {
        super(new Punto[]{
                new Punto(91.246586, 74.63861),
                new Punto(95.0837875, 73.240778),
                new Punto(98.920989, 71.842946),
                new Punto(102.42933, 71.309014),
                new Punto(105.46055, 70.8476955),
                new Punto(108.49177, 70.386377),
                new Punto(104.66477, 72.276258),
                new Punto(100.5778875, 73.008587),
                new Punto(96.491005, 73.740916),
                new Punto(93.8687955, 74.189763),
                new Punto(91.246586, 74.63861)
        }, Color.decode("#ff7676"));
    }
}
