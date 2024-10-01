
import java.util.ArrayList;

public class Cliente  extends Pessoa
{
    
    private ArrayList<Conta> contas;
    
    public Cliente(){
        contas = new ArrayList<>();
    }
    
    public ArrayList<Conta> getContas(){
        return contas;
    }
    public void addConta(Conta c){
        contas.add(c);
    }
    
    
    
}
