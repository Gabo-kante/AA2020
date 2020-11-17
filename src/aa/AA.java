/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa;

import aa.Data.Grafica;
import aa.Ordenamiento.Burbuja;
import aa.Ordenamiento.InsertSort;
import aa.Ordenamiento.MergeSort;
import Recursivo.Fibonacci;
import Busquedas.BusquedaSecuencial;
import Busquedas.Busquedas;
import Busquedas.GeneradorDatos;
/**
 *
 * @author Gabriel
 */
public class AA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n = 20000;
        int[] aux;

        double[] tiempos = new double[n];//burbuja
        double[] tiempos2 = new double[n];//inser sort
        double[] tiempos3 = new double[n];// merge sort
        
        Burbuja b = new Burbuja();
        
        InsertSort in = new InsertSort();
        
        MergeSort ms = new MergeSort();

       
        // complejidad algoritmica Sumatoria ( Generar los datos aleatorios + busqueda + almacenar el tiempo)
        for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloPeor(j);
            b.ordenar(aux);
            tiempos[j] = (int) b.gettTotal();
            System.out.println();
        }  
        for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloPeor(j);
            in.ordenarInSert(aux);
            tiempos2[j] = (int) in.gettTotal();
            System.out.println();
        }  
        for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloPeor(j);
            ms.OrdenarMergeSort(aux);
            tiempos3[j] = (int) ms.gettTotal();
            System.out.println();
        } 
        System.out.println();
        Grafica g1 = new Grafica("N","Tiempo","Tiempos");
        g1.agregarSerie("burbuja",tiempos);
        g1.agregarSerie("Insert",tiempos2);
        g1.agregarSerie("Merge",tiempos3);
        g1.crearGrafica();
        g1.muestraGrafica();
    }   
}