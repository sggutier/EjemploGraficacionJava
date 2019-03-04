package GeoFiguras;

import GeoBasica.PoligonoGrafico;
import GeoBasica.Punto;

import java.awt.*;

public class LogoSistemas extends MultiDibujable {
    public LogoSistemas() {
        final double ha = 140, hb = 50;
        final double x0 = 0, x1 = x0 + ha, x2 = x1 + hb, x3 = x2 + ha, x4 = x3 + hb;
        final double q = x4 + ha;
        final double a4 = q + ha, a3 = a4 + hb, a2 = a3 + ha, a1 = a2 + hb, a0 = a1 + ha;

        final double va = 160, vb = 55;
        final double y0 = 0,      y1 = y0 + va, y2 = y1 + vb, y3 = y2 + vb, y4 = y3 + vb, y5 = y4 + vb, y6 = y5 + vb, y7 = y6 + vb, y8 = y7 + vb;
        final double b0 = 1200,   b1 = b0 - va, b2 = b1 - vb, b3 = b2 - vb, b4 = b3 - vb, b5 = b4 - vb, b6 = b5 - vb, b7 = b6 - vb, b8 = b7 - vb;

        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(x0, y3),
                new Punto(x0, b3),
                new Punto(q, b0),
                new Punto(a0, b3),
                new Punto(a1, b4),
                new Punto(q, b1),
                new Punto(x1, b4),
                new Punto(x1, y4),
                new Punto(q, y1),
                new Punto(a1, y4),
                new Punto(a0, y3),
                new Punto(q, y0),
        },Color.decode("#00356c")));

        this.add(new PoligonoGrafico(new Punto[]{
                new Punto(x2, y5),
                new Punto(x2, y8),
                new Punto(q, b6),
                new Punto(a4, b7),
                new Punto(a3, b6),
                new Punto(q, b4),
                new Punto(x2, b8),
                new Punto(x2, b5),
                new Punto(q, b2),
                new Punto(a2, b5),
                new Punto(a2, b8),
                new Punto(q, y6),
                new Punto(x4, y7),
                new Punto(x3, y6),
                new Punto(q, y4),
                new Punto(a2, y8),
                new Punto(a2, y5),
                new Punto(q, y2),
        },Color.decode("#00356c")));
        
        
    }
}
