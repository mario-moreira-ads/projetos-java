

public class Carro extends Veiculo
{
    private String motor;
    
    @Override
    public double precoKmPercorrido(){        
        return motor.equals("1.0")?15:20;
    }
    
    public void setMotor(String motor){
        this.motor = motor;
    }    
    public String getMotor(){
        return motor;
    }
    
    
}
