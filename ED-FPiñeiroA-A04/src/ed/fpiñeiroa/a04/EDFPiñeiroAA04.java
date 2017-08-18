/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.fpiñeiroa.a04;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class EDFPiñeiroAA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //Prueba de binario
       System.out.println("Introduzca el tamaño del vector: ");
        Scanner size = new Scanner(System.in);
        int n=size.nextInt();
        
        
        Binario main = new Binario();
        main.setVector(main.RandomV(n));
        main.seleccion();
        System.out.println(main.showVector());
    }
    
}
