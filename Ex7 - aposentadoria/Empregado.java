public class Empregado
{
    private int idade, tempoTrabalho;
    
    public Empregado(){}
    
    
    public String aposentadoria(){
        if(idade >= 65 || tempoTrabalho >= 30 || idade >= 60 && tempoTrabalho >= 25)
            return "AUTORIZADA";
            return "NEGADA";
        
    }
    
    public void setIdade(int idade){
        if(idade > 0){
            this.idade = idade;
        }
            idade = 18;
    }
    public int getIdade(){
        return idade;
    }
    
    public void setTempoTrabalho(int tempoTrabalho){
            if(tempoTrabalho >= 0){
                this.tempoTrabalho = tempoTrabalho;
            }
                tempoTrabalho = 0;
    }
    public int getTempoTrabalho(){
        return tempoTrabalho;
    }
}
