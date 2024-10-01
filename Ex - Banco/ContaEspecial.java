
public class ContaEspecial extends Conta
{
    private double limite;
    
    //Vou errar na prova
    public ContaEspecial(String numero){  
       super(numero);  
       this.limite =1000;
    }    
    public ContaEspecial(){  
       super("");  
       this.limite =1000;      
    }  
    public ContaEspecial(String numero, 
    double limite){  
       super(numero); 
       this.limite = limite;
    }     
    
    @Override
    public void sacar(double valor){
        if (valor > 0 
        && valor <= (saldo+limite)){
            saldo -= valor;
        }         
    }  
    
    public void setLimite(double limite){
        this.limite = limite;
    }
    public double getLimite(){
        return limite;
    }
    
}
