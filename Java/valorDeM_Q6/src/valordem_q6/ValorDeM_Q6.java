/*
Escreva um algoritmo que lê um número não determinado de valores m, todos inteiros e positivos,
um valor de cada vez, e, se m<10 utiliza uma função que calcula o fatorial de m, e caso contrário,
utiliza uma função para obter o número de divisores de m (quantos divisores m possui). Escrever cada
m lido e seu fatorial ou seu número de divisores com uma mensagem adequada. Neste caso, temos um
programa principal e duas função.
@author Mariana Brito
*/
package valordem_q6;

import java.util.Scanner;

public class ValorDeM_Q6 {

    public static void main(String[] args) {

      Scanner valor = new Scanner(System.in);
      int opcao = 0;
        
      do{  
        //multipla escolha
        System.out.print("\n------------------------");
        System.out.print("\n>>PROBLEMA MATEMÁTICO<<"); 
        System.out.print("\n------------------------");
        System.out.print("\n1 - CONTINUAR");
        System.out.print("\n0 - SAIR");
        System.out.print("\nDigite o codigo da operação desejada: ");
        opcao = valor.nextInt();
           
        //valor de n e seus calculos
        if( opcao != 0){
             int fatorial = 1; 
               
             System.out.print("\n->INFORME O VALOR DE M: ");
             int valor_de_m  = valor.nextInt(); 
               
             for( int i = 2; i <= valor_de_m ; i++ ){
                fatorial *= i;
               }

             //condicional se <10 fatorial se >10 divisores
              if (valor_de_m < 10){
                  System.out.println("\nSeu fatorial é "+ fatorial);
              }else ;                  
                  System.out.println("\nSua quantidades de divisores é "+ calcularDivisores(valor_de_m));               
           }
           
        }while(opcao != 0);
    }
    public static int calcularDivisores(int valor_de_m){
        int quantidade = 0;
        for(int i = 1; i <= valor_de_m; i++){
            if(valor_de_m % i == 0){
                quantidade++;
            }
        }
        return quantidade;
    }

}
