package Logo;

import GeoBasica.PoligonoGrafico;
import GeoBasica.Punto;
import GeoFiguras.MultiDibujable;

import java.awt.*;

public class Pata1 extends MultiDibujable {
    public Pata1() {
        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(135.904, 77.660568),
                new Punto(139.152586075, 75.9787647423),
                new Punto(142.600443968, 74.780745852),
                new Punto(146.06442, 75.441876),
                new Punto(148.60785, 77.462492),
                new Punto(149.93759, 81.340027),
                new Punto(150.07826, 86.208399),
                new Punto(150.21893, 91.076771),
                new Punto(153.88609, 93.15919),
                new Punto(155.59796, 94.131293),
                new Punto(158.99919, 96.9463465),
                new Punto(162.40042, 99.7614),
                new Punto(162.1573, 104.572225),
                new Punto(161.91418, 109.38305),
                new Punto(159.47634, 112.39348),
                new Punto(159.73958, 109.23194),
                new Punto(159.047194982, 105.645722035),
                new Punto(157.67966, 102.33438),
                new Punto(153.964057411, 100.399731513),
                new Punto(150.029104561, 98.9396936381),
                new Punto(146.21658, 97.198146),
                new Punto(142.12221812, 94.5267677528),
                new Punto(138.528500521, 91.2178863493),
                new Punto(135.854380242, 87.1432259281),
                new Punto(134.831013176, 82.3974724297),
                new Punto(135.90359, 77.660826),
                new Punto(135.904, 77.660568)
        }, Color.decode("#007676")));
    }
}
