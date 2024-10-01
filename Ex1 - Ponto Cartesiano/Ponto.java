
public class Ponto
{
    private double x1, x2, y1, y2;
    
    public Ponto(){}
    
    //calculo distancia
    public double distancia(){
        
        double distancia;
        
        return distancia = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }
    
    //Acessos
    public void setX1(double x1){
        this.x1 = x1;
    } 
    
    public double getX1(){
        return x1;
    }
    
    public void setX2(double x2){
        this.x2 = x2;
    } 
    
    public double getX2(){
        return x2;
    }
    
    public void setY1(double y1){
        this.y1 = y1;
    } 
    
    public double getY1(){
        return y1;
    }
    
    public void setY2(double y2){
        this.y2 = y2;
    } 
    
    public double getY2(){
        return y2;
    }
}
