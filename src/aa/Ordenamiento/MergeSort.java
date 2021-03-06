/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa.Ordenamiento;

import java.util.Arrays;
/**
 *
 * @author Gabriel
 */
public class MergeSort {
          
    public long tInicio;
    public long tFinal;
    public long tTotal;

    public MergeSort() {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
    }  

    public void OrdenarMergeSort(int []datos){
        this.tInicio = System.currentTimeMillis();
        Merge_sort(datos);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    public long gettFinal() {
        return tFinal;
    }

    public long gettInicio() {
        return tInicio;
    }

    public long gettTotal() {
        return tTotal;
    }
   
    private void Merge_sort(int[] datos) { 
        if (datos.length > 1) {
            int mitad = datos.length/2;//10/2=5

//changed range of leftArray from 0-to-q to 0-to-(q-1)           0 1 2 3 4 5 6 7 8 9
            int[] izq = Arrays.copyOfRange(datos, 0, mitad-1);//[2,4,5,6,7,8,9,3,6,3]
//changed range of rightArray from q-to-A.length to q-to-(A.length-1)
            int[] der = Arrays.copyOfRange(datos, mitad , datos.length-1); //(datos, 5, 9)

            Merge_sort(izq);
            Merge_sort(der);

            merge(datos,izq,der);
        }
    }

    static void merge(int[] datos, int[] iz, int[] dr) {
        int TotalElem = iz.length + dr.length;
        //int[] a = new int[totElem];
        int i,izi,dri;
        i = izi = dri = 0;
        while ( i < TotalElem) {
            if ((izi < iz.length) && (dri<dr.length)) {
                if (iz[izi] < dr[dri]) {
                    datos[i] = iz[izi];
                    i++;
                    izi++;
                }
                else {
                    datos[i] = dr[dri];
                    i++;
                    dri++;
                }
            }
            else {
                if (izi >= iz.length) {
                    while (dri < dr.length) {
                        datos[i] = dr[dri];
                        i++;
                        dri++;
                    }
                }
                if (dri >= dr.length) {
                    while (izi < iz.length) {
                        datos[i] = iz[izi];
                        izi++;
                        i++;
                    }
                }
            }
        }
        //return a;

    }         

}