import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        Retangulo r = new Retangulo();
        
        System.out.printf("Informe o comprimento: ");
        r.setComprimento(ler.nextDouble());
        System.out.printf("Informe a largura: ");
        r.setLargura(ler.nextDouble());
        System.out.println("###############");
        System.out.printf("Area do retangulo: " + "%.2f",r.area());
        System.out.printf("\nPerimetro do retangulo: " + "%.2f",r.perimetro());
        System.out.println("\n###############");
        
    
    
    }
}
