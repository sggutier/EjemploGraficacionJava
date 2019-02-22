package GeoFiguras;

import GeoBasica.CirculoGrafico;

import java.awt.*;

public class ArbolNavidad extends MultiDibujable {
    public ArbolNavidad() {
        this.add(new Pino());
        int resf = 10;
        int xs[] = {12, -15, 27, -35, -41, -5, 15, 43, -9, 40, -50, 0, -28, 28, -65, 65};
        int ys[] = {35, 57, 68, 80, 115, 95, 119, 112, 135, 140, 143, 160, 171, 171, 171, 171};
        Color[] cs = {Color.red, Color.decode("#6f7cf1"), Color.decode("#6f7cf1"), Color.red, Color.blue, Color.decode("#f16fef"), Color.red, Color.red, Color.red, Color.red, Color.decode("#f16fef"), Color.red, Color.red, Color.decode("#6f7cf1"), Color.red, Color.decode("#6f7cf1"), Color.red, Color.decode("#6f7cf1"), Color.red, Color.decode("#6f7cf1"), Color.red, Color.red, Color.decode("#6f7cf1"), Color.decode("#6f7cf1"), Color.blue, Color.decode("#6f7cf1"), Color.blue, Color.decode("#6f7cf1"), Color.decode("#6f7cf1"), Color.decode("#6f7cf1"), Color.decode("#6f7cf1"), Color.decode("#f16fef"), Color.decode("#6f7cf1"), Color.decode("#6f7cf1"), Color.red, Color.decode("#6f7cf1"), Color.decode("#f16fef"), Color.decode("#6f7cf1"), Color.decode("#6f7cf1"), Color.red, Color.decode("#6f7cf1"), Color.decode("#f16fef"), Color.blue, Color.blue, Color.decode("#6f7cf1")};
        for(int i=0; i<xs.length; i++)
            this.add(new CirculoGrafico(200 + xs[i], 100 + ys[i], resf, cs[i]));
        this.add(new Estrella(20, 10, 8, Color.yellow).trasladar(200, 100));
//        this.add(new CirculoGrafico(200 - 22, 100 + 45, resf, Color.red));
    }
}
