/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TSP;

/**
 *
 * @author Gabriel
 */
public class Mapa {
    public static int[][] generarMatrixDeDistancias(int dim){
        int[][] arr=new int[5][5];
        arr[0][0]=0;
        
        arr[0][1]=1;
        arr[1][0]=1;
        arr[0][2]=3;
        arr[2][0]=3;
        arr[0][3]=2;
        arr[3][0]=2;
        arr[0][4]=8;
        arr[4][0]=8;

        arr[1][1]=0;
        
        arr[1][2]=1;
        arr[2][1]=1;
        arr[1][3]=2;
        arr[3][1]=2;
        arr[1][4]=3;
        arr[4][1]=3;
        
        arr[2][2]=0;
        
        arr[2][3]=1;
        arr[3][2]=1;
        arr[2][4]=2;
        arr[4][2]=2;

        arr[3][3]=0;
        
        arr[3][4]=1;
        arr[4][3]=1;
        
        arr[4][4]=0;
        return arr;
    }
}