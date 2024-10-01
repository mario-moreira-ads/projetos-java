

public class Gerente extends Pessoa
{
    
    private int matricula;
    
    public Gerente(){
        
    }
    public Gerente(String nome, String cpf,
    int matricula){
        this.setNome( nome );
        this.cpf = cpf;
        this.matricula = matricula;
    }
    
}
