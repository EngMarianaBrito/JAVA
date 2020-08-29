/*
Um número inteiro positivo N é um quadrado perfeito se existe um número K tal que K*K=N.
Faça um programa que receberá uma quantidade indefinida de números inteiros positivos
J (-10000<=J<=10000) até que J seja zero. A saída do programa deverá ser a quantidade
de quadrados perfeitos informados.
@authorn Lia Mariana Brito
*/
package quadradoperfeito_q5;

import java.util.Scanner;
import java.math.MathContext;

public class QuadradoPerfeito_Q5 {

  public static void main(String[] args) {
      
    Scanner valores = new Scanner(System.in);
    //declaração de variaveis
    double raiz_n;
    int quantidade_Quadrados = 0, opcao = 0 , valor_n = 0;

    System.out.println("------------------------------------- ");
    System.out.println("\t>>QUADRADO PERFEITO<<");
    System.out.println("------------------------------------- ");
    
    //loop
    do {
      System.out.print("->Digite um valor inteiro: ");
      valor_n = valores.nextInt();
    
      //calculo
      if (valor_n >= -10000 && valor_n <= 10000 && valor_n != 0) {
         raiz_n = Math.sqrt(valor_n);
           if ((int) raiz_n == raiz_n) {
               quantidade_Quadrados = quantidade_Quadrados + 1;
            }
        } 
      
    } while (valor_n != 0);//encerramento do loop
    
    //resultado
    System.out.println("\n-----------------------------------------");
    System.out.println("A quantidade de quadrados perfeitos é " + quantidade_Quadrados);
 
  }

}
