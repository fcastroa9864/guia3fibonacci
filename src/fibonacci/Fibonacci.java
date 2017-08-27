/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
import java.util.*;
/**
 *
 * @author FREDY CASTRO
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        int numero,temp1,temp2,i;

        System.out.print("¿Que cantidad de terminos desea? --> ");
        numero = sc.nextInt();
        
        temp1=1;
        temp2=1; 

        System.out.print(temp1 + " ");
        for(i=2;i<=numero;i++){
             System.out.print(temp2 + " ");
             temp2 = temp1 + temp2;
             temp1 = temp2 - temp1;
        }
        System.out.println();
        
    }
    
}
