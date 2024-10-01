

public abstract class Veiculo
{
    private String placa, modelo;
    
    public Veiculo(){
        
    }
    
    public abstract double precoKmPercorrido();
    
    //public abstract double valorSeguro();
    
    public void setPlaca(String placa){
        this.placa = placa;
    }    
    public String getPlaca(){
        return placa;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }    
    public String getModelo(){
        return modelo;
    }
    
}
