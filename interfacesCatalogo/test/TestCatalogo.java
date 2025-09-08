package test;

import java.time.LocalDate;
import clases.Comics;
import clases.IPhone;
import clases.Libro;
import clases.TvLcd;
import interfaz.IElectronico;
import interfaz.ILibro;
import interfaz.IProducto;

public class TestCatalogo {
    public static void main(String[] args) {
        IProducto[] productos = new IProducto[6];

        productos[0] = new IPhone(25000, "Apple", "Negro", "iPhone 14");
        productos[1] = new TvLcd(34000, "Sony", 55);
        productos[2] = new Libro(1100, "Arthur Golden", "Memorias de una Geisha",
                "Penguin Random House Grupo Editorial", LocalDate.of(1997, 9, 27));
        productos[3] = new Libro(800, "Jamie McGuire", "Maravilloso desastre",
                "Santillana", LocalDate.of(2011, 5, 26));
        productos[4] = new Comics(1200, "Stan Lee", "Spiderman",
                "Marvel Comics", LocalDate.of(1994, 5, 10), "Peter Parker");
        productos[5] = new IPhone(28000, "Apple", "Blanco", "iPhone 15");

        for (IProducto p : productos) {
            System.out.println("---------------------------------");
            System.out.println("Clase: " + p.getClass().getSimpleName());
            System.out.println("Precio base: " + p.getPrecio());
            System.out.println("Precio venta: " + p.getPrecioVenta());

            if (p instanceof IElectronico) {
                IElectronico e = (IElectronico) p;
                System.out.println("Fabricante: " + e.getFabricante());
            }

            if (p instanceof ILibro) {
                ILibro l = (ILibro) p;
                System.out.println("Título: " + l.getTitulo());
                System.out.println("Autor: " + l.getAutor());
                System.out.println("Editorial: " + l.getEditorial());
                System.out.println("Fecha publicación: " + l.getFechaPublicacion());
            }

            if (p instanceof Comics) {
                Comics c = (Comics) p;
                System.out.println("Personaje: " + c.getPersonaje());
            }

            if (p instanceof IPhone) {
                IPhone i = (IPhone) p;
                System.out.println("Modelo: " + i.getModelo());
                System.out.println("Color: " + i.getColor());
            }

            if (p instanceof TvLcd) {
                TvLcd tv = (TvLcd) p;
                System.out.println("Pulgadas: " + tv.getPulgada());
            }
        }
    }
}
