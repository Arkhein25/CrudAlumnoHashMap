package model;

import java.util.Iterator;
import java.util.List;

public class AlumnoIterator implements Iterator<Alumno>{
    private List<Alumno> alumnos;
    private int pos = 0;

    public AlumnoIterator(List<Alumno> alumnos) {
        this.alumnos = alumnos;
        this.pos = pos;
    }

    @Override
    public boolean hasNext() {
        return pos < alumnos.size();
    }

    @Override
    public Alumno next() {
        return alumnos.get(pos++);
    }

    @Override
    public void remove() {
        if (pos <= 0) {
            System.out.println("No existen elementos para eliminar.");
        }
        alumnos.remove(--pos);
    }
}
