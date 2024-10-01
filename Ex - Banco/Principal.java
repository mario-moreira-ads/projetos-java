
import java.util.Scanner;

public class Principal
{
    public static void main(String[] args){
        
        Scanner le = new Scanner(System.in);
        Conta c;
        System.out.println("Deseja Cria (C)onta, conta (E)special ou (P)oupanca ");
        String resp = le.next();
        if (resp.equals("C")){
            c = new Conta("123");
        }else if (resp.equals("E")){
            c = new ContaEspecial("123", 1000);
        }else 
            c = new Poupanca("123");
        
        c.depositar(100);
        
        c.rendimento(1);
        
        if ( c instanceof Poupanca){
          ((Poupanca)c).rendimento(1);
        }
        
        c.sacar(1050);
        
        System.out.println("Saldo :: "+c.getSaldo());
        
        
        
    }
}
