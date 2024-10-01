import java.util.ArrayList;

public class Banco
{
    private String nome;
    //???
    private Gerente gerente;
    //private Gerente gerente;
    
    private ArrayList<Cliente> clientes;
    
    public Banco(){
        clientes = new ArrayList<>();
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    
    public void addCliente(Cliente cli){
        this.clientes.add(cli);
    }
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
}
