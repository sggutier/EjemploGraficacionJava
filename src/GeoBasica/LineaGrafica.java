package GeoBasica;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S-Nancy
 */
import GeoBasica.Linea;

import java.awt.Graphics;
import java.awt.Color;

public class LineaGrafica extends Linea implements Dibujable {

    Color color;

    public LineaGrafica(double x1, double y1, double x2, double y2, Color unColor) {
        super(x1, y1, x2, y2);
        this.color = unColor;
    }

    public void dibujar(Graphics dw) {
        dw.setColor(color);
        dw.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
    }

    @Override
    public Dibujable trasladar(double dx, double dy) {
        return null;
    }

    @Override
    public Dibujable rotar(double deg) {
        return null;
    }

    @Override
    public Dibujable escalar(double fx, double fy) {
        return null;
    }

    @Override
    public Dibujable sizallar(double a, double b) {
        return null;
    }

    @Override
    public double minX() {
        return Math.min(x1, x2);
    }

    @Override
    public double maxX() {
        return Math.max(x1, x2);
    }

    @Override
    public double minY() {
        return Math.min(y1, y2);
    }

    @Override
    public double maxY() {
        return Math.max(y1, y2);
    }
}
