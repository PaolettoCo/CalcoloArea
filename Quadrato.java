public class Quadrato extends Forma {
    public Quadrato (double lato) {
        super.lato = lato;
    }
    @Override
    public double calcoloArea() {
        return super.lato * super.lato;
    }
}
