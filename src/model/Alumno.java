package model;

import java.util.HashMap;
import java.util.Map;

public class Alumno {
    private int id;
    private String nombreCompleto;
    private int edad;
    private String fechaNacimiento;
    private Map<String, Double> asignaturas;

    public Alumno(int id, String nombreCompleto, int edad, String fechaNacimiento) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.asignaturas = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Map<String, Double> getAsignaturas() {
        return asignaturas;
    }

    public void addAsignatura(String nombre, double nota) {
        asignaturas.put(nombre, nota);
    }
//
    public void setNota(String nombre, double nota) {
        if (asignaturas.containsKey(nombre)) {
            asignaturas.put(nombre, nota);
        }
    }
}
