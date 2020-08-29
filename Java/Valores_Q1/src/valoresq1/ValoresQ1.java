/*
 Faça um programa que receba um valor que é o valor pago, um segundo valor que é o preço do
produto e apresente ao usuário o troco a ser dado.
 @author Lia Mariana Brito
*/

package valoresq1; 

import java.util.Scanner;

public class ValoresQ1 {
    
    public static void main(String[] args) {

        //Colhendo os valores
        Scanner valores = new Scanner (System.in);
        
        System.out.print(">>CONSULTA DE TROCOS.");
        System.out.print("\nOlá!Informe o que se pede");
        System.out.print("\n------------------------\n");
        
        System.out.print("-> Valor pago: ");
        double varPago = valores.nextDouble();
        
        System.out.print("-> Valor do produto: ");
        double varProduto = valores.nextDouble();
        
        valores.close();
        
        //Calculando o troco
        double varTroco = varPago - varProduto;
  
        //Testando e vendo se haverá troco ,= e se houver qual sera o valor
        if(varPago < varProduto){
            System.out.print("\nSinto muito,mais você não tem o suficente pra comprar o produto.");
            System.out.print("\nFalta ->  "+ varTroco);
        }
        else if(varTroco == 0){
            System.out.print("\nSinto muito,não tem troco.");
        }
        else{
            System.out.print("\nO valor do seu troco é: "+ varTroco);
        }
        
        System.out.print("\n____________________________________");
        System.out.print("\nAté mais ,obrigada pela compra!.");

    }
    
}
