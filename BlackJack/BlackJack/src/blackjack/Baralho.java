
package blackjack;

/**
 *
 * @author maria
 */
public class Baralho {

    private final Jogada<Carta> baralho;

    public Baralho(){
        this.baralho = new Jogada<>();
    }
//--------------------------------------------------------------------------------------------------------
    public void iniciarJogo(){
        if(baralho.vazia()){
                criarBaralho();
        }

    }
//--------------------------------------------------------------------------------------------------------
    public void embaralhar(){
        baralho.embaralhar();
    }
//--------------------------------------------------------------------------------------------------------
    public int tamanho(){
        return baralho.size();
    }
//--------------------------------------------------------------------------------------------------------
    public Carta remover(){
        return (Carta) this.baralho.remover();
    }
//--------------------------------------------------------------------------------------------------------
    public void Baralho(){
        for(int i = 0; i < baralho.size(); i++){
                System.out.println(((Carta) baralho.get(i)).getNomeCarta()+ " de " + ((Carta) baralho.get(i)).getNaipe());
        }
    }


    private void criarBaralho(){

        Carta c1;

        c1 = new Carta("as","Copas",11);
        baralho.jogar(c1);
        c1 = new Carta("2","Copas",2);
        baralho.jogar(c1);
        c1 = new Carta("3","Copas",3);
        baralho.jogar(c1);
        c1 = new Carta("4","Copas",4);
        baralho.jogar(c1);
        c1 = new Carta("5","Copas",5);
        baralho.jogar(c1);
        c1 = new Carta("6","Copas",6);
        baralho.jogar(c1);
        c1 = new Carta("7","Copas",7);
        baralho.jogar(c1);
        c1 = new Carta("8","Copas",8);
        baralho.jogar(c1);
        c1 = new Carta("9","Copas",9);
        baralho.jogar(c1);
        c1 = new Carta("10","Copas",10);
        baralho.jogar(c1);
        c1 = new Carta("Valete","Copas",10);
        baralho.jogar(c1);
        c1 = new Carta("Dama","Copas",10);
        baralho.jogar(c1);
        c1 = new Carta("Rei","Copas",10);
        baralho.jogar(c1);
//--------------------------------------------------------------------------------------------------------
        c1 = new Carta("as","Paus",11);
        baralho.jogar(c1);
        c1 = new Carta("2","Paus",2);
        baralho.jogar(c1);
        c1 = new Carta("3","Paus",3);
        baralho.jogar(c1);
        c1 = new Carta("4","Paus",4);
        baralho.jogar(c1);
        c1 = new Carta("5","Paus",5);
        baralho.jogar(c1);
        c1 = new Carta("6","Paus",6);
        baralho.jogar(c1);
        c1 = new Carta("7","Paus",7);
        baralho.jogar(c1);
        c1 = new Carta("8","Paus",8);
        baralho.jogar(c1);
        c1 = new Carta("9","Paus",9);
        baralho.jogar(c1);
        c1 = new Carta("10","Paus",10);
        baralho.jogar(c1);
        c1 = new Carta("Valete","Paus",10);
        baralho.jogar(c1);
        c1 = new Carta("Dama","Paus",10);
        baralho.jogar(c1);
        c1 = new Carta("Rei","Paus",10);
        baralho.jogar(c1);
//--------------------------------------------------------------------------------------------------------
        c1 = new Carta("as","Ouro",11);
        baralho.jogar(c1);
        c1 = new Carta("2","Ouro",2);
        baralho.jogar(c1);
        c1 = new Carta("3","Ouro",3);
        baralho.jogar(c1);
        c1 = new Carta("4","Ouro",4);
        baralho.jogar(c1);
        c1 = new Carta("5","Ouro",5);
        baralho.jogar(c1);
        c1 = new Carta("6","Ouro",6);
        baralho.jogar(c1);
        c1 = new Carta("7","Ouro",7);
        baralho.jogar(c1);
        c1 = new Carta("8","Ouro",8);
        baralho.jogar(c1);
        c1 = new Carta("9","Ouro",9);
        baralho.jogar(c1);
        c1 = new Carta("10","Ouro",10);
        baralho.jogar(c1);
        c1 = new Carta("Valete","Ouro",10);
        baralho.jogar(c1);
        c1 = new Carta("Dama","Ouro",10);
        baralho.jogar(c1);
        c1 = new Carta("Rei","Ouro",10);
        baralho.jogar(c1);
//--------------------------------------------------------------------------------------------------------
        c1 = new Carta("as","Espadas",11);
        baralho.jogar(c1);
        c1 = new Carta("2","Espadas",2);
        baralho.jogar(c1);
        c1 = new Carta("3","Espadas",3);
        baralho.jogar(c1);
        c1 = new Carta("4","Espadas",4);
        baralho.jogar(c1);
        c1 = new Carta("5","Espadas",5);
        baralho.jogar(c1);
        c1 = new Carta("6","Espadas",6);
        baralho.jogar(c1);
        c1 = new Carta("7","Espadas",7);
        baralho.jogar(c1);
        c1 = new Carta("8","Espadas",8);
        baralho.jogar(c1);
        c1 = new Carta("9","Espadas",9);
        baralho.jogar(c1);
        c1 = new Carta("10","Espadas",10);
        baralho.jogar(c1);
        c1 = new Carta("Valete","Espadas",10);
        baralho.jogar(c1);
        c1 = new Carta("Dama","Espadas",10);
        baralho.jogar(c1);
        c1 = new Carta("Rei","Espadas",10);
        baralho.jogar(c1);


    }  
}
