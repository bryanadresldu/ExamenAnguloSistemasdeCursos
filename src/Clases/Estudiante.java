package Clases;

import com.sun.security.jgss.GSSUtil;

public class Estudiante extends Persona {

    int edad;
    boolean certificado;
    public Estudiante(String nombre, String cedula, int edad) {
        super(nombre, cedula);
        this.edad=edad;
    }


    public void asignarCurso(Cursos curso) {
        setCurso(curso);
    }

    public Estudiante(String nombre, String cedula,int edad, Cursos curso, boolean certificado) {
        super(nombre, cedula, curso);
        this.edad=edad;
        this.certificado=certificado;

    }

    public boolean validarEdad(){

        boolean validacionEdad;
         if (edad>13&&edad<60){
             System.out.println("Edad  validada");
             validacionEdad=true;
         }
         else
             validacionEdad=false;
        return validacionEdad;
    }
    public void mostrarInformacionCurso(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Curso: "+getCurso());


    }

    public boolean isCertificado() {
        return certificado;
    }

    public void setCertificado(boolean certificado) {
        this.certificado = certificado;
    }
}
