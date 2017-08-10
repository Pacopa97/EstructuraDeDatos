/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.fpiñeiroa.a02;

/**
 *
 * @author franc
 */
public class Recursividad {
    public static int factorial (int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
        
    }
    
    int vector[] = {10,20,30};
    
    public static int sumaVector (int[] vector,int n){
 
        if(n==0){
            return vector[n];
        }
        else{
            return sumaVector(vector,(n-1))+ vector[n];
        }
    
}
    
  public static int multiVector (int[] vector,int n){
 
        if(n==0){
            return vector[n];
        }
        else{
            return multiVector(vector,(n-1))* vector[n];
        }  
}
}
