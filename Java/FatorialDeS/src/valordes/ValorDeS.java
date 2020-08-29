/*
 *Escreva uma função que recebe por parâmetro um valor inteiro e positivo N e retorna o valor de S.
 *S = 1 + 1/1! + ½! + 1/3! + 1 /N!
 */
//@author Mariana Brito

package valordes;
import java.util.Scanner;
public class ValorDeS {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.print("Informe o valor de n ->");
        String var_n1  = entrada.nextLine();
        double n = Double.valueOf(var_n1);
        
        double s = 1 + 1 + 0.5 + 0.17 + 1/fatorial(n);               
        
        System.out.println(s);  
    }
    public static long fatorial(double n){
        long fatorial = 1 ;
        
        for(int i = 1; i <= n; i++){
            fatorial *= i;
        }
        return fatorial;
    }   
}
