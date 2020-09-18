
package provaq3;

import java.util.Scanner;

public class PROVAQ3 {

    public static void main(String[] args) {

        Scanner lado = new Scanner(System.in);
        
        System.out.print("Informe lado X =>");
        double x = lado.nextDouble();
        
        System.out.print("Informe lado Y =>");
        double y = lado.nextDouble();
       
        System.out.print("Informe lado Z =>");
        double z = lado.nextDouble();
        
        if(x == y && x == z){
            System.out.println("TRIANGULO EQUILATERO");
        }else if(x == y || x == z){
            System.out.println("TRIANGULO ISOSCELES");
        }else{
            System.out.println("TRIANGULO ESCALENO");
        }
    }
    
}
