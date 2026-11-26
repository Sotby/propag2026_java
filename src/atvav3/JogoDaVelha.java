package atvav3;
import gxp.Leituras;

public class JogoDaVelha {
    static boolean temespaco(char jogo[][]){
        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3; j++){
                if(jogo[i][j] == ' ') return true;
            }
        }
        return false;
    }
    static char vitoria(char jogo[][]){
        for(int i = 0; i < 3; i++){
            if(jogo[i][0] != ' ' && jogo[i][0] == jogo[i][1] && jogo[i][1] == jogo[i][2]){
                return jogo[i][0];
            }
        }
        for(int j = 0; j < 3; j++){
            if(jogo[0][j] != ' ' && jogo[0][j] == jogo[1][j] && jogo[1][j] == jogo[2][j]){
                return jogo[0][j];
            }
        }
        if(jogo[0][0] != ' ' && jogo[0][0] == jogo[1][1] && jogo[1][1] == jogo[2][2]){
            return jogo[0][0];
        }
        if(jogo[2][0] != ' ' && jogo[2][0] == jogo[1][1] && jogo[1][1] == jogo[0][2]){
            return jogo[2][0];
        }
        return ' ';
    };
    static void imprimir(char jogo[][]){
        System.out.printf("%-5s | %-5d | %-5d | %-5d |\n"," ",1,2,3);
        for(int i = 0; i < 3;i++){
            System.out.printf("%-5d |",i+1);
            for(int j = 0; j < 3; j++){
                System.out.printf(" %-5c |",jogo[i][j]);
            }
            System.out.println("");
        }
    }
    static void inserir(char jogador, char jogo[][]){
        while(true){
            System.out.print("Insira a linha: ");
            int linha = Leituras.lerint();
            linha--;
            System.out.print("Insira a coluna: ");
            int coluna = Leituras.lerint();
            coluna--;
            if(linha >= 0 && linha <3 && coluna >=0 && coluna <3){
                if(jogo[linha][coluna] == ' '){
                    jogo[linha][coluna] = jogador;
                    break;
                } else {
                    System.out.println("Erro posição ja ocupada!");
                }
            } else {
                System.out.println("Posição fora dos limites!");
            }
            
        }
    }
    static void jogo(char jogo[][]){
        char jogadores[] = {'X','O'};
        int jogador_atual = 0;
        while (vitoria(jogo) == ' ' && temespaco(jogo)){
            imprimir(jogo);
            System.out.println("Jogador "+jogadores[jogador_atual]+": ");
            inserir(jogadores[jogador_atual],jogo);
            jogador_atual = (jogador_atual+1)%2;
        }
        imprimir(jogo);
        if(vitoria(jogo) == ' '){
            System.out.println("Deu Velha!");
        } else {
            System.out.println("Jogador "+vitoria(jogo)+" venceu!");
        }
    }
    public static void main(){
        char jogo[][] = {
            {' ',' ',' '},
            {' ',' ',' '},
            {' ',' ',' '}
        };
        jogo(jogo);
    }
}
