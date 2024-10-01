

public class Main
{
    public static void main(String args[]){
        
        Veiculo v = new Carro();
        
        //imprimeVeiculosSegurado( new Carro() );
        
        v = new Caminhao();
        
        imprimeVeiculosSegurado( ((VeiculoSegurado)v) );
        
        ((Caminhao)v).foiInspecionado();
        
        //Veiculo v1 = new Veiculo();
        
        //VeiculoSegurado vs = new VeiculoSegurado();
        
        VeiculoSegurado vs = new Onibus();
        
        imprimeVeiculosSegurado( vs );
        
        vs = new Caminhao();
        
        vs.valorSeguro();
        
        ((Veiculo)vs).precoKmPercorrido();
        
        ((VeiculoInspecionado)vs).foiInspecionado();
        ((Caminhao)vs).foiInspecionado();
        
        imprimeVeiculosSegurado( vs );
    }
    
    
    public static void imprimeVeiculosSegurado( VeiculoSegurado vs){
        
        Veiculo v = ((Veiculo)vs);
        
        System.out.println("## "+v.getPlaca() );
        System.out.println("## preço km "+((Veiculo)vs).precoKmPercorrido() );
        System.out.println("## preço Seguro "+vs.valorSeguro() );
        
    }
    
}
