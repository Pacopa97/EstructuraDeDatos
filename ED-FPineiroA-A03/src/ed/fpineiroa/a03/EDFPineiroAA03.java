/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.fpineiroa.a03;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class EDFPineiroAA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
         
        System.out.println("Introduzca el tamaño del vector: ");
        Scanner size = new Scanner(System.in);
        int n=size.nextInt();
        
        Secuencial main = new Secuencial();
        main.setVector(main.RandomV(n));
        System.out.println(main.showVector());
        
    }
    
}
