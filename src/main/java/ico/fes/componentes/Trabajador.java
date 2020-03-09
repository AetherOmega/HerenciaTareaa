/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author Eduardo V
 */
import ico.fes.persona.Persona;

public class Trabajador extends Persona{
    private String salario;
    private String rfc;
    private String puesto;
    private int anioIngreso;

    public Trabajador() {
    }

    public Trabajador(String salario, String rfc,String puesto, int anioIngreso, String nombre, int edad, float altura) {
        super(nombre, edad, altura);
        this.salario = salario;
        this.rfc = rfc;
        this.anioIngreso = anioIngreso;
        this.puesto = puesto;
    }

    public Trabajador(String string, String amazing_SpiderMan, String peter_Parker, int i, float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
        public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
        public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public int salario(){
        System.out.println(this.salario +" el empleado gana: 50000...");
        return 1;
    }

    @Override
    public String toString() {
        String res=super.toString();
        res = res +"Salario:"+this.salario+"\n";
        res = res + "Rfc:"+this.rfc+"\n";
        res = res + "Puesto"+this.puesto+"\n";
        res = res + "Anio de Ingreso"+this.anioIngreso;
        return res;
    }
}