import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        Produto p = new Produto();
        
        dadosProduto(criarProduto(p));
    }
    
    public static void dadosProduto(Produto p){
        System.out.println("----- SITUACAO DO PRODUTO -----");
        System.out.printf("\nNome: " + p.getNome());
        System.out.printf("\nCodigo de Barras: " + p.getCodBarras());
        System.out.printf("\nPreco: " + "%.2f",p.getPreco());
        System.out.printf("\nQuantidade em estoque: " + p.getQuantEstoque());
        System.out.printf("\nSeu produto está: " + p.disponibilidade());
        System.out.println("\n-----------------------------------");      
        
    }
    
    public static Produto criarProduto(Produto p){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("-----DADOS DO PRODUTO-----");
        System.out.println("\nNome do Produto :");
        p.setNome(ler.nextLine());
        System.out.println("\nCódigo de Barras:");
        p.setCodBarras(ler.nextLine());
        System.out.println("\nPreço do produto:");
        p.setPreco(ler.nextDouble());
        System.out.println("\nQuantidade em estoque:");
        p.setQuantEstoque(ler.nextInt());
        System.out.println("-------------------------");
        return p;
    }
}
