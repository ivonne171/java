package controller;
import model.Prestamo;


public class Test {
    public static void main(String[] args) {
        Prestamo p1 = new Prestamo("Libro 1", "Autor X","Libro","Ivonne Bravo","12/01/2025","20/01/2025");
        p1.imprimir();
    }
}
