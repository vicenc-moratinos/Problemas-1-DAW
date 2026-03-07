public class PruebaFiguras {

    public static void main(String[] args) {

        Figuras[] figuras = new Figuras[Figuras.TIPOS];

        figuras[0] = new Circulo(10);
        figuras[1] = new Cuadrado(5);
        figuras[2] = new Triangulo(3, 6);

        for (int i = 0; i < Figuras.TIPOS; i++) {
            System.out.printf("Area: %.2f\n", figuras[i].calcularArea());
        }

    }
}