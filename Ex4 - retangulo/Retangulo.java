public class Retangulo
{
    private double comprimento, largura;
    
    public Retangulo(){
    }
    
    public double area(){
        return comprimento * largura;
    }
    
    public double perimetro(){
        return 2 * (comprimento + largura);
    }
    
    public void setComprimento(double comprimento){
        if(comprimento > 0)
            this.comprimento = comprimento;
            comprimento = 0;
    }
    
    public double getComprimento(){
        return comprimento;
    }
    
    public void setLargura(double largura){
        if(largura > 0)
            this.largura= largura;
            largura = 0;
    }
    
    public double getLargura(){
        return largura;
    }
    
}
