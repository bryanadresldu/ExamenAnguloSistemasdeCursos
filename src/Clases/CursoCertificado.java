package Clases;

public class CursoCertificado extends Cursos {
    public CursoCertificado(String Id, String nombre, double precio, int duracion) {
        super(Id, nombre, precio, duracion);
    }

    public double calcularPrecioFinal() {
        return getPrecio() * 1.25;
    }
}