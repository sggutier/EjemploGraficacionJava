package GeoBasica;

import GeoBasica.PoligonoGrafico;

import java.awt.*;

public class TrianguloGrafico extends PoligonoGrafico {

    public TrianguloGrafico(double x1, double y1, double x2, double y2, double x3, double y3, Color c) {
        super(new double[]{x1, x2, x3}, new double[]{y1, y2, y3}, c);
    }
}
