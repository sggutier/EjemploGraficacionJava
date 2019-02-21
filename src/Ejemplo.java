/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S-Nancy
 */
import GeoBasica.*;
import GeoFiguras.Arbol;
import GeoFiguras.Estrella;

import java.util.Vector;
import java.awt.*;

public class Ejemplo {

    public static void main(String arg[]) throws InterruptedException {            
        VentanaCerrable ventana = new VentanaCerrable("2D");
        Vector v = new Vector();
//        Dibujable w = new CirculoGrafico(30, 30, 20, Color.red);
//        v.addElement(w);
//        v.addElement(new CuadradoGrafico(100, 100, 50, Color.green));
//        v.add(new LineaGrafica(200, 2, 300, 200, Color.orange));
//        Dibujable t = new TrianguloGrafico(33, 490 - 200, 163, 490 - 200, 3, 370 - 200, Color.cyan);
//
////        v.add(new GeoBasica.TrianguloGrafico(0, 0, 100, 0, 0, 300, Color.CYAN));
//
//        v.add(t);
//
//        PoligonoGrafico wo = (PoligonoGrafico) new RectanguloGrafico(3, 4, Color.pink).escalar(10,10).rotar(10).trasladar(70, 30);
//        v.add(wo);
//
//
//        v.add(new RectanguloGrafico(70, 70, Color.yellow).sizallar(-0.5, 0).trasladar(130, 0));
        v.add(new Arbol());
//        v.add(new Estrella().trasladar(100, 100));

        PanelDibujo mipanel = new PanelDibujo(v);
        ventana.add(mipanel);
        ventana.setSize(500, 400);
        ventana.setVisible(true);
    }
}
