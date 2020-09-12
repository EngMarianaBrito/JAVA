package cadastromercadinho_q10;

public class produtos_mercadinho {
    private String produto;
    private int lote; 
    private relatorio_produto Pro;
    
    public produtos_mercadinho(){
        
    }

    public produtos_mercadinho(String produto,int lote){
        this.produto = produto;
        this.lote = lote;
    }
           
    public String getproduto(){
        return produto;
    }

    public void setproduto(String produto){
        this.produto = produto;
    }
    
    public long getlote(){
        return lote;
    }
        
    public void setlote(int lote){
        this.lote = lote;
    }
    
    public relatorio_produto getPro(){
        return Pro;
    }
    
    public void setPro(relatorio_produto Pro){
        this.Pro = Pro;
    }
}
