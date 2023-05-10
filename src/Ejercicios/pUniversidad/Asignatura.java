package Ejercicios.pUniversidad;

import java.util.Objects;

public class Asignatura {
    String nombre;
    String nota;
    boolean evaluada;
    public Asignatura(String nombre){
        this.nombre=nombre;
    }
    public String toString(){
        return nombre+ "  "+ nota+ " "+ evaluada;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asignatura that = (Asignatura) o;
        return Objects.equals(nombre, that.nombre);
    }


}
