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

public void intercambio(int i,int j){
    
    int temp = vector[j];
    vector[j] = vector[i];
    vector[i] = temp;
    
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
            aux=vector[i];
            vector[i]=vector[menor];
            vector[menor]=aux;
        
    }
    }

    @Override
    public void insercion() {
      for(int i=1; i < vector.length; i++){
          int temp = vector[i];
          int j=i-1;
          
       while((j>=0) && (vector[j]> temp)){
           vector[j+1] = vector[j];
           j--;
           
           
       }
       vector[j+1] = temp;
      }
    }

    @Override
    public void burbuja(){
            for (int i=1; i< vector.length; i++){
	for(int j=0; j<vector.length-1; j++){
        if(vector[j]> vector[j+1]){
            intercambio(j,j+1);     
        }
            }
    }
 }

   public void mergeSort(int inicio, int fin){
        int i= inicio;
        int j= fin;
        int centro;
        
        
        centro= vector[(i+j)/2];
        do{
            while(vector[i]<centro)
            {
                i++;
            }
             while(vector[j]<centro)
            {
                j--;
            }
            if(i<=j)
            {
                intercambio(i,j);
                i++;j--;
            }
        }
        
        while(i<=j);
        if(inicio<j){
            mergeSort(inicio, j);
        }
        if(i < fin){
            mergeSort(i, fin);
        }
    }

   
}

 


    

