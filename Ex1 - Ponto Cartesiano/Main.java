import java.util.Scanner;

public class Main
{
    Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        Ponto p = new Ponto();
        
        System.out.println("Informe X1: ");
        p.setX1(ler.nextDouble());
        
        System.out.println("Informe X2: ");
        p.setX2(ler.nextDouble());
        
        System.out.println("Informe Y1: ");
        p.setY1(ler.nextDouble());
        
        System.out.println("Informe Y2: ");
        p.setY2(ler.nextDouble());
        
        System.out.println("===========================");
        System.out.printf("A distancia entre os pontos é: " + "%.2f", p.distancia());
        
    }
}
