import java.util.Scanner;

public class Main
{
    Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        Carro c = new Carro();
        
        
        notaFiscal(vendaCarro(c));
    }
    public static void notaFiscal(Carro c){
        String vendedor = "Mario";
        
        System.out.println("----------------------------");
        System.out.println("Vendedor: " + vendedor);
        System.out.println("----------------------------");
        System.out.printf("Modelo: " + c.getModelo());
        System.out.printf("\nValor Base: " + "%.2f",c.getPrecoCusto());
        System.out.printf("\nValor Ar: " + "%.2f",c.valorAr());
        System.out.printf("\nValor Cambio: " + "%.2f",c.valorCambio());
        System.out.printf("\nValor Alarme: " + "%.2f",c.valorAlarme());
        System.out.printf("\nValor Pintura: " + "%.2f",c.valorPintura());
        System.out.printf("\nValor Teto: " + "%.2f",c.valorTeto());
        System.out.printf("\nValor Kit: " + "%.2f",c.valorKit());
        System.out.println("\n----------------------------");
        System.out.printf("\nTotal Acessórios: " + "%.2f",c.valorAcessorios());
        System.out.printf("\nTotal Impostos: " + "%.2f",c.valorImpostos());
        System.out.println("\n----------------------------");
        System.out.printf("\nValor Final: " + "%.2f",c.valorFinal());
        
    }
    public static Carro vendaCarro(Carro c){
    
        Scanner ler = new Scanner(System.in);
    
        System.out.println("----- MN VEÍCULOS -----");
        System.out.println("----- DADOS BÁSICOS-----");
        System.out.printf("Modelo: ");
        c.setModelo(ler.nextLine());
        System.out.printf("Valor base: ");
        c.setPrecoCusto(ler.nextDouble());
        System.out.printf("Motor 1.0 - (S)im / (N)ão ");
        c.setEhMotorMil(ler.next().equalsIgnoreCase("s"));
        System.out.printf("Carro Importado - (S)im / (N)ão ");
        c.setEhImportado(ler.next().equalsIgnoreCase("s"));
        System.out.println("----- ACESSORIOS -----");
        System.out.printf("Ar condicionado - (S)im / (N)ão ");
        c.setTemAr(ler.next().equalsIgnoreCase("s"));
        System.out.printf("Cambio Automático - (S)im / (N)ão ");
        c.setTemCambio(ler.next().equalsIgnoreCase("s"));
        System.out.printf("Alarme - (S)im / (N)ão ");
        c.setTemAlarme(ler.next().equalsIgnoreCase("s"));
        System.out.printf("Pintura - (S)im / (N)ão ");
        c.setTemPintura(ler.next().equalsIgnoreCase("s"));
        System.out.printf("Teto Solar - (S)im / (N)ão ");
        c.setTemTeto(ler.next().equalsIgnoreCase("s"));
        System.out.printf("Kit Multimída - (S)im / (N)ão ");
        c.setTemKit(ler.next().equalsIgnoreCase("s"));
        
        return c;
    }
}
