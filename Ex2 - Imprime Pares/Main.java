import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        Valor v = new Valor();
        
        System.out.println("Informe o valor A: ");
        v.setA(ler.nextInt());
        
        System.out.println("Informe o valor B: ");
        v.setB(ler.nextInt());
        
        System.out.println("Valores ímpares entre " + v.getA() + " e " + v.getB() + " são: "  );
        v.impressaoImpares();
        
    }
}
