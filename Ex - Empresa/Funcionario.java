
public class Funcionario
{
    private String nome;
    private int numeroFilhos, tempoTrabalho;
    private double totalVendas, salarioBase;
    private boolean ehVendedor, ehGerente, ehTrabalhadorNoturno;
    
    //construtor
    public Funcionario(){
        
    }
    public Funcionario(String nome, int numeroFilhos,
    int tempoTrabalho, double totalVendas, 
    double salarioBase, boolean ehVendedor,
    boolean ehGerente, boolean ehTrabalhadorNoturno){
        this.nome = nome;
        this.numeroFilhos = numeroFilhos;
        this.tempoTrabalho = tempoTrabalho;
        this.totalVendas = totalVendas;
        this.salarioBase = salarioBase;
        this.ehVendedor = ehVendedor;
        this.ehGerente = ehGerente;
        this.ehTrabalhadorNoturno = ehTrabalhadorNoturno;
        
        
    }
    
    //get e set
    
    
    //metodo
    public double inss(){
        return 0.13 * salarioBase;
    }
    public double bonusGerente(){
        return (ehGerente)? 0.05*salarioBase : 0;
    }
    public double bonusNoturno(){
        return (ehTrabalhadorNoturno)? 0.08*salarioBase : 0;
    }
    public double bonusFilhos(){
        return (numeroFilhos<3)? numeroFilhos*50 : 150;
    }
    public double bonusVendedor(){
        return (ehVendedor)? 0.1*totalVendas : 0;
    }
    public double quinquenio(){
        int anos = tempoTrabalho/5;
        return (0.03*anos)*salarioBase;
    }
    
    public double salario(){
        /*double salario = salarioBase * 0.87;
        salario += (ehGerente)? 0.05*salarioBase : 0;
        salario += (ehTrabalhadorNoturno)? 0.08*salarioBase : 0;
        salario += (numeroFilhos<3)? numeroFilhos*50 : 150;
        salario += (ehVendedor)? 0.1*totalVendas : 0;
        int anos = tempoTrabalho/5;
        salario += (0.03*anos)*salarioBase;
        */
        return salarioBase - inss() + bonusGerente()
        + bonusNoturno() + bonusFilhos() + bonusVendedor()
        + quinquenio();
    }
    
    
    
    
}
