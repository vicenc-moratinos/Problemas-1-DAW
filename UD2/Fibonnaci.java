public class Fibonnaci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;

        System.out.println("Serie de Fibonacci hasta 100:");

        while (a <= 100) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}