package jogodavelhaseminterface;

/**
 *
 * @author Lia Mariana Brito;
 */

public class Regras_e_aspectos {
    private String [][] tabuleiro ={{"A","B","C"},{"D","E","F"},{"G","H","I"}} ;

    //metodo para a impressão da jogada
    public String tabuleiro_impressao(){
        System.out.println("       "+tabuleiro[0][0]+"  | "+tabuleiro[0][1]+"  | "+tabuleiro[0][2]);
        System.out.println("     -----|----|----");        
        System.out.println("       "+tabuleiro[1][0]+"  | "+tabuleiro[1][1]+"  | "+tabuleiro[1][2]);
        System.out.println("     -----|----|----"); 
        System.out.println("       "+tabuleiro[2][0]+"  | "+tabuleiro[2][1]+"  | "+tabuleiro[2][2]);

        return null;
    }
    
    //calculo das vitorias 
    //De quantas formas posso vemcer o jogo da velha ?
    // 3 na horizontal;3 na vertical,e 2 inclinada = TOTAL DE 8 FORMAS
    public String jogo_Vencedor (int jogada){       
         String[] vitoria = new String[8];
         String ganhador = "null";

        //VITORIA - PLACAR - POSSIBILIDADES
        //cheque o tabuleiro acima e seus indificadores patra conseguir entender melhor
        
        //HORIZONTAL 
        vitoria[0] = tabuleiro[0][0] + tabuleiro[0][1] + tabuleiro[0][2];
        vitoria[1] = tabuleiro[1][0] + tabuleiro[1][1] + tabuleiro[1][2]; 
        vitoria[2] = tabuleiro[2][0] + tabuleiro[2][1] + tabuleiro[2][2];  
        
        //VERTICAL
        vitoria[3] = tabuleiro[0][0] + tabuleiro[1][0] + tabuleiro[2][0];
        vitoria[4] = tabuleiro[0][1] + tabuleiro[1][1] + tabuleiro[2][1]; 
        vitoria[5] = tabuleiro[0][2] + tabuleiro[1][2] + tabuleiro[2][2];

        //INCLINADA
        vitoria[6] = tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2];
        vitoria[7] = tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]; 
        
        //mudando valores e indicando quem esta jogando
        for(int i = 0; i < vitoria.length; i++) {
            if(vitoria[i].equals("XXX")){
                ganhador = " PARTICIPANTE 1";
            }else if(vitoria[i].equals("OOO")){
                ganhador = " PARTICIPANTE 2";                
            }else if(jogada == 9){
                ganhador = "OPA EMPATE!";
            }else if(jogada == 9){
               return ganhador;
            }
        }
        return ganhador;  
    }
    
    public void jogada_impressao (String val,String jogador){
        if (val.equals("1")) {   
           tabuleiro[0][0] = jogador;                 
        }else if (val.equals("2")) {
           tabuleiro[0][1] = jogador;
        }else if (val.equals("3")) {
           tabuleiro[0][2] = jogador;
        }else if (val.equals("4")) {
           tabuleiro[1][0] = jogador;
        }else if (val.equals("5")) {
           tabuleiro[1][1] = jogador;
        }else if (val.equals("6")) {
           tabuleiro[1][2] = jogador;
        }else if (val.equals("7")) {
           tabuleiro[2][0] = jogador;
        }else if (val.equals("8")) {
           tabuleiro[2][1] = jogador;
        }else if(val.equals("9")) {
           tabuleiro[2][2] = jogador;
        }
    } 
    
    //metodo para a validação de cada jogada
    public boolean validacao(String val){
        if (tabuleiro[0][0].equals(val)){   
            return true;                    
        }else if (tabuleiro[0][1].equals(val)){   
            return true;                    
        }else if (tabuleiro[0][2].equals(val)){   
            return true;                    
        }else if (tabuleiro[1][0].equals(val)){   
            return true;                    
        }else if (tabuleiro[1][1].equals(val)){   
            return true;                    
        }else if (tabuleiro[1][2].equals(val)){   
            return true;                    
        }else if (tabuleiro[2][0].equals(val)){   
            return true;                    
        }else if (tabuleiro[2][1].equals(val)){   
            return true;                    
        }else if (tabuleiro[2][2].equals(val)){   
            return true;                    
        }else   
        return false;
    }
}
