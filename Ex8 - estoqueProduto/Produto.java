public class Produto
{
    private String nome, codBarras;
    private double preco;
    private int quantEstoque;
    
    public Produto(){}
    
    
    public String disponibilidade(){
        return (quantEstoque > 0 ) ? "DISPONÍVEL" : "SEM ESTOQUE";
    }
    
    public void setPreco(double preco){
        if(preco > 0)
            this.preco = preco;
            preco = 0;
    }
    public double getPreco(){
        return preco;
    }
    
    public void setQuantEstoque(int quantEstoque){
        if(quantEstoque > 0)
            this.quantEstoque = quantEstoque;
            quantEstoque = 0;
    }
    public int getQuantEstoque(){
        return quantEstoque;
    }
    public void setNome(String nome){
        if(nome != null && !nome.equals("")){
            this.nome = nome;
        }
            nome = "Produto Generico";
    }
    public String getNome(){
        return nome;
    }
    
    public void setCodBarras(String codBarras){
        if(codBarras != null && !codBarras.equals("")){
            this.codBarras = codBarras;
        }
            nome = "Produto Generico";
    }
    public String getCodBarras(){
        return codBarras;
    }
}
