package Mascota;

import GeoBasica.Dibujable;
import GeoBasica.PoligonoGrafico;
import GeoBasica.Punto;
import GeoBasica.RectanguloGrafico;
import GeoBasica.TextoGrafico;
import GeoFiguras.MultiDibujable;

import java.awt.*;
import java.util.Collection;

public class Dino extends MultiDibujable {

    public Dino() {
        this.add(new RectanguloGrafico(83, 55, 200, 146.0, 
                new GradientPaint(200 + 50, 0 + 100, Color.magenta,
                0 + 80, 200 + 150, Color.yellow, false)
        ));        
        this.add(new Lengua());
        this.add(new Dientes());
        this.add(new Brazo1());
        this.add(new Pata1());
        this.add(new Cuerpo());
        this.add(new Cubo());
        this.add(new Pata2());
        this.add(new Brazo2());
        this.add(new TextoGrafico("I").trasladar(105, 145));
        this.add(new TextoGrafico("S").trasladar(120, 145));
        this.add(new TextoGrafico("C").trasladar(135, 145));
    }
}
