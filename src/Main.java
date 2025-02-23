import model.Alumno;
import create.CrearAlumno;
import read.LeerAlumno;
import update.ModificarAlumno;
import delete.BorrarAlumno;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos=new ArrayList<>();
        CrearAlumno crearAlumno=new CrearAlumno();
        LeerAlumno leerAlumno=new LeerAlumno();
        ModificarAlumno modificarAlumno=new ModificarAlumno();
        BorrarAlumno borrarAlumno=new BorrarAlumno();

        crearAlumno.altaAlumnos(alumnos);
        leerAlumno.mostrarListado(alumnos);
        borrarAlumno.bajaAlumno(alumnos);
        leerAlumno.mostrarListado(alumnos);
        modificarAlumno.modificarNota(alumnos);
        leerAlumno.mostrarListado(alumnos);
    }
}
