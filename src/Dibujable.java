/**
 *
 * @author S-Nancy
 */
import java.awt.Graphics;

public interface Dibujable {
    
    public void dibujar(Graphics dw);
    public Dibujable trasladar(double dx, double dy);
    public Dibujable rotar(double deg);
    public Dibujable escalar(double fx, double fy);
    public Dibujable sizallar(double a, double b);
  //  public void setPosicion(double x, double y);    
   
   
}
