
package jogobolichepoo;

import java.util.Scanner;

public class JogoBolichePoo {

    public static void main(String[] args) {
        
        Scanner entrada_pontos = new Scanner(System.in);
        Regras_comando C1 = new Regras_comando();
        
        //perfume
        System.out.println("--------------------------------------------------------");
        System.out.println("\t\t>>>BOLICHE BOOM!<<<");
        System.out.println("--------------------------------------------------------");
        System.out.println("Seja bem vindo(a) ao sistema virtual do Boliche Boom !!!");       
        System.out.println("Informe sua jogada e no final receba o total da sua pontuaçaõ!");
        System.out.println("--------------------------------------------------------");
        
        C1.regras ();
        C1.jogo_entrega();        
        
    }
    
}
