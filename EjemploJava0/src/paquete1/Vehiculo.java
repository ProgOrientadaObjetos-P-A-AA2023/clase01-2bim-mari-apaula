/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Vehiculo {
    private String tipo;
    private double costo;
    private String matricula;
            
    public Vehiculo(String t, double c, String m){
        tipo = t;
        costo = c;
        matricula = m;
    }
    
    public void establecerNombre(String t){
        tipo = t;
    }

    public void establecerCostos(double m){
        costo = m;
    }
    
    public String obtenerNombre(){
        return tipo;
    }    
   
    public double obtenerCosto(){
        return costo;
    }
    
    public String obtenerMatricula() {
        return matricula;
    }

    public void establecerMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        
        
        String cadena = String.format("Tipo de vehiculo %s\n"
                + "Matricula del vehiculo: %s\n"
                + "\tEl costo del vehiculo es: %.2f", 
                tipo,
                matricula,
                obtenerCosto());
        return cadena;
    }

    
}
