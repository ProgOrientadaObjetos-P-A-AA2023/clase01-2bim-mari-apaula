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
public class Empresa {

    /*    
    private String nombre;
    private Edificio [] edificios; // nombre, costo, costo_predio
                                   // el costo predio es igual a costo * 0.002
    private Vehiculo [] vehiculos; // tipo, matricula, valor
    private double costoBienesInmuebles;
    private double costoVehiculos;
    private double costoTotalBienes;
    private double costoTotalPagoPredio;
     */
    private String nombre;
    private Edificio[] edificios;
    private Vehiculo[] vehiculos; // tipo, matricula, valor
    private double costoBienesInmuebles;
    private double costoVehiculos;
    private double costoTotalBienes;
    private double costoTotalPagoPredio;

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerEdificios(Edificio[] m) {
        edificios = m;
    }

    public void establecerCostosBienesInmuebles() {
        double suma = 0;
        for (int i = 0; i < edificios.length; i++) {
            // for (int i = 0; i < obtenerEdificios().length; i++) {
            suma = suma + edificios[i].obtenerCosto();
        }

        costoBienesInmuebles = suma;
    }

    public void establecerCostosVehiculos() {
        double suma = 0;
        for (int i = 0; i < vehiculos.length; i++) {
            suma = suma + vehiculos[i].obtenerCosto();
        }
    }

    public void establecerCostoTotalPagoPredio() {
        double suma = 0;
        for (int i = 0; i < edificios.length; i++) {
            
            suma = suma + edificios[i].obtenerCosto_predio();
            costoTotalPagoPredio = suma;
        }

    }

    public void establecerVehiculos(Vehiculo[] v) {

        vehiculos = v;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Edificio[] obtenerEdificios() {
        return edificios;
    }

    public double obtenerCostosBienesInmuebles() {
        return costoBienesInmuebles;
    }

    public double obtenerCostoTotalPagoPredio() {
        return costoTotalPagoPredio;
    }

    @Override
    public String toString() {
        /*
        Empresa de Hojas
        Lista de Edificios
        1. EDIFICIO CENTRAL (20000)
        2. EDIFICIO NORTE (30000)
        3. EDIFICIO SUR (10000)
        4. EDIFICIO SECUNDARIO (5000)
        Total de inmuebles: 65000
        
        Lista de Vehiculos
        1. Auto, LBB0011 (10000)
        2. Camioneta, LCB0011 (20000)
        3. Auto, LBD0012 (6000)
        4. Camioneta, LCC0011 (10000)
        5. Camioneta, LDC0011 (25000)
        Total de inmuebles: 71000
        
        Total bienes: 136000
         */

        String reporte = String.format("%s\nLista de Edificio\n",
                obtenerNombre());
        for (int i = 0; i < edificios.length; i++) {
            reporte = String.format("%s%d. %s (%.2f) PREDIO(%.2f)\n",
                    reporte,
                    i + 1,
                    edificios[i].obtenerNombre().toUpperCase(),
                    edificios[i].obtenerCosto(),
                    edificios[i].obtenerCosto_predio());
        }
        reporte = String.format("%sTotal de predios: %.2f\n",
                reporte,
                obtenerCostoTotalPagoPredio());
        
        reporte = String.format("%sTotal de inmuebles: %.2f\n",
                reporte,
                costoBienesInmuebles);

        reporte = String.format("%s\nLista de Vehiculo\n",
                reporte);
        for (int i = 0; i < vehiculos.length; i++) {
            reporte = String.format("%s%d. %s %s (%.2f)\n",
                    reporte,
                    i + 1,
                    vehiculos[i].obtenerNombre().toUpperCase(),
                    vehiculos[i].obtenerMatricula(),
                    vehiculos[i].obtenerCosto());
        }

        return reporte;
    }
}
