import java.util.ArrayList;

public class Empresa
{
    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(){
        funcionarios = new ArrayList<>();
    }
    
    public double totalSalario(){
     double total = 0;   
    // for (int i=0; i< funcionarios.size(); i++){
    //     Funcionario f = funcionarios.get(i);         
    for(Funcionario f : funcionarios){
      total += f.salario();
     }
        
     return total;   
    }   
    
    public Funcionario maiorSalarioNaoGerente(){
        
        Funcionario fMaior = new Funcionario();
        for(Funcionario f : funcionarios){
            if ( !f.getEhGerente() 
                && f.salario() >= fMaior.salario() ){
                fMaior = f;
            }
        }        
        return fMaior;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public ArrayList<Funcionario> getFuncionarios(){
        return funcionarios;
    }
    //public void setFuncionario(ArrayList<Funcionario> funcionarios){
    //    this.funcionarios = funcionarios;
    //}
    public void addFuncionario(Funcionario f){
        funcionarios.add( f );
    }
    
}
