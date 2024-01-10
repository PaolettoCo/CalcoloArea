public class Main {
    public static void main(String[] args) {
        Rettangolo ret1 = new Rettangolo (3, 4);
        Triangolo tri1 = new Triangolo(3,4);
        Quadrato quad1 = new Quadrato(4);

        System.out.println(ret1.calcoloArea());
        System.out.println(tri1.calcoloArea());
        System.out.println(quad1.calcoloArea());
    }
}