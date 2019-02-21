package GeoBasica;

import java.awt.*;

public class CirculoGrafico extends ElipseGrafico implements Dibujable {

    public CirculoGrafico(double x1, double y1, double r, Color c) {
        super(x1-r, y1-r, 2*r, 2*r, c);
    }
}
