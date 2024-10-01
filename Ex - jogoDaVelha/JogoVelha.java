public class JogoVelha
{
    private Jogador jogador1, jogador2;
    private EJogo[][] tabuleiro;
    
    public JogoVelha(){
        //tabuleiro = new EJogo
        zerarTabuleiro();
    }
    
    public void zerarTabuleiro(){
        tabuleiro = new EJogo[3][3];
        for(int i = 0; i<= 2; i++){
            for(int j = 0; j <= 2; j++){
                tabuleiro[i][j]= EJogo.VAZIO;
            }
        }
    }
    
    public Jogador resultado(){
        EJogo[][] t = tabuleiro;
        
        if( t[0][2] == t[1][2] && t[0][2] == t[2][2] && t[0][2]!= EJogo.VAZIO){
            return t[0][0] == EJogo.JOGADOR1 ? jogador1 : jogador2;
        }
        
        if ((t[0][2] == t[1][2] && t[0][2] == t[2][2] && t[0][2]!= EJogo.VAZIO)){
            return t[0][0] == EJogo.JOGADOR1 ? jogador1 : jogador2;
        }
        
        if(t[0][1] == t[1][1] && t[0][1] == t[2][1] && t[0][1]!= EJogo.VAZIO){
            return t[0][0] == EJogo.JOGADOR1 ? jogador1 : jogador2;
        }
        
        if(t[0][0] == t[1][0] && t[0][0] == t[0][2] && t[0][0]!= EJogo.VAZIO){
            return t[0][0] == EJogo.JOGADOR1 ? jogador1 : jogador2;
        }
        
        if(t[1][0] == t[1][1] && t[1][0] == t[1][2] && t[1][0]!= EJogo.VAZIO){
            return t[0][0] == EJogo.JOGADOR1 ? jogador1 : jogador2;
        }
        
        if(t[0][0] == t[0][1] && t[0][0] == t[0][2] && t[0][0]!= EJogo.VAZIO){
            return t[0][0] == EJogo.JOGADOR1 ? jogador1 : jogador2;
        }
        
        if(t[0][0] == t[1][1] && t[0][0] == t[2][2] && t[0][0]!= EJogo.VAZIO){
            return t[0][0] == EJogo.JOGADOR1 ? jogador1 : jogador2;
        }
        
        if(t[0][2] == t[1][1] && t[0][0] == t[2][0] && t[0][2]!= EJogo.VAZIO){
            return t[0][0] == EJogo.JOGADOR1 ? jogador1 : jogador2;
        }      
               
            return null;
    }
    
    public void jogar(EJogo jogador, int linha, int coluna){
        if(linha < 0 || linha > 2){
            return;
        }
        if(coluna < 0 || coluna > 2){
            return;
        }
        
        if(tabuleiro[linha][coluna] == EJogo.VAZIO){
        tabuleiro[linha][coluna] = jogador;
        }
    }
    
    public void setJogador1(Jogador jogador1){
        this.jogador1 = jogador1;
    }
    public Jogador getJogador1(){
        return jogador1;
    }
    
    public void setJogador2(Jogador jogador2){
        this.jogador2 = jogador2;
    }
    public Jogador getJogador2(){
        return jogador2;
    }
}
