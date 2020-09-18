//2-Acrescente um método main à classe Lampada da questão 01. O método main
//deve:
//a. Instanciar 2 objetos do tipo Lampada (lampa1 e lampa2)
//b. Ligar o objeto lampa1 e desligar o objeto lampa2.
//c. Usar o método observa() para mostrar se os objetos lampa1 e lampa2
//estão “ligados” ou “desligados”.
//@author Lia mariana Brito
package acrescentando_lampadaq2;

public class Acrescentando_LampadaQ2 {

    public static void main(String[] args) {
        
        System.out.println("---------------------------");
        System.out.println("\tLAMPADA 1");
        System.out.println("---------------------------");
        Lampada c1 = new Lampada();
        c1.ligar();
        c1.observar();
        System.out.println("---------------------------");
        System.out.println("\tLAMPADA 2");
        System.out.println("---------------------------");
        Lampada c2 = new Lampada();
        c2.desligar();
        c2.observar();
    }
    
    
}
