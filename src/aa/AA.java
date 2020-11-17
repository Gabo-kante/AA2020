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
import aa.Ordenamiento.QuickSort;
import aa.Ordenamiento.BurbujaOptimizada;
import Recursivo.Fibonacci;
import Busquedas.BusquedaSecuencial;
import Busquedas.Busquedas;
import Busquedas.GeneradorDatos;
import java.util.Arrays;
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
        
        int n = 1000;
        int[] aux;

        double[] tiempos = new double[n];//burbuja
        double[] tiempos1 = new double[n];//inser sort
        double[] tiempos2 = new double[n];// merge sort
        double[] tiempos3 = new double[n];//burbuja Optimizada
        double[] tiempos4 = new double[n];//Quick sort
        
        
        
        Burbuja b = new Burbuja();
        
        InsertSort in = new InsertSort();
        
        MergeSort ms = new MergeSort();
        
        BurbujaOptimizada b2 = new BurbujaOptimizada();
        
        QuickSort qs = new QuickSort();
        
//         complejidad algoritmica Sumatoria ( Generar los datos aleatorios + busqueda + almacenar el tiempo)
        for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloPeor(j);
            b.ordenar(aux);
            tiempos[j] = (int) b.gettTotal();
            System.out.println();
        }
        for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloPeor(j);
            in.ordenarInSert(aux);
            tiempos1[j] = (int) in.gettTotal();
            System.out.println();
        } 
        for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloPeor(j);
            ms.OrdenarMergeSort(aux);
            tiempos2[j] = (int) ms.gettTotal();
            System.out.println();
        }
        for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloPeor(j);
            b2.ordenarBop(aux);
            tiempos3[j] = (int) b2.gettTotal();
            System.out.println();
        }
        for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloPeor(j);
            qs.ordenarQS(aux);
            tiempos4[j] = (int) qs.gettTotal();
            System.out.println();
        }
        System.out.println();
        Grafica g1 = new Grafica("N","Tiempo","Peor");
        g1.agregarSerie("burbuja",tiempos);
        g1.agregarSerie("Insert",tiempos1);
        g1.agregarSerie("Merge",tiempos2);
        g1.agregarSerie("BurbujaOp",tiempos3);
        g1.agregarSerie("Quick",tiempos4);
        
        g1.crearGrafica();
        g1.muestraGrafica();
    }   
}