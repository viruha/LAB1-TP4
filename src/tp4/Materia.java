package tp4;

import java.util.Objects;

public class Materia {

    private int idMateria;

    private String nombre;

    private int anio;

    public Materia(int idMateria, String nombre, int anio) {
    this.idMateria=idMateria;
    this.nombre=nombre;
    this.anio=anio;}


    public int getIdMateria() {
      return idMateria;}

    public void setIdMateria(int idMateria) {
    this.idMateria=idMateria;}

    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
    this.nombre=nombre;}

    public int getAnio() {
      return anio;  
    }

    public void setAnio(int anio) {
    this.anio=anio;}

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", anio=" + anio + '}';
    }

}

