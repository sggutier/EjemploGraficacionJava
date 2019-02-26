package GeoBasica; /**
 *
 * @author S-Nancy
 */
import java.awt.Graphics;

public interface Dibujable {
    
    void dibujar(Graphics dw);
    Dibujable trasladar(double dx, double dy);
    Dibujable rotar(double deg);
    Dibujable escalar(double fx, double fy);
    Dibujable sizallar(double a, double b);

    public double minX();
    public double maxX();
    public double minY();
    public double maxY();
   
   
}
