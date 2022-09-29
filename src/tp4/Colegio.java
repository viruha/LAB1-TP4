
package tp4;

public class Colegio {


    public static void main(String[] args) {
        Materia ingles1 = new Materia(1,"Ingles 1",1);
        Materia matematicas1 = new Materia(2,"Matemáticas 1",1);
        Materia laboratorio1 = new Materia(3,"Laboratorio 1",1);
        Alumno aluLopez = new Alumno(1001,"López", "Martin");
        Alumno aluMartinez = new Alumno(1002,"Martínez", "Brenda");
        
        
        aluLopez.agregarMateria(ingles1);
        aluLopez.agregarMateria(matematicas1);
        aluLopez.agregarMateria(laboratorio1);
        
        aluMartinez.agregarMateria(ingles1);
        aluMartinez.agregarMateria(matematicas1);
        aluMartinez.agregarMateria(laboratorio1);
        
        aluMartinez.agregarMateria(laboratorio1);
        
        System.out.println("El alumno " + aluLopez.getApellido() + " esta inscripto en " + aluLopez.cantidadMaterias() + " materias.");
        System.out.println("El alumno " + aluMartinez.getApellido() + " esta inscripto en " + aluMartinez.cantidadMaterias() + " materias.");
        
        
        
        

        
        
    }
    
}
