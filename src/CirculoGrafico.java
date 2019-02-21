import java.awt.*;

public class CirculoGrafico extends Circulo implements Dibujable {
    private Color color;

    public CirculoGrafico(double x1, double y1, double r, Color c) {
        super(x1, y1, r);
        this.color = c;
    }

    public void dibujar(Graphics dw) {
        dw.setColor(Color.BLACK);
        dw.drawOval((int) (x-rad), (int) (y-rad), (int) (rad*2), (int) (rad*2));
        dw.setColor(color);
        dw.fillOval((int) (x-rad) + 1, (int) (y-rad) +1, (int) (rad*2) - 1, (int) (rad*2) - 1);
    }

    @Override
    public Dibujable trasladar(double dx, double dy) {
        return null;
    }

    @Override
    public Dibujable rotar(double deg) {
        return null;
    }

    @Override
    public Dibujable escalar(double fx, double fy) {
        return null;
    }

    @Override
    public Dibujable sizallar(double a, double b) {
        return null;
    }
}
