/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio central");
        edf1.establecerCostos(20000);
        edf1.establecerCosto_predio();

        Edificio edf2 = new Edificio("Edificio norte");
        edf2.establecerCostos(30000);
        edf2.establecerCosto_predio();

        Edificio edf3 = new Edificio("Edificio sur");
        edf3.establecerCostos(10000);
        edf3.establecerCosto_predio();

        Edificio edf4 = new Edificio("Edificio secundario");
        edf4.establecerCostos(5000);
        edf4.establecerCosto_predio();
        

        Vehiculo v1 = new Vehiculo("Toyota", 246.2, "DEF754");
        v1.establecerCostos(30000);
        Vehiculo v2 = new Vehiculo("Kia", 246.2, "SER754");
        v2.establecerCostos(10000);
        Vehiculo v3 = new Vehiculo("Chevrolet", 246.2, "BNM754");
        v3.establecerCostos(5000);
        Vehiculo v4 = new Vehiculo("Mazda", 246.2, "DGF754");
        v4.establecerCostos(5000);

        Edificio[] listaEdificios = {edf1, edf2, edf3, edf4};
        Vehiculo[] listaVehiculo = {v1, v2, v3, v4};

        // double c = listaEdificios[2].obtenerCosto();
        //System.out.println(c);
        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        Empresa miempresa = new Empresa();
        miempresa.establecerNombre("Empresa de Hojas");
        miempresa.establecerEdificios(listaEdificios);
        miempresa.establecerCostosBienesInmuebles();
        miempresa.establecerCostoTotalPagoPredio();
        miempresa.establecerVehiculos(listaVehiculo);
        miempresa.establecerCostosVehiculos();

        // Imprimir el costo de los bienes inmuebles de la empresa  
        // System.out.printf("%.2f\n", miempresa.obtenerCostosBienesInmuebles());
        System.out.printf("%s\n", miempresa);
    }
}
