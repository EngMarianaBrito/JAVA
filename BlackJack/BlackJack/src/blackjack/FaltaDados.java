package blackjack;

/**
 *
 * @author maria
 */
public class FaltaDados extends Exception{
    public String mensagem;

    public FaltaDados() {
        this.mensagem = "JOGADOR É OBRIGATÓRIO!";
    }
    
}
