package blackjack;

import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class Jogador {

    private int id;
    private String nome;
    private ArrayList<Carta> mao;
    private int pontos;

    public Jogador(){
        this.pontos = 0;
        this.id = (int) System.currentTimeMillis() % 1000;
        this.mao = new ArrayList<>();
    }
//--------------------------------------------------------------------------------------------------------
    public void addCarta(Carta carta){
        this.pontos += carta.getValor();
        this.mao.add(carta);
    }
//--------------------------------------------------------------------------------------------------------
    public int getId() {
        return id;
    }
//--------------------------------------------------------------------------------------------------------
    public void setId(int id) {
        this.id = id;
    }
//--------------------------------------------------------------------------------------------------------
    public String getNomeJogador() {
        return this.nome;
    }
//--------------------------------------------------------------------------------------------------------
    public void setNome(String nome) throws FaltaDados {
        if (nome.isEmpty()) {
            throw new FaltaDados();
        }else{            
            this.nome = nome; 
        }
    }
//--------------------------------------------------------------------------------------------------------
    public ArrayList<Carta> getMao() {
        return mao;
    }
//--------------------------------------------------------------------------------------------------------
    public void setMao(ArrayList<Carta> mao) {
        this.mao = mao;
    }
//--------------------------------------------------------------------------------------------------------
    public int getPontos() {
        return pontos;
    }
//--------------------------------------------------------------------------------------------------------
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
