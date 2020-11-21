package blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack {
    
    private static Baralho baralho;
    private static ArrayList<Jogador> jogadores;
    private static final Scanner in = new Scanner(System.in);
    private static int opcao = 1;
    private static int opcaoJogo = 2;
    private static int pontosMaior = 0;
    
    public static void main(String[] args) throws FaltaDados {
        
        jogadores = new ArrayList<>();
        
        Jogador jogador;
        String nome;

        baralho = new Baralho();
        baralho.iniciarJogo();
        baralho.embaralhar();
        jogador = new Jogador();
        
        try {
            jogador.setNome("Jogador Virtual");
        } catch (FaltaDados e) {
            System.out.println(e.mensagem);
        }
        
        jogadores.add(jogador);

//--------------------------------------------------------------------------------------------------------
    while(opcao != 4){
			
            Designer.exibirMenuPrincipal();
            opcao = in.nextInt();

            if(opcao == 1){
                jogador = new Jogador();
                Designer.cadastro();
                nome = in.next();
                jogador.setNome(nome);
                jogadores.add(jogador);
            }		
            if(opcao == 2){
                if(jogadores.size() < 2){
                    
                }else{
                    while(opcaoJogo >= 1){
                        if(opcaoJogo == 1){
                                Distribuir(jogadores, baralho);
                                opcaoJogo = 2;
                        }else if(opcaoJogo == 2){
                            for(int j = (jogadores.size() - 1); j >= 0; j--){
                                while(jogadores.get(j).getPontos() <= 21 && opcaoJogo != 3){
                                    jogada(jogadores.get(j), baralho);
                                }
                                opcaoJogo = 2;
                            }
                            opcaoJogo = -1;
                            Ganhador();
                        }
                    }
                        opcao = -1;
                }
            }if (opcao == 3) {
                Designer.regras();
            }if (opcao == 4) {
                System.out.println("Até mais!");
            }
        }
    }
//--------------------------------------------------------------------------------------------------------    
    public static void  Distribuir(ArrayList<Jogador> jogadores, Baralho baralho){
            for(int i = 1; i <= 2; i++){
                jogadores.forEach((j) -> {
                    j.addCarta(baralho.remover());
                });
            }
    }
//--------------------------------------------------------------------------------------------------------
    public static void mesaDeJogada(ArrayList<Jogador> jogadores){
		
        jogadores.stream().map((j) -> {
            System.out.println("-------------------------");
            return j;
        }).map((j) -> {
            System.out.print("JOGADOR: ");
            return j;
        }).map((j) -> {
            System.out.print(j.getNomeJogador());
            return j;
        }).map((j) -> {
            System.out.println("\nMESA:");
            return j;
        }).map((j) -> {
            j.getMao().forEach((c) -> {
                System.out.println("    -" + c.getNomeCarta() + " de " + c.getNaipe());
            });
            return j;
        }).map((j) -> {
            System.out.print("Pontos -> ");
            return j;
        }).map((j) -> {
            System.out.println(j.getPontos());
            return j;
        }).forEachOrdered((_item) -> {
            System.out.println();
        });
    }
//--------------------------------------------------------------------------------------------------------
    public static void jogada(Jogador jogador, Baralho baralho){

        mesaDeJogada(jogadores);
        Designer.exibirMenu();
        System.out.println("Vez do(a) " + jogador.getNomeJogador());
        System.out.print("-> ");
        opcaoJogo = in.nextInt();

        if(opcaoJogo == 2){
            jogador.addCarta(baralho.remover());
        } if(opcaoJogo == 3){
            System.out.println("Pontuação " + jogador.getPontos());
        } if(jogador.getPontos() >= pontosMaior && jogador.getPontos() <= 21){
            pontosMaior = jogador.getPontos();
        }
    }
//--------------------------------------------------------------------------------------------------------
    public static void Ganhador(){
        int contEmpate = 0;
        System.out.println("Ganhador(es): ");
        contEmpate = jogadores.stream().filter((j) -> (j.getPontos() == pontosMaior)).map((j) -> {
            System.out.println(" -> Parabéns,"+j.getNomeJogador()+ "!!!");
            System.out.println(" ->Pontuação Total : " + j.getPontos());
            return j;
        }).map((_item) -> 1).reduce(contEmpate, Integer::sum);
        if(contEmpate > 1){
                System.out.println("Empate");
        }

    }
}
