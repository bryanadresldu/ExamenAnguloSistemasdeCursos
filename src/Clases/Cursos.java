package Clases;

public class Cursos {
    private String Id;
    private String nombre;
    private int duracion;
    private double precio;
    private Docente docente;
    private Estudiante estudiente;


    public Cursos(String Id, String nombre, double precio, int duracion) {
        this.Id = Id;
        this.nombre = nombre;
        this.precio = precio;
        this.duracion = duracion;
    }

    public void mostrarInformacion(){
        System.out.println(Id+"  Nombre Curso: "+nombre+" Duracion: "+duracion+"semanas "+" Precio: "+precio);

    }

    public void asignarDocente(Docente docente) {
        this.docente = docente;
    }

    public void mostrarResumen() {
        System.out.println("Curso: " + nombre + ", Duración: " + duracion + " semanas, Precio: $" + precio);
        if (docente != null) {
            docente.mostrarInformacion();
        } else {
            System.out.println("Docente no asignado.");
        }
    }

    public double getPrecio() {
        return precio;
    }
}
