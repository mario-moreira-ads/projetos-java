
public class Professor
{
    
    String nome;
    Aluno[] alunos;
    
    public Professor(String vnome,Aluno a1, Aluno a2){
        nome = vnome;
        alunos = new Aluno[2];
        alunos[0] = a1;
        alunos[1] = a2;
        //aluno = valu;
    }
    
    public Aluno retornarAlunoMaiorNota(){
        
       Aluno auxMaior =  alunos[0];
       for(int i=1; i< alunos.length; i++ ){
           
           if (auxMaior.getNota() < alunos[i].getNota() ){
               auxMaior = alunos[i];
           }
       }
       return auxMaior;
    }
    
}
