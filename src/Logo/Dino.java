package Logo;

import GeoFiguras.MultiDibujable;

public class Dino extends MultiDibujable {
    public Dino() {
        this.add(new Lengua());
        this.add(new Dientes());
        this.add(new Brazo1());
        this.add(new Pata1());
        this.add(new Cuerpo());
        this.add(new Cubo());
        this.add(new Pata2());
        this.add(new Brazo2());
    }
}
