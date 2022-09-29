package tp4;

import java.util.HashSet;

public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet <Materia> listaMaterias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo=legajo;
        this.apellido=apellido;
        this.nombre=nombre;
        this.listaMaterias=new HashSet();}

    public int getLegajo() {
        return legajo;
    }

    public void serLegajo(int legajo) {
        this.legajo=legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido=apellido;
    }

    public String getNombre() {
        return nombre;   
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    } 

    public void agregarMateria(Materia m) {
        this.listaMaterias.add(m);
    }

    public int cantidadMaterias() {
        return listaMaterias.size();
    }
}
