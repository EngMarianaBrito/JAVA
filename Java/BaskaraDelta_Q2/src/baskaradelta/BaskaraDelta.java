//@author Mariana Brito
package baskaradelta;

import java.util.Scanner;
import java.math.MathContext;

public class BaskaraDelta {
    public static void main(String[] args) {
        
       Scanner valores = new Scanner(System.in);
       
       //perfume
       System.out.println("------------------------------------- ");
       System.out.println("\t>>EQUACAÇÃO DO 2°GRAU<<");
       System.out.println("------------------------------------- ");
       System.out.println("INFORME O QUE SE PEDE!");
               
       //colhendo valores 
       System.out.print("->A: ");
       double valor_A   = valores.nextDouble();
       
       System.out.print("->B: ");
       double valor_B   = valores.nextDouble();
       
       System.out.print("->C: ");
       double valor_C   = valores.nextDouble();
       
       valores.close();
       
       //calculo
       double delta = (valor_B * valor_B) - (4 * valor_A * valor_C);
       double xUm = (-valor_B + Math.sqrt(Math.abs(delta))) / 2 * valor_A;
       double xDois = (-valor_B - Math.sqrt(Math.abs(delta))) / 2 * valor_A;
       
       //resultado
       System.out.println("------------------------");
       System.out.println("X': "+xUm);
       System.out.println("X'': "+xDois);
       System.out.println("------------------------");
    }
    
}
