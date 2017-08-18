/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.fpiñeiroa.a04;

/**
 *
 * @author franc
 */
 public class Binario extends FetchClass implements Ordenamientos {
@Override
public int Fetch(int num){ 
    int n = vector.length;
  //Se declaran los 3 pivotes de referencia: inicio, fin y centro
    int center;
    int start = 0;
    int last = n-1;

   
    //Se entra en un ciclo while mientras que el numero de inicio sea menor o igual al del fin
    while(start<=last){ 
     center=(start+last)/2; //Se suma el inicio y el numero de fin, para despues dividirlos entre 2 y encontrar el centro del arreglo
     
     if(vector[center]==num)
         return center; //Se regresa el valor del centro
     
     if(num < vector [center] ){ //Si el valor del numero es menor al del centro se recorrer el pivote final a la posicion centro-1
        last=center-1; 
     }
     else {
       start =center+1; //Si el valor del numero es mayor al del centro se recorre el pivote inicial a centro+1
     }
     
   }
   return -1;
 
 }
 

   @Override
    public void seleccion() {
        int menor,aux;
        for(int i=0; i<vector.length;i++){
            menor=i;
            for(int j=i+1;j<vector.length;j++){
                if(vector[j]<vector[menor]){
                    menor=j;
                }
            }
            if(i != menor){
            aux=vector[i];
            vector[i]=vector[menor];
            vector[menor]=aux;
        }
    }
    }
}

 


    

