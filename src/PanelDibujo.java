/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S-Nancy
 */
import GeoBasica.Dibujable;

import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Enumeration;

public class PanelDibujo extends Panel {

    private ArrayList<Dibujable> v;

    public PanelDibujo(ArrayList<Dibujable> vect) {
        super(new FlowLayout());
        this.v = vect;
    }

    public void paint(Graphics g) {
        for(Dibujable dbj : v) {
            dbj.dibujar(g);
        }
    }

}
