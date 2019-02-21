public class Circulo {
    protected double x, y, rad;
    public Circulo(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.rad = r;
    }
    public Circulo() {
        this(0, 0, 1);
    }

}
