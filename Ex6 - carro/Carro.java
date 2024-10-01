public class Carro
{
    //VALORES DOS OPCIONAIS PARA MANUTENCAO
    private double ar = 3000;
    private double cambio = 5000;
    private double alarme = 800;
    private double pintura = 2500;
    private double teto = 4000;
    private double kit = 1800;
    
    private String modelo;
    private double precoCusto;
    private boolean ehMotorMil, ehImportado, temAr, temCambio, temAlarme, temPintura,
    temTeto, temKit;
    
    public Carro(){}
    
    //metodos
    //valor final
    public double valorFinal(){
        return custoTotal() + valorIpi() + valorImportacao();
    }
    //------------------------------------
    public double valorImpostos(){
        return valorIpi() + valorImportacao();
    }
    
    public double valorAcessorios(){
        return valorAr() + valorCambio() + valorAlarme() + valorPintura() + 
        valorTeto() + valorKit();
    }
    
    //----------------------------------------------------------
    public double valorIpi(){
        return (ehMotorMil) ? custoTotal() * 0.1 : custoTotal() * 0.2;
    }
    
    public double valorImportacao(){
        return (ehImportado) ? custoTotal() * 0.3 : 0;
    }
    //CUSTO TOTAL DO CARRO
    public double custoTotal(){
        return precoCusto + valorAr() + valorCambio() + valorAlarme() + 
        valorPintura() + valorTeto() + valorKit();
    }
    
    //ACESSORIOS
    public double valorAr(){
        return (temAr) ? ar : 0;
    }
    
    public double valorCambio(){
        return (temCambio) ? cambio : 0;
    }
    
    public double valorAlarme(){
        return (temAlarme) ? alarme : 0;
    }
    
    public double valorPintura(){
        return (temPintura) ? pintura : 0;
    }
    
    public double valorTeto(){
        return (temTeto) ? teto : 0;
    }
    
    public double valorKit(){
        return (temKit) ? kit : 0;
    }
    
    //getter n setter
    public void setTemKit(boolean temKit){
        this.temKit = temKit;
    }
    public boolean getTemKit(){
        return temKit;
    }
    public void setTemTeto(boolean temTeto){
        this.temTeto = temTeto;
    }
    public boolean getTemTeto(){
        return temTeto;
    }
    public void setTemPintura(boolean temPintura){
        this.temPintura = temPintura;
    }
    public boolean getTemPintura(){
        return temPintura;
    }
    public void setTemAlarme(boolean temAlarme){
        this.temAlarme = temAlarme;
    }
    public boolean setTemAlarme(){
        return temAlarme;
    }
    public void setTemCambio(boolean temCambio){
        this.temCambio = temCambio;
    }
    public boolean getTemCambio(){
        return temCambio;
    }
    public void setTemAr(boolean temAr){
        this.temAr = temAr;
    }
    public boolean getTemAr(){
        return temAr;
    }
    public void setEhImportado(boolean ehImportado){
        this.ehImportado = ehImportado;
    }
    public boolean getEhImportado(){
        return ehImportado;
    }
    public void setEhMotorMil(boolean ehMotorMil){
        this.ehMotorMil = ehMotorMil; 
    }
    public boolean getEhMotorMil(){
        return ehMotorMil;
    }
    public void setPrecoCusto(double precoCusto){
        if(precoCusto > 0 ){
            this.precoCusto = precoCusto;
        }
            precoCusto = 0;
    }
    public double getPrecoCusto(){
        return precoCusto;
    }
    public void setModelo(String modelo){
        if(modelo != null && !modelo.equals("")){
            this.modelo = modelo;
        }
            modelo = "Sem modelo";
    }
    public String getModelo(){
        return modelo;
    }
}
