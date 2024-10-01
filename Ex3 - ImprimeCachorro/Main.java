import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        
        Cachorro c = new Cachorro();
        
        System.out.println("### IMPRESSAO DE CACHORRO ###");
        System.out.printf("Nome do cachorro: ");
        c.setNome(ler.nextLine());
        System.out.printf("Idade do cachorro: ");
        c.setIdade(ler.nextInt());
        //sempre inserir este nextLine apos uma chamada de atr num
        // e antes de um novo nextLine;
        ler.nextLine();
        System.out.printf("Raca do cachorro: ");
        c.setRaca(ler.nextLine());
        System.out.println("#########################");
        System.out.println("Dados do Cachorro: ");
        System.out.println("Nome: " + c.getNome());
        System.out.println("Idade: "+ c.getIdade());
        System.out.println("Raca: "+ c.getRaca());
        System.out.println("#########################");
    
        
    }
}
