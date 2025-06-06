package est.ups.poo.examen.E1;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private List<Calificacion> calificaciones;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.calificaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void agregarCalificacion(Calificacion calificacion) {
        this.calificaciones.add(calificacion);
    }

    @Override
    public String toString() {
        return "Estudiante: " + nombre + "\n Calificaciones:\n" + calificaciones;
    }
}

