
package jogobolichepoo;

import java.util.Scanner;

public class Regras_comando {
   
    Scanner entrada_pontos = new Scanner(System.in);    
    public double pontos;
    public String[] rawInput = new String[12];
    int pontuacao_total= 0;

    
//    public Regras_comando(double entrada_pontos){
//       this.entrada_pontos = entrada_pontos; 
//    }

    Regras_comando() {
         this.entrada_pontos = entrada_pontos; 
         this.rawInput = new String[12];
         this.pontuacao_total = pontuacao_total;
    }
    
    public String jogo_entrega(){
        System.out.println("--------------------------------------------------------");
        System.out.println("\t\tPLACAR FINAL = "+pontuacao_total);
        System.out.println("--------------------------------------------------------");
        System.out.println("Obrigado por usar o sistema do Boliche Boom !!!");
        System.out.println("\t\tAté mais!");
        return null;
    }
    
    public double regras (){
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
        return pontuacao_total;
    }
    
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
