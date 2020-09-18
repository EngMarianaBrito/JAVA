package acrescentando_lampadaq2;
//QUESTÃO DOIS 
public class Lampada {
     boolean ligada;
   
   void ligar(){
       this.ligada = true;
   }
   
   void desligar(){
       this.ligada = false;
   }
   
   void observar(){
       System.out.println("Está ligada ? "+this.ligada); 
       if (this.ligada == true){
           System.out.println("AEHHH!");
       }else{
           System.out.println("Acenda a sua lampada!");
       }
   }
}
