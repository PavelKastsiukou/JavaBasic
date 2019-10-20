public class HandlingAnException {
    public static void main(String[] args) {
     double x = -1;
        System.out.println(sqrt(x));
    }
    public static double sqrt(double x) {
        if (x>=0) {
            return Math.sqrt(x);
        }  else {
            throw new IllegalArgumentException ("Expected non-negative number, got " + x);
        }
    }
}
