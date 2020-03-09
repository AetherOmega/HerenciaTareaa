/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

/**
 *
 * @author Eduardo V
 */
import ico.fes.componentes.Alumno;
import ico.fes.componentes.Trabajador;


public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno Alumno1=new Alumno();
        Alumno1.setNombre("Juan Hernandez Garcia");
        Alumno1.setEdad(18);
        Alumno1.setAltura(1.70f);
        Alumno1.setnumeroCuenta ("35413131");
        Alumno1.setPromedio("7.5");
        Alumno1.setCarrera("Ing. en computacion \n");
        Alumno1.caminar();
        Alumno1.comer();
        System.out.println(Alumno1+"\n\n\n");
       
        Trabajador Profesor1=new Trabajador();
        Profesor1.setNombre("Monica Mendes Luna");
        Profesor1.setEdad(35);
        Profesor1.setAltura(1.60f);
        Profesor1.setSalario ("5000");
        Profesor1.setRfc("MELM8305281H0");
        Profesor1.setAnioIngreso(1999);
        Profesor1.setPuesto("Profesor");
        Profesor1.caminar();
        Profesor1.comer();
        System.out.println(Profesor1);
        
        
    }
    
}