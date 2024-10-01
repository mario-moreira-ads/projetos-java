import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        Emprestimo e = new Emprestimo();
        
        System.out.println("----- FINANCEIRA -----");
        System.out.printf("Valor a emprestar: ");
        e.setValorEmprestimo(ler.nextDouble());
        System.out.printf("Taxa de Juros Mensal: ");
        e.setTaxaJurosMensal(ler.nextDouble());
        System.out.printf("Prazo para pagamento: ");
        e.setMeses(ler.nextInt());
        System.out.println("-------------------------");
        System.out.printf("\nValor do emprestimo: " +"%.2f", e.getValorEmprestimo());
        System.out.printf("\nTaxa de Juros Mensal: " +"%.2f", e.getTaxaJurosMensal());
        System.out.printf("\nPrazo (em meses): " +e.getMeses());
        System.out.println("\n-------------------------");
        System.out.printf("\nValor da mensalidade: " +"%.2f", e.valorMensalidade());
        System.out.printf("\nValor total pago: " +"%.2f", e.totalPago());
        System.out.printf("\nValor total de juros: " +"%.2f", e.valorJuros());
        System.out.println("\n-------------------------");
        
        
        
    }
}
