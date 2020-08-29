/*
 *João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento
 *diário de eu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo
 *regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo
 *excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e
 *verifique se há excesso. Se houver, gravar na variável excesso e na variável multa o valor da multa que
 *João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO
 */
//@author Mariana Brito

package pesopeixe;
import java.util.Scanner;
public class PesoPeixe {
    public static void main(String[] args) { 
        
        Scanner var = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("\t>>PESCARIA<<");
        System.out.println("------------------------------");
        System.out.print("Informe o peso do peixe -> "); 
        double var_peixe  = var.nextDouble();
        
        if (var_peixe <= 50){
            System.out.println("\nTenho uma boa noticia pra você!");
            System.out.println("O seu peixe esta no peso permitido!"); 
        }else if (var_peixe > 50){
            System.out.println("\nTenho uma mal noticia pra você!");
            System.out.println("O seu peixe não esta no peso permitido!");
            double multa = (var_peixe - 50)*4;
            System.out.println("A sua multa é de: "+multa);
        } 
        System.out.println("\n\nAté mais !!!");
    }    
}
