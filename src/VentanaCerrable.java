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
import java.awt.event.*;

public class VentanaCerrable extends Frame implements WindowListener {

    public VentanaCerrable() {
        super();
    }

    public VentanaCerrable(String title) {
        super(title);
        setSize(500, 500);
        addWindowListener(this);
    }

    public void windowActivated(WindowEvent e) {;
    }

    public void windowClosed(WindowEvent e) {;
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowDeactivated(WindowEvent e) {;
    }

    public void windowDeiconified(WindowEvent e) {;
    }

    public void windowIconified(WindowEvent e) {;
    }

    public void windowOpened(WindowEvent e) {;
    }

}
