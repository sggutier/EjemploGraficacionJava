package GeoBasica;

import java.awt.*;

public class CuadradoGrafico extends RectanguloGrafico {
    private Color color;

    public CuadradoGrafico(double x1, double y1, double r, Color c) {
        super(x1, y1, x1+r, y1+r, c);
    }

    public CuadradoGrafico(double r, Color c) {
        super(r, r, c);
    }
}
