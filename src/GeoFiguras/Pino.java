package GeoFiguras;

import GeoBasica.Poligono;
import GeoBasica.PoligonoGrafico;
import GeoBasica.RectanguloGrafico;

import java.awt.*;

public class Pino extends MultiDibujable {
    public Pino() {
        int cor = 70;
        this.add(new PoligonoGrafico(new Poligono(
                new double[]{200,200 - 1*cor,150,200 - 1.4*cor, 125,200 - 1.8*cor,  200 + 1.8*cor,275,200 + 1.4*cor,250,200 + 1*cor},
                new double[]{100,165,        165,230,           230,300,            300,          230,230,          165,165}),
                Color.green));
        this.add(new RectanguloGrafico(30 ,100,Color.decode("#804000")).trasladar(185, 300));
    }
}
