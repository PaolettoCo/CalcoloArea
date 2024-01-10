public class Rettangolo extends Forma{
    public Rettangolo (double base, double altezza) {
        super.base = base;
        super.altezza = altezza;
    }

    @Override
    public double calcoloArea() {
        return super.base * super.altezza;
    }
}
