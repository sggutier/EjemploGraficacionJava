public class Punto {
    public double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto trasladar(double dx, double dy) {
        return new Punto(x + dx, y + dy);
    }

    public Punto rotar(double deg) {
        double rad = Math.toRadians(deg);
        return new Punto(
                x * Math.cos(rad) - y * Math.sin(rad),
                x * Math.sin(rad) + y * Math.cos(rad));
    }

    public Punto escalar(double fx, double fy) {
        return new Punto(x * fx, y * fy);
    }

    public Punto sizallar(double a, double b) {
        return new Punto(x + a*y, y + b*x);
    }
}
