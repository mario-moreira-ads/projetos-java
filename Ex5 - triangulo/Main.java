import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
    
        Scanner ler = new Scanner(System.in);
        
        Triangulo t = new Triangulo();
        
        System.out.printf("Informe o valor do lado A: ");
        t.setA(ler.nextDouble());
        System.out.printf("Informe o valor do lado B: ");
        t.setB(ler.nextDouble());
        System.out.printf("Informe o valor do lado C: ");
        t.setC(ler.nextDouble());
        ler.nextLine();
        System.out.println("------------------");
        
        System.out.printf("Área do Triângulo: " + "%.2f",t.area());
        System.out.printf("\nPerímetro do Triângulo: " + "%.2f",t.perimetro());
        System.out.printf("\nTipo de Triângulo: " + t.classificar());
    }
}
