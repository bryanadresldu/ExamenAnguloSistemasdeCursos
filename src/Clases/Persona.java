package Clases;

public class Persona {
        private String nombre;
        private String cedula;
        private Cursos curso;

    public Persona(String nombre, String cedula, Cursos curso) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.curso = curso;
    }

    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Cedula: "+cedula);

    }



    public String getNombre() {
        return nombre;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }
}
