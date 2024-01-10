public class Forma {
    public static double calcoloArea(int latoA, int latoB) {
        double area;
        if (latoA == latoB) {
            area = latoA * 2;
        } else {
            area = (latoA * latoB) / 2;
        }
        return area;
    }
}

