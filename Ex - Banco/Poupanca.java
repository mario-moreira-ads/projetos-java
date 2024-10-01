

public class Poupanca extends Conta
{
    
    public Poupanca(String numero){
        super(numero);
    }
    
    public void rendimento(double taxaJuros){
        double valor = saldo * (taxaJuros/100);
        depositar(valor);
    }
    
}
