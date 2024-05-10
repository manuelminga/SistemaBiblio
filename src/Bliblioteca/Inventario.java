package Bliblioteca;
import java.util.Scanner;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Inventario {
    //Constructor
    public Inventario(String descripcion, ArrayList<RecursosLiterarios> recursosLiterarios, ArrayList<Biblioteca> biblioteca, ArrayList<Usuario> usuario, ArrayList<Tematica> tematica) {
        this.descripcion = descripcion;
        this.recursosLiterarios = recursosLiterarios;
        this.biblioteca = biblioteca;
        this.usuario = usuario;
        this.tematica = tematica;
    }
    //Atributos
    public String descripcion;

    //Metodos

    public void ordenar(){

    };
    public void agregar(){

    };
    public void buscar(){

    };
    public void gestionar(){

    };

    ArrayList<RecursosLiterarios> recursosLiterarios;
    ArrayList<Biblioteca> biblioteca;
    ArrayList<Usuario> usuario;
    ArrayList<Tematica> tematica;

    public void mostrarInventario() {
        System.out.println("Inventario:");
        for (RecursosLiterarios recurso : recursosLiterarios) {
            if (recurso instanceof Libro) {
                Libro libro = (Libro) recurso;
                System.out.println("Título: " + libro.titulo);
                System.out.println("Autor: " + libro.autor);
                System.out.println("ISBN: " + libro.isbn);
                System.out.println("Editorial: " + libro.editorial);
                System.out.println();
            }
        }
    }


    public void agregarRevista(String nationalGeographic, String nationalGeographicSociety, int i, int i1, String ciencia, String mundo, String historia) {
    }

    public void agregarPeriodico(String elUniversal, String elUniversal1, int i, int i1, String nacional, String internacional, String deportes) {
    }

    public void agregarLibro(String titulo, String autor, String isbn, String editorial) {
        // Crear una instancia de Libro con los datos proporcionados
        Libro nuevoLibro = new Libro();
        nuevoLibro.titulo = titulo;
        nuevoLibro.autor = autor;
        nuevoLibro.isbn = isbn;
        nuevoLibro.editorial = editorial;

        // Agregar el nuevo libro a la lista de recursos literarios
        recursosLiterarios.add(nuevoLibro);

        System.out.println("Libro agregado correctamente: " + nuevoLibro.titulo);
    }




    @Override
    public String toString() {
        return "Inventario{" +
                "descripcion='" + descripcion + '\'' +
                ", recursosLiterarios=" + recursosLiterarios +
                ", biblioteca=" + biblioteca +
                ", usuario=" + usuario +
                ", tematica=" + tematica +
                '}';
    }
}
