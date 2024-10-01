
public class Aluno
{
    // Atributos
    private String nome;
    private float nota;
    
    //metodo construtor
    public Aluno(String vnome, float vnota){
       nome = vnome;
       nota = vnota;
    }
    public Aluno(){
        nome = "";
        nota = 0;
    }
    public Aluno(String vnome){
       nome = vnome;
       nota = 0;
    }
    public Aluno( float vnota){
       nome = "";
       nota = vnota;
    }    
   /*public Aluno(String vmatricula, float vnota){
       matricula = vmatricula;
       nome = "";
       nota = vnota;
    }*/
    
    public void setNota( float nota){
        if (nota >= 0 && nota <= 10){
           this.nota = nota;
        }        
    }
    public float getNota(){
        return nota;
    }
    
    
    public String getNome(){
        return nome;
    }
    public void setNome( String nome){
        if (nome != null && !nome.equals("") )
           this.nome = nome;    
    }
    
    // metodos
    public boolean estaAprovado(){        
        return (nota >= 7);
        /*if (nota >= 7){
            return true;
        }else{
            return false;
        }*/
    }
    
}
