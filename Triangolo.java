public class Triangolo extends Forma {
    public Triangolo (double base, double altezza) {
        super.base = base;
        super.altezza = altezza;
    }

    @Override
    public double calcoloArea() {
        return (super.base * super.altezza) / 2;
    }
}
