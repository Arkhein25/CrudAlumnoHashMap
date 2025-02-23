package delete;

import model.Alumno;
import model.AlumnoIterator;
import input.Input;
import output.Output;

import java.util.List;

public class BorrarAlumno {
    public void bajaAlumno(List<Alumno> alumnos) {
        Output.mostrarListado(alumnos);
        int id = Input.leerEntero("Introduzca el id del alumno a dar de baja: ");
        AlumnoIterator iterator = new AlumnoIterator(alumnos);
        boolean encontrado = false;
        while (iterator.hasNext() && !encontrado) {
            Alumno alumno = iterator.next();
            if (alumno.getId() == id) {
                iterator.remove();
                encontrado=true;
            }
        }
    }
}
