package create;

import model.Alumno;
import input.Input;

import java.util.List;

public class CrearAlumno {
    public void altaAlumnos(List<Alumno> alumnos) {
        for (int i = 0; i < 2; i++) {
            System.out.println("Introduzca los datos del alumno" + (i + 1) + ":");
            int id = Input.leerEntero("ID: ");
            String nombre = Input.leerCadena("Nombre Completo: ");
            int edad = Input.leerEntero("Edad: ");
            String fechaNacimiento = Input.leerCadena("Fecha de Nacimiento (dd/mm/aaaa): ");
            Alumno alumno = new Alumno(id, nombre, edad, fechaNacimiento);

            for (int j = 0; j < 2; j++) {
                String asignatura = Input.leerCadena("Nombre de la asignatura" + (j + 1) + ": ");
                double nota = Input.leerDouble("Nota de la primera evaluación: ");
                alumno.addAsignatura(asignatura, nota);
            }
            alumnos.add(alumno);
        }
    }
}
