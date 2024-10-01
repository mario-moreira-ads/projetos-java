
public class Caminhao extends Veiculo implements VeiculoSegurado, VeiculoInspecionado
{
    private int numeroEixos;
    
    @Override
    public double precoKmPercorrido(){        
        return numeroEixos*85;
    } 
    
    public double valorSeguro(){
        return 0;
    }
    
    public boolean foiInspecionado(){
        return false;
    }
    
    public void setNumeroEixos(int numeroEixos){
        this.numeroEixos = numeroEixos;
    }    
    public int getNumeroEixos(){
        return numeroEixos;
    }
    
    
}
