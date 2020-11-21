package blackjack;

/**
 *
 * @author maria
 */

public class Designer {
    
    public static void exibirMenuPrincipal() {
        System.out.println("------------------------- ");
        System.out.println("           MENU           ");
        System.out.println("------------------------- ");    
        System.out.println("1. CADASTRAR");
        System.out.println("2. JOGAR");
        System.out.println("3. REGRAS");
        System.out.println("4. SAIR");
        System.out.println("------------------------- ");
        System.out.print(">> Eu escolha a opção ");
    }
    //--------------------------------------------------------------------------------------------------------
    public static void exibirMenu() {
        System.out.println("------------------------- ");
        System.out.println("         Apostas          ");
        System.out.println("------------------------- ");    
        System.out.println("2. +1 CARTA");
        System.out.println("3. PASSAR A VEZ");
        System.out.println("------------------------- ");   
    }
    //--------------------------------------------------------------------------------------------------------
    public static void cadastro(){
        System.out.println("------------------------- "); 
        System.out.println("        CADASTRO          ");
        System.out.println("------------------------- "); 
        System.out.print("NOME DO JOGADOR : ");
    }
    //--------------------------------------------------------------------------------------------------------
    public static void regras(){
        System.out.println(" Se com as 2 primeiras cartas o jogador conseguir 21 pontos, terá um blackjack"
                + "O blackjack (modalidade americana) é um jogo de cartas que consiste em somar mais pontos com as suas cartas que o dealer sem ultrapassar 21.");
        System.out.println("Valor das cartas");
        System.out.println("  1 - O “ás” vale 1 ou 11 pontos.\n" +
                           "  2 -“J”, “Q”, “K” valem 10 pontos.\n" +
                           "  3 - As demais cartas, seu próprio valor.");
        System.out.println("As apostas");
        System.out.println(" -> O blackjack se paga 2 a 3.");
    }
}
