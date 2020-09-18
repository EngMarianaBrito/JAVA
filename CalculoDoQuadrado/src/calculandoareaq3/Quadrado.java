package calculandoareaq3;

public class Quadrado {
    double lado;
    
    public Quadrado(double lado){
       this.lado = lado; 
    }
    
    void status(){
       System.out.println("Area = " + lado * lado);
       System.out.println("Perimetro = " + 4 * lado);        
    }
    
}
