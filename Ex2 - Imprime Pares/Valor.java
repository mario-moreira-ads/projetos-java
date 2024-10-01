
public class Valor
{
    private int a,b;
    
    public Valor(){
    }
    
    public void impressaoImpares(){
        while( a<= b){
            if (a % 2 != 0){
                System.out.printf(" " + a + " /");
            }
            
            a++;
        }
    }
    
    public void setA(int a){
        this.a = a;
    }
    
    public int getA(){
        return a;
    }
    
    public void setB(int b){
        this.b = b;
    }
    
    public int getB(){
        return b;
    }
}
