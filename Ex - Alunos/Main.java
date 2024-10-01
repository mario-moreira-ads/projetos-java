import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        
        Scanner le = new Scanner(System.in);
        
        System.out.println("## BEM VIMDO"); 
        
        Aluno a1 = new Aluno();
        System.out.println("## Informe o nome do Aluno 1"); 
        a1.setNome( le.next() );        
        System.out.println("## Informe a nota do Aluno 1");
        a1.setNota( le.nextFloat()) ;

        
        
        if (a1.estaAprovado()){
            System.out.println("esta Aprovado");            
        }        
        
        Aluno a2 = new Aluno();
        System.out.println("## Informe o nome do Aluno 2"); 
        a2.setNome( le.next() );        
        System.out.println("## Informe a nota do Aluno 2");
        a2.setNota( le.nextFloat() );
        
        if (a2.estaAprovado()){
            System.out.println("esta Aprovado");            
        }
        
        Professor prof = new Professor("Zezin",a1,a2);
        System.out.println("O aluno com maior nota e "+prof.retornarAlunoMaiorNota().getNome() );
                
        
    }
}
