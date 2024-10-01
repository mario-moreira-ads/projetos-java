import java.util.Scanner;
import java.util.ArrayList;


public class Principal2
{
    static Scanner nLe = new Scanner(System.in);
    
    
    public static void main(String args[]){        
        Scanner le = new Scanner(System.in);
        Banco bco = cadastrarBanco();        
        
        while (true){
            int menu = exibeMenu(le);
            if (menu == 1){
                
                bco.addCliente( cadastrarCliente() );                
                
            }else if (menu == 2){
                
                cadastrarConta( bco );
                
            }else if (menu == 3){
                //exibirRelatorio();
            }else if (menu == 4){
                //relaizaar operacoes();
            }else if (menu == 5){
                System.out.println("## Ate Logo");
                break;
            }else{
                System.out.println("## menu invalido!!!");                
            }
        }        
                
    }
    
    public static void cadastrarConta(Banco b){
       System.out.println("########## CONTA ##########");         
        Cliente escolha = listaCliente( b.getClientes() );
        System.out.println("## DADOS DA CONTA:");        
        System.out.println("## escolha a conta: (C)onta, (P)oupança ou Conta (E)special");
        Conta conta;
        String resp = nLe.next();
        if (resp.equalsIgnoreCase("C")){
            conta = new Conta("");
        }else if (resp.equalsIgnoreCase("P")){
            conta = new Poupanca("");
        }else{
            conta = new ContaEspecial("");            
        }
        System.out.println("## numero da conta");
        conta.setNumero( nLe.next() );
        
        if (conta instanceof ContaEspecial){
            System.out.println("## limite de credito");
            ((ContaEspecial)conta).setLimite( nLe.nextDouble() );            
        }
        escolha.addConta( conta );
    }
    
    public static Cliente listaCliente(ArrayList<Cliente> clientes){
       System.out.println("## escolha um cliente?");
       int idx = 1;
       for(Cliente c: clientes){
           System.out.println("### "+idx+") "+c.getNome());            
           idx++;
       }
       int resp = nLe.nextInt();
       return clientes.get( resp -1 ) ;
    }
    
    public static Cliente cadastrarCliente(){
       System.out.println("########## CLIENTE ##########"); 
       Cliente cli = new Cliente();
        System.out.println("## informe o nome do cliente:");
        cli.setNome( nLe.next() );
        System.out.println("## informe o cpf do cliente:");
        cli.setCpf( nLe.next() );
        return cli;
    }
    
    public static int exibeMenu(Scanner teclado){        
        System.out.println("########## MENU ##########");
            System.out.println("### 1) Cadastrar Cliente");
            System.out.println("### 2) Criar Conta");
            System.out.println("### 3) Relatorios");
            System.out.println("### 4) Operaçoes");
            System.out.println("### 5) Sair");
        return teclado.nextInt();
    }
    
    public static Banco cadastrarBanco(){
        Scanner le = new Scanner(System.in);
        System.out.println("###############################");
        System.out.println("##      BANCO DO BRASIL      ##");
        System.out.println("###############################");
        Banco b = new Banco();
        System.out.println("## informe o nome do Banco:");
        b.setNome( le.next() );
        return b;
    }
    
}
