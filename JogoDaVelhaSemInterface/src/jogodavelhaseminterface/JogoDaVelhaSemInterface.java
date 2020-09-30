//Intuito:Construir um jogo da velha simples utilazando apenas POO;
//REGRAS QUE DEVE SEGUIR:BASE DE PESQUISA => https://segredosdomundo.r7.com/jogo-da-velha-como-jogar/
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!IMPORTANTE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//PODE HAVER EMPATE QUANDO NENHUM JOGADOR ATINGI OS METODOS DE VITORIA (HORIZONTAL,VERTICAL,INCLINADA)
//@author:Lia Mariana Brito.
package jogodavelhaseminterface;

import java.util.Scanner;

public class JogoDaVelhaSemInterface {
        
    public static void main(String[] args) {

        Scanner verificando = new Scanner(System.in);
        Regras_e_aspectos jogo = new Regras_e_aspectos();
        String manuseamento_jogada;
        int opcao = 0;
        int validada ;
        int jogadas = 0;
        
        do{
            
            System.out.println("===============================");
            System.out.println("      MENU JOGO DA VELHA   ");
            System.out.println("===============================");
            System.out.println("Escolha a opcão 1 e se divirta.");
            System.out.println("\t1 - JOGAR ");
            System.out.println("\t2 - SAIR");
            System.out.println("===============================");
            System.out.print(">>");
            opcao = verificando.nextInt();
            
            switch(opcao){
                
                case 1 :
                    
                    for (int i = 0; i < 2; i++) {
            
                        System.out.println("---------------------------------");
                        System.out.println("->PARTICIPANTE "+i); 
                        System.out.println("\tBOA SORTE!");
                
                    }
                    
                    while(true){
                        
                        System.out.println("\n");
                        System.out.println("========================");
                        System.out.println("   JOGO DA VELHA ICEV   ");
                        System.out.println("========================");
                        System.out.println("-------Bom jogo!--------\n"); 
                
                        //instaciando classe do tabuleiro
                        jogo.tabuleiro_impressao();          

                        do{
                            
                            System.out.print(">PART 1 : Informe o numero da  sua Jogada: ");
                            manuseamento_jogada = verificando.nextLine();
                            
                            while(!jogo.validacao(manuseamento_jogada)){
                                System.out.println("ERRO!");
                                manuseamento_jogada = verificando.nextLine();
                                validada = 0;
                            } 
                            
                            jogo.jogada_impressao(manuseamento_jogada,"X");
                            validada = 1 ;
                        }
                        while(validada == 0);           
                        jogadas++;validada = 0;
                        if(!jogo.jogo_Vencedor(jogadas).equals("null")){
                            break;
                            
                        }do{
                            
                            System.out.print(">PART 2 :Informe o numero da  sua Jogada: ");
                            manuseamento_jogada = verificando.nextLine();
                            
                            while(!jogo.validacao(manuseamento_jogada)){
                                System.out.println("------------------");
                                System.out.println("ERRO!");
                                manuseamento_jogada = verificando.nextLine();
                                validada = 0;
                            }  
                            jogo.jogada_impressao(manuseamento_jogada,"Y");
                            validada = 1 ;
                        }
                        
                        while(validada == 0);         
                        jogadas++;validada = 0;          
                        if(!jogo.jogo_Vencedor(jogadas).equals("null")){
                            break;
                        }
                        
                    }       
                    System.out.println("VENCEDOR = > "+jogo.jogo_Vencedor(jogadas)+ " Parabens!");
                    break;
                    
                case 2 :
                    System.out.println("----------------------------------");
                    System.out.println(">>>>>>ATÉ MAIS!<<<<<<"); 
                    System.out.println("----------------------------------");
                    System.out.println("Se ainda não jogo,lembre-se que vale a pena!");
                    System.out.println("O jogo da velha estimula a velocidade de raciocínio");
                    break;
                    
                default:
                    System.out.println("Desculpa,não reconheço essa opção! =( ");
            }
            
        }while(opcao != 2);
          System.out.println("Espero que tenha gostado!");  
            
    } 
    
}