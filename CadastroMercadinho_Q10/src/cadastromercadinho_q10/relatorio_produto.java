package cadastromercadinho_q10;

import java.util.ArrayList;

    public class relatorio_produto {
        private String produto;
        private long valor_de_compra,valor_de_venda,lote;
        ArrayList<produtos_mercadinho> ListaProdutos;

        public relatorio_produto(){
            ListaProdutos = new ArrayList();
        }

        public relatorio_produto(String produto,int lote,long valor_de_compra,long valor_de_venda){
            this.produto = produto;
            this.valor_de_compra = valor_de_compra;
            this.valor_de_venda = valor_de_venda;
            this.lote = lote;
            ListaProdutos = new ArrayList();
        }

        public long getvalor_de_compra(){
            return valor_de_compra;
        }

        public void setvalor_de_compra(long valor_de_compra){
            this.valor_de_compra = valor_de_compra;
        }
        
        public long getvalor_de_venda(){
            return valor_de_venda;
        }

        public void setvalor_de_venda(long valor_de_venda){
            this.valor_de_venda = valor_de_venda;
        }
        
        public long getlote(){
            return lote;
        }
        
        public void setlote(int lote){
            this.lote = lote;
        }
        
        public String getproduto(){
            return produto;
        }

        public void setproduto(String produto){
            this.produto = produto;
        }

        public  ArrayList<produtos_mercadinho> getListaProdutos(){
            return ListaProdutos;
        }
        
        public void setproduto(ArrayList<produtos_mercadinho> ListaProdutos){
            this.ListaProdutos = ListaProdutos;
        }
        
        public void addLista(produtos_mercadinho product){
            //adiciona o produto ao valor ,ou seja,pertence ao preço empregado na classe produto_mercadinho)
            product.setPro(this);
            ListaProdutos.add(product);
        }
}

