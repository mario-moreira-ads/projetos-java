public class Triangulo
{
    private double a, b, c;
    
    public Triangulo(){
    
    }
    
    public String classificar(){
        if(a == b && b == c){
            return "Equilatero";
        }else if( a == b || b == c || a == c){
            return "Isoceles";
        }else{
            return "Escaleno";
        }
    }
    
    public double area(){
        double hr = (a + b + c) / 2;
        
        return Math.sqrt(hr * (hr - a) * (hr - b) * (hr - c));
    }
    
    public double perimetro(){
        return a + b + c;
    }
    
    public void setA(double a){
        if(a > 0)
            this.a = a;
            a = 0;
    }
    
    public double getA(){
        return a;
    }
    
    public void setB(double b){
        if(b > 0)
            this.b = b;
            b = 0;
    }
    
    public double getB(){
        return b;
    }
    
    public void setC(double c){
        if(c > 0)
            this.c = c;
            c = 0;
    }
    
    public double getC(){
        return c;
    }
    
}
