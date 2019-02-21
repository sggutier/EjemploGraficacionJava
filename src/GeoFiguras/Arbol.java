package GeoFiguras;

import GeoBasica.Poligono;
import GeoBasica.PoligonoGrafico;
import GeoBasica.RectanguloGrafico;

import java.awt.*;

public class Arbol extends MultiDibujable {
    public Arbol() {
        this.add(new PoligonoGrafico(new Poligono(
                new double[]{200,100,150,50,125,0,400,275,350,250,300},
                new double[]{100,165,165,230,230,300,300,230,230,165,165}),
                Color.GREEN));
        this.add(new RectanguloGrafico(100 ,100,Color.decode("#804000")).trasladar(150, 300));
    }
}
