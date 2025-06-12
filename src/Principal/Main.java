package Principal;

import Clases.Cursos;
import Clases.Docente;
import Clases.Estudiante;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Inscripción Académica – 'EPN-PLUS' ");
        // Creacion de cursos


        ArrayList<Cursos> cursosDisponoibles=new ArrayList<>();

        Cursos c1 = new Cursos("c1","Ofimatica",12.5,3);
        Cursos c2 = new Cursos("c2","Redes",15,5);
        Cursos c3 = new Cursos("c3","Interfaces",16,4);
        Cursos c4 = new Cursos("c4","Metodologias",18,5);

        cursosDisponoibles.add(c1);
        cursosDisponoibles.add(c2);
        cursosDisponoibles.add(c3);
        cursosDisponoibles.add(c4);

        // Registro de docente
        Docente d1=new Docente("Paul Lopez","12324",c1);
        Docente d2=new Docente("Maria Perez","3534",c2);
        Docente d3=new Docente("Luis Ayala","00453",c3);
        Docente d4=new Docente("Angi Arevalo","554655",c4);
        // asignar docente a curso
        c1.asignarDocente(d1);
        c2.asignarDocente(d2);
        c3.asignarDocente(d3);
        c4.asignarDocente(d4);

        System.out.println(" ------Registro de estudiante--------");
        System.out.println(" Registrar informacion");
        ArrayList<Estudiante> estudiantes=new ArrayList<>();
        Scanner leer=new Scanner(System.in);
        String nombreE, cedulaE;
        int edadE;
        System.out.println("Ingrese su nombre: ");
        nombreE=leer.nextLine();
        System.out.println("Ingrese su cedula: ");
        cedulaE=leer.nextLine();
        System.out.println("Ingrese su edad: ");
        edadE=leer.nextInt();


        Estudiante e1=new Estudiante(nombreE,cedulaE,edadE,null);
        estudiantes.add(e1);

        String opcion="";
        String opcionCurso;

        boolean validarEdad=e1.validarEdad();

        if (validarEdad){


        while (!opcion.equals("0")){
            System.out.println(" --------- Menu  --------");
            System.out.println("Bienvenido, "+ e1.getNombre());
            System.out.println("1. Matricular en curso");
            System.out.println("2. Registrar notas");
            System.out.println("0. Salir");

            System.out.println("Ingrese la opcion: ");
            opcion=leer.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("-----Matriculacion en curso--------");
                    System.out.println("Cursos disponibles");
                    for(Cursos c:cursosDisponoibles){
                         c.mostrarInformacion();
                    }

                    System.out.println("Ingrese el id curso ejemplo: c1: ");
                    opcionCurso=leer.nextLine();

                    switch (opcionCurso){
                        case "c1","C1":
                            e1.asignarCurso(c1);
                            System.out.println("Matriculado en: ");
                            c1.mostrarInformacion();
                            break;
                        case "c2","C2":
                            e1.asignarCurso(c2);
                            System.out.println("Matriculado en: ");
                            c2.mostrarInformacion();
                            break;
                        case "c3","C3":
                            e1.asignarCurso(c3);
                            System.out.println("Matriculado en: ");
                            c2.mostrarInformacion();
                            break;
                        case "c4","C4":
                            e1.asignarCurso(c4);
                            System.out.println("Matriculado en: ");
                            c2.mostrarInformacion();
                            break;
                        default:
                            System.out.println(" opcion no valida");

                    }

                    System.out.println("Desea certificado:  si/no");
                    boolean certificado;
                    String opinion;
                    opinion=leer.nextLine();
                    switch (opcionCurso){
                        case "Si","si","SI":
                            certificado=true;
                            break;
                        case "No","no","NO":
                            certificado=false;
                            break;
                        default:
                        System.out.println(" opcion no valida");

                    }


                    break;
                case "2":
                    System.out.println("2. Registrar notas");

                    break;
                case "0":
                    System.out.println("SALIENDO............");
                    break;

            }

        }

        }
        else
        {
            System.out.println("NO cumple con rango edad ");
        }






    }
}