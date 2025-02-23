package output;

import model.Alumno;

import java.util.List;

public class Output {
    public static void mostrarListado(List<Alumno> alumnos){
        System.out.println("ID\tNombre completo\tAsignatura 1 (nota)\tAsignatura 2 (nota)");
        for (Alumno alumno:alumnos){
            StringBuilder sb=new StringBuilder();
            sb.append(alumno.getId()).append("\t")
                    .append(alumno.getNombreCompleto()).append("\t");
                    alumno.getAsignaturas().forEach((asignatura, nota)->sb.append(asignatura).append(")\t"));
            System.out.println(sb.toString());
        }
    }
}
