package Ejercicios.pUniversidad;

import java.util.Objects;

public abstract class Persona {
    String dni;
    String nombre;
    public Persona(String dni){
        this.dni=dni;
    }
    public Persona(String nombre,String dni){
        this.dni=dni;
        this.nombre=nombre;

    }
    public String toString(){
        return nombre + "  "+ dni;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }


}
