package GeoBasica;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.AttributedCharacterIterator;

public class TextoGrafico implements Dibujable {
    private String texto ;
    private double x;
    private double y;
    private double siz;

    public TextoGrafico(String texto) {
        this.texto = texto;
        siz = 60;
    }

    public TextoGrafico(String texto, double x, double y, double siz) {
        this.texto = texto;
        this.x = x;
        this.y = y;
        this.siz = siz;
    }

    public TextoGrafico(String texto, double siz) {
        this.texto = texto;
        this.siz = siz;
    }

    @Override
    public void dibujar(Graphics dw) {
        Font uwu  = null;
        try {
            uwu = Font.createFont(Font.TRUETYPE_FONT, new File("Fuente.ttf")).deriveFont((float) siz);
        } catch (FontFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        dw.setColor(Color.black);
        dw.setFont(uwu);
        dw.drawString(texto, (int) Math.round(x), (int) Math.round(y));
    }

    @Override
    public Dibujable trasladar(double dx, double dy) {
        return new TextoGrafico(texto, x + dx, y + dy, siz);
    }

    @Override
    public Dibujable rotar(double deg) {
        return null;
    }

    @Override
    public Dibujable escalar(double fx, double fy) {
        return new TextoGrafico(texto, x*fx, y*fy, siz * Math.max(fx,fy));
    }

    @Override
    public Dibujable sizallar(double a, double b) {
        return null;
    }

    @Override
    public double minX() {
        return x;
    }

    @Override
    public double maxX() {
        return x;
    }

    @Override
    public double minY() {
        return y;
    }

    @Override
    public double maxY() {
        return y;
    }
}
