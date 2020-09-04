//Crie um programa ,no qual,dado uma sequencia válida de arremessos para uma 
//partida de boliche americano de 10 pinos,produza a pontuação total de jogo.
//Obs:Não checaremos por jogadas validas,nem pelo numero correto de jogas e 
//frames,nem sera fornecido pontuação para frames intermediarios.
// @author:Lia Mariana Brito

package placar_de_jogo_boliche;

import java.util.Scanner;

public class Placar_de_Jogo_boliche {
    
    public static final int [] pontuacao_ganha = new int[12];

    public static void main(String[] args) {
        
        Scanner entrada_pontos = new Scanner(System.in);
        String[] rawInput = new String[12];
        int pontuacao_total= 0;
       
        //perfume
        System.out.println("--------------------------------------------------------");
        System.out.println("\t\t>>>BOLICHE BOOM!<<<");
        System.out.println("--------------------------------------------------------");
        System.out.println("Seja bem vindo(a) ao sistema virtual do Boliche Boom !!!");       
        System.out.println("Informe sua jogada e no final receba o total da sua pontuaçaõ!");
        System.out.println("--------------------------------------------------------");
        
       //COLHENDO PONTUAÇÃO DAS JOGADAS
        for (int i = 0; i < 10; i ++ ){
                       
            System.out.print(+i+1+"°Jogada->");
            rawInput[i] = entrada_pontos.next();

            //CALCULO CASO:STRIKE
            if(i == 10 && rawInput[i].equals("X")){  
        
                pontuacao_total += calculo_pontos(rawInput[i]);
                
                for( int l = 0; l < 2; l ++ ){
                    rawInput[i] = entrada_pontos.next();
                    pontuacao_total += calculo_pontos(rawInput[i]);
                }    
            }else if (i == 0 && rawInput[i].equals("/")){
                for (String s:rawInput){
                    pontuacao_total += calculo_pontos(rawInput[i]);
                }
                
                if(i == 10 && rawInput[i].equals("/")){
                     for( int l = 0; l < 2; l ++ ){  
                    rawInput[i] = entrada_pontos.next();
                    pontuacao_total += calculo_pontos(rawInput[i]);
                    }
                } 
            }else{
                  pontuacao_total += calculo_pontos(rawInput[i]);                
            }
        }
        
       // 'X' => STRIKE; '/' => SPARE ; '-' => PERDA ;
       //             TEST!
       // Ex: 9/ X X X X X X X X X  = 285
       // Ex: 9- X X X X X X X X X = 279
        
        //resultado
        System.out.println("--------------------------------------------------------");
        System.out.println("PLACAR FINAL = "+pontuacao_total);
        System.out.println("Obrigado por usar o sistema do Boliche Boom !!!");
        System.out.println("Até mais!");
    }
    
    //CALCULO DE PONTUAÇÃO COM REGRAS DE PONTUAÇÃO
    public static int calculo_pontos(String pontuacao_ganha){
       if(pontuacao_ganha.equals("x")){
           return 30;
        }else {
            int ponto_primeira_tentiva = Integer.parseInt(pontuacao_ganha.substring(0,1));
            String ponto_segunda_tentiva = pontuacao_ganha.substring(1,2);
            
            if(ponto_segunda_tentiva.equals("/")){               
                return 15;
            }else{
                return ponto_primeira_tentiva;
            }
        }
    }   
}
                 