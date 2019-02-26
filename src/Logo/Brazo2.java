package Logo;

import GeoBasica.PoligonoGrafico;
import GeoBasica.Punto;
import GeoFiguras.MultiDibujable;

import java.awt.*;

public class Brazo2 extends MultiDibujable {
    public Brazo2() {
        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(114.85406, 87.152417),
                new Punto(116.75774, 84.4990515),
                new Punto(118.66142, 81.845686),
                new Punto(121.77879, 79.309977),
                new Punto(123.31803, 79.935461),
                new Punto(123.43127, 81.29592),
                new Punto(121.14897, 83.654597),
                new Punto(119.55667, 83.242258),
                new Punto(117.23545, 85.984142),
                new Punto(114.91423, 88.726026),
                new Punto(112.59299, 88.064431),
                new Punto(109.93208, 90.128414),
                new Punto(110.54068, 87.230444),
                new Punto(114.85406, 87.152417)
        }, Color.decode("#187020")));
    }
}
