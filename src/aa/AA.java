/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa;

import ProblemaCaballo.ProblemaCaballo;
import Mochila.Articulo;
import Mochila.LeerDatos;
import java.util.ArrayList;
import aa.Data.Grafica;
import aa.Ordenamiento.Burbuja;
import aa.Ordenamiento.InsertSort;
import aa.Ordenamiento.MergeSort;
import aa.Ordenamiento.QuickSort;
import aa.Ordenamiento.BurbujaOptimizada;
import TSP.ADijkstra;
import TSP.Camino;
import Recursivo.Fibonacci;
import Busquedas.BusquedaSecuencial;
import Busquedas.Busquedas;
import Busquedas.GeneradorDatos;
import java.io.IOException;
import java.util.Arrays;
/**
 *
 * @author Gabriel
 */
public class AA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //int n = 10000;
        //int[] aux;

//        double[] tiempos = new double[n];//burbuja//recursivo
//        double[] tiempos1 = new double[n];//inser sort//recursivoDinamico
//        double[] tiempos2 = new double[n];// merge sort//Iterativo
//        double[] tiempos3 = new double[n];//burbuja Optimizada//IterativoDinamico
//        //double[] tiempos4 = new double[n];//Quick sort
//                
//        
//        Fibonacci b = new Fibonacci ();
//        Fibonacci b2 = new Fibonacci ();
//        Fibonacci b3 = new Fibonacci ();
//        Fibonacci b4 = new Fibonacci ();
////        Burbuja b = new Burbuja();
//        
//        InsertSort in = new InsertSort();
//        
//        MergeSort ms = new MergeSort();
//        
//        BurbujaOptimizada b2 = new BurbujaOptimizada();
//        
//        QuickSort qs = new QuickSort();
        
//         complejidad algoritmica Sumatoria ( Generar los datos aleatorios + busqueda + almacenar el tiempo)
//        for (int j = 1; j <=n; j++){
//            //aux = GeneradorDatos.generarArregloPeor(j);
//            b.ordenarFiboR(j);
//            tiempos[j-1] = (int) b.gettTotal();
//            System.out.println();
//        }
//        for (int j = 1; j <=n; j++){
//            //aux = GeneradorDatos.generarArregloPeor(j);
//            b2.ordenarFiboRD(j);
//            tiempos1[j-1] = (int) b2.gettTotal();
//            System.out.println();
//        } 
//        for (int j = 1; j <=n; j++){
//            //aux = GeneradorDatos.generarArregloPeor(j);
//            b3.ordenarFiboNR(j);
//            tiempos2[j-1] = (int) b3.gettTotal();
//            System.out.println();
//        }
//        for (int j = 1; j <=n; j++){
//            //aux = GeneradorDatos.generarArregloPeor(j);
//            b4.ordenarFiboNRD(j);
//            tiempos3[j-1] = (int) b4.gettTotal();
//            System.out.println();
//        }
////        for (int j = 0; j < n; j++){
////            aux = GeneradorDatos.generarArregloPeor(j);
////            qs.ordenarQS(aux);
////            tiempos4[j] = (int) qs.gettTotal();
////            System.out.println();
////        }
//        System.out.println();
//        Grafica g1 = new Grafica("N","Tiempo","Tiempos");
//        g1.agregarSerie("Recursivo",tiempos);
//        g1.agregarSerie("Recursivo Dina",tiempos1);
//        g1.agregarSerie("Iterativo",tiempos2);
//        g1.agregarSerie("Iterativo Dina",tiempos3);
//        //g1.agregarSerie("Quick",tiempos4);
//        
//        g1.crearGrafica();
//        g1.muestraGrafica();
//    }   
//        ADijkstra aux;
//        for (int x=0 ; x < 5;x++){
//        aux = new ADijkstra(5);
//        Camino c = aux.buscarCamino(x);
//        System.out.println("Ciudad= "+x+" Distancia Total: "+c.getDistanciaRecorrida());
//    }
//    int tam=50;
//    int lim=50;
//    ArrayList<int[]>datos=Tokenizador.tokenizar(lim, tam);
//    ArrayList<Integer>respuesta=Mochila.llenarMochila(100, datos.get(0), datos.get(1));
//    System.out.println("Objetos en la mochila ");
//        for (int i = 0; i < respuesta.size(); i++) {
//            System.out.println(respuesta.get(i)+"");
//        }
    }
}