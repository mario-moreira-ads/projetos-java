
public class Cachorro
{
    private String nome,raca;
    private int idade;
    
    public Cachorro(){
    
    }
    
    public void setNome(String nome){
        if(nome != null && !nome.equals("")){
            this.nome = nome;
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setRaca(String raca){
        if(raca != null && !raca.equals("")){
            this.raca= raca;
        }
    }
    
    public String getRaca(){
        return raca;
    }
    
    public void setIdade(int idade){
        if(idade > 0)
            this.idade = idade;
            idade = 0;
    }
    
    public int getIdade(){
        return idade;
    }
}
