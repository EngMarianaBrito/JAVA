/*
Escreva uma função que recebe por parâmetro um valor inteiro e positivo N e
retorna o valor de S.S = 1 + 1/1! + ½! + 1/3! + 1 /N!
@author Lia Mariana Brito
*/
package valors_q4;

import java.util.Scanner;

public class ValorS_Q4 {

    public static void main(String[] args) {

        //colhendo valor de n
        Scanner valor = new Scanner(System.in);
        System.out.println("------------------------------------- ");
        System.out.println("\t>>>FATORIAL<<< ");
        System.out.println("------------------------------------- ");
        System.out.println("Olá informe o que se pede");
        System.out.print("->valor para N: ");
        int n = valor.nextInt();
        
        //calculo da formula em geral
        double s = 1 + (1/fatorial(1)) + (1/fatorial(2)) + (1/ fatorial(3)) + (1/fatorial(n) );
       
        //imprimindo valor de n
        System.out.println("\nO seu resultado é "+s+ "!!!");
        System.out.println("----------------------------");
        System.out.println("\nAté mais");
                               
    }  
   
    public static long fatorial(int n){
        //calculo do fatorial
        long fatorial = 1;
        
        for (int i = 1; i < n; i++){
            fatorial *= i;
        }
        return fatorial;
    }
}
