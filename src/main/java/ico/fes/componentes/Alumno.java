/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *import ico.fes.Persona
 * @author Eduardo V
 */
    import ico.fes.persona.Persona;


public class Alumno extends Persona{
    private String numeroCuenta;
    private String carrera;
    private String promedio;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, String carrera,String promedio, String nombre, int edad, float altura) {
        super(nombre, edad, altura);
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setnumeroCuenta (String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }
    public int NumeroDeCuenta(){
        System.out.println(this.numeroCuenta +" 41516461...");
        return 1;
    }

    @Override
    public String toString() {
        String res=super.toString();
        res = res +"Numero DE Cuenta:"+this.numeroCuenta+"\n";
        res = res + "Carrera:"+this.carrera;
        res = res + "Promedio:"+this.promedio;
        return res;
    }
}
 
