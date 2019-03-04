package GeoBasica;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S-Nancy
 */
import GeoBasica.PoligonoGrafico;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Paint;

public class RectanguloGrafico extends PoligonoGrafico {
    Color color;
    Graphics rectangulo;

    public RectanguloGrafico(double x1, double y1, double x2, double y2, Paint unColor) {
        super(new double[]{x1, x2, x2, x1}, new double[]{y1, y1, y2, y2}, unColor);
    }

    public RectanguloGrafico(double b, double h, Color c) {
        this(0, 0, b, h, c);
    }
}
