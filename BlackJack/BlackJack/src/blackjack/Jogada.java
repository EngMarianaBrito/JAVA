package blackjack;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author maria
 */
public class Jogada<J> {
    private ArrayList<J> objetos = new ArrayList<>();

    public Jogada(){
        objetos = new ArrayList<>();
    }
//--------------------------------------------------------------------------------------------------------
    public void jogar(J j){
        this.objetos.add(j);
    }
//--------------------------------------------------------------------------------------------------------
    public Object remover(){
        return this.objetos.remove(this.objetos.size() - 1);
    }
//--------------------------------------------------------------------------------------------------------
    public boolean vazia() {
        return objetos.isEmpty();
    }
//--------------------------------------------------------------------------------------------------------
    public Object get(int i){
        return this.objetos.get(i);
    }
//--------------------------------------------------------------------------------------------------------
    public int size(){
        return objetos.size();
    }
//--------------------------------------------------------------------------------------------------------
    public void embaralhar(){
            Collections.shuffle(objetos);
    }
}
