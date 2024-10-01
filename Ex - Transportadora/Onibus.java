
public class Onibus extends Veiculo implements VeiculoSegurado
{
    private boolean ehLeito;
    
    @Override
    public double precoKmPercorrido(){        
        return ehLeito?50:30;
    }  
    
    public double valorSeguro(){
        return 0;
    }  
    
    
    public void setEhLeito(boolean ehLeito){
        this.ehLeito = ehLeito;
    }    
    public boolean getEhLeito(){
        return ehLeito;
    }
    
}
