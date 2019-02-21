/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S-Nancy
 */
import java.awt.*;
import java.util.Vector;
import java.util.Enumeration;

public class PanelDibujo extends Panel {

    private Vector v;

    public PanelDibujo(Vector vect) {
        super(new FlowLayout());
        this.v = vect;
    }

    public void paint(Graphics g) {
        Dibujable dib;
        Enumeration e;
        e = v.elements();
        while (e.hasMoreElements()) {
            dib = (Dibujable) e.nextElement();
            dib.dibujar(g);
        }
    }

}
