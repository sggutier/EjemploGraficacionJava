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
import GeoFiguras.MultiDibujable;
import Logo.Cubo;
import Logo.Dino;

import java.util.ArrayList;
import java.util.Vector;

public class Ejemplo {

    public static void main(String arg[]) throws InterruptedException {            
        VentanaCerrable ventana = new VentanaCerrable("2D");
        ArrayList<Dibujable> v = new ArrayList<>();
        MultiDibujable d = new Dino().escalar(7, 7);
        d = d.trasladar(-d.minX(), -d.minY());
        v.add(d);

        System.out.println("v contiene: " + v.size());

        PanelDibujo mipanel = new PanelDibujo(v);
        ventana.add(mipanel);
        ventana.setSize(800, 600);
        ventana.setVisible(true);
    }
}
