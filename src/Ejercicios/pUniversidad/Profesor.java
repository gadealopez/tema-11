package Ejercicios.pUniversidad;

public class Profesor extends Persona{
    Departamento d;
    public Profesor(String dni,String nombre,Departamento d){
        super(dni,nombre);
        this.d=d;

    }
    public String toString(){
        return nombre+" "+ dni+ " "+ d;
    }


}
