
/**Ejercicio 6
Desarrollar una lista de Libros ordenada por título. La funcionalidad de la lista será la habitual:
conocer el número de libros que hay en la lista, insertar un nuevo libro (en la posición que le
corresponda), eliminar el libro de una determinada posición y obtener el libro de una determinada
posición. También incluirá un método para buscar un libro a partir de una parte de su título (sin
distinguir entre mayúsculas y minúsculas); el método devolverá la posición en la que se encuentra
el libro (–1 si no se encuentra). */

package libro;


public class ListaLibro {

    private Libro[] arrayLibro;

    public ListaLibro() {
        this.arrayLibro = new Libro[5];
    }

    public void addLibro(Libro libro, int index) {
        arrayLibro[index] = libro;
    }

    public void imprimirArrayLibros() {
        for (int i = 0; i < this.arrayLibro.length; i++) {
            this.arrayLibro[i].imprimirLibro();
        }
    }

    public void ordenarArrayLibros() {
        String abc = "abcdefghijklmnopkrstuwyz123456789";


        for (int i = 0; i < this.arrayLibro.length; i++) {
            System.out.println(abc.indexOf(this.arrayLibro[i].titulo.charAt(0)));
        }
    }

    public static void main (String[]args) {

        ListaLibro arrayLibros = new ListaLibro();
        arrayLibros.arrayLibro[0] = new Libro("Cien años de soledad", "Gabriel García Márquez", 978030, "Sudamericana", 471);
        arrayLibros.arrayLibro[1] = new Libro("1984", "George Orwell", 978045, "Secker & Warburg", 328);
        arrayLibros.arrayLibro[2] = new Libro("El Quijote", "Miguel de Cervantes", 978842, "Francisco de Robles", 1032);
        arrayLibros.arrayLibro[3] = new Libro("El Principito", "Antoine de Saint-Exupéry", 978207, "Gallimard", 96);
        arrayLibros.arrayLibro[4] = new Libro("Fundación", "Isaac Asimov", 978034, "Gnome Press", 255);

        arrayLibros.ordenarArrayLibros();
        arrayLibros.imprimirArrayLibros();
        System.out.println("hola");
        for (int i = 0; i < arrayLibros.arrayLibro.length; i++ ) {
            //arrayLibros.arrayLibro[i].imprimirLibro();

        }
      
    }
}