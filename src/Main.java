import Bliblioteca.Inventario;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Inventario inventario = new Inventario("Descripción del inventario", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());


        Scanner scanner = new Scanner(System.in);


        System.out.print("Título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("ISBN del libro: ");
        String isbn = scanner.nextLine();
        System.out.print("Editorial del libro: ");
        String editorial = scanner.nextLine();

        inventario.agregarLibro(titulo, autor, isbn, editorial);


        scanner.close();

        inventario.mostrarInventario();
    }

}

