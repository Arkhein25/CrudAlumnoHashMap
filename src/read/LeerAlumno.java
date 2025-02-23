package read;

import model.Alumno;
import output.Output;

import java.util.List;

public class LeerAlumno {
    public void mostrarListado(List<Alumno> alumnos){
        Output.mostrarListado(alumnos);
    }
}
