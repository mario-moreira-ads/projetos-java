import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Empregado e = new Empregado();
        
        System.out.printf("Informe sua idade: ");
        e.setIdade(ler.nextInt());
        
        /*while(true){
            System.out.printf("Informe os anos de trabalho: ");
            if(ler.nexInt() >= e.getIdade()){
                e.setTempoTrabalho;
                break;
            }
        }*/
        System.out.printf("Informe os anos de trabalho: ");
        e.setTempoTrabalho(ler.nextInt());
        
        System.out.println("----------------------------");
        System.out.printf("\nVocê tem: " + e.getIdade() + " anos de idade");
        System.out.printf("\nVocê tem: " + e.getTempoTrabalho() + " anos de trabalho");
        System.out.printf("\nSua aposentadoria foi: " + e.aposentadoria() );
    }
}
