

public class Conta
{
    private String numero;
    protected double saldo;
    
    
    public Conta(String numero){
        this.numero = numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    public void depositar(double valor){
        //saldo += (valor > 0)?valor:0;
        if (valor > 0){
            saldo += valor;
        }        
    }
    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
        } 
        
    }    
    
}
