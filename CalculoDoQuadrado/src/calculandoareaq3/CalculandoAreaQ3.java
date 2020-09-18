//Escreva uma classe Quadrado com atributo lado do tipo double. A classe deve
//ter um construtor que recebe como parâmetro o lado do quadrado. Deve também
//ter os métodos area() e perimetro() que retornam respectivamente a área e o
//perímetro do quadrado, cujas fórmulas são as seguintes:
//a. area = lado²
//b. perimetro = 4 x lado
package calculandoareaq3;

import java.util.Scanner;

public class CalculandoAreaQ3 {

    public static void main(String[] args) {

        Quadrado C1 = new Quadrado(2);
        Scanner lado = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println(">>>CALCULO DO QUADRADO<<<");
        System.out.println("--------------------------");
        System.out.print("Informe o lado: ");
        double lado_quadrado = lado.nextInt();
        System.out.println("--------------------");        
        System.out.println("-- > RESULTADO  < --");
        System.out.println("--------------------");        
       C1. status();
    }
    
}