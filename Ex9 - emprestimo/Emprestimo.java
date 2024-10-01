public class Emprestimo
{
    private double valorEmprestimo, taxaJurosMensal;
    private int meses;
    
    
    public Emprestimo(){}
    
    public double valorMensalidade(){
        double taxaJurosDecimal = taxaJurosMensal / 100;
        
        return valorEmprestimo * (taxaJurosDecimal * Math.pow(1 + taxaJurosDecimal, meses))
            / (Math.pow(1 + taxaJurosDecimal, meses) - 1);
    }

    public double totalPago(){
        return valorMensalidade() * meses;
    }

    public double valorJuros(){
        return totalPago() - valorEmprestimo;
    }
    
    //ACESSOS
    public void setValorEmprestimo(double valorEmprestimo){
        if(valorEmprestimo > 0)
            this.valorEmprestimo = valorEmprestimo;
            valorEmprestimo = 0;
    }
    
    public double getValorEmprestimo(){
        return valorEmprestimo;
    }
    
    public void setTaxaJurosMensal(double taxaJurosMensal){
        if(taxaJurosMensal > 0)
            this.taxaJurosMensal = taxaJurosMensal;
            taxaJurosMensal = 0;
    }
    
    public double getTaxaJurosMensal(){
        return taxaJurosMensal;
    }
    
    public void setMeses(int meses){
        if(meses > 0 )
            this.meses = meses;
            meses = 0;
    }
    public int getMeses(){
        return meses;
    }
}
