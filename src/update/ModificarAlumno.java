package update;

import model.Alumno;
import model.AlumnoIterator;
import input.Input;
import output.Output;

import java.util.List;

public class ModificarAlumno {
    public void modificarNota(List<Alumno> alumnos){
        Output.mostrarListado(alumnos);
        int id=Input.leerEntero("Introduzca el Id de Alumno a modificar: ");
        AlumnoIterator iterator=new AlumnoIterator(alumnos);
        boolean encontrado=false;
        while(iterator.hasNext()&&!encontrado){
            Alumno alumno=iterator.next();
            if(alumno.getId()==id){
                String asignatura=Input.leerCadena("Introduzca el nombre de la asignatura a modificar: ");
                double nuevaNota=Input.leerDouble("Introduzca la nueva nota");
                alumno.setNota(asignatura,nuevaNota);
                encontrado=true;
            }
        }
    }
}
