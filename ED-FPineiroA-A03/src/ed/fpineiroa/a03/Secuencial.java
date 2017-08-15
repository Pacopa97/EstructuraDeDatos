/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.fpineiroa.a03;

/**
 *
 * @author franc
 */
   public class Secuencial extends FetchClass{
   @Override
    int Fetch(int n) {
        for(int i=0; i<vector.length; i++){  // Recorre el arreglo para encontrar el numero deseado, de uno en uno
                                             // y si no lo encuentra, regresa -1, indicando que no existe
            if(vector[i]== n){
                return i;
        }
        }
        return -1;
    }

    
}
