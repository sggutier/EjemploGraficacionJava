/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S-Nancy
 */
public class Linea {
    protected double x1, y1, x2, y2;

    public Linea(){ this(0, 0, 1.0, 1.0); }
    // constructor de la clase
    public Linea(double p1x, double p1y, double p2x, double p2y) {
        x1 = p1x;
        x2 = p2x;
        y1 = p1y;
        y2 = p2y;
    }
    public double area() { return (x1-x2)*(y1-y2); }
    public double perimetro() { return 2.0 * ((x1-x2)+(y1-y2)); }


}
