package atvav3;
import gxp.Leituras;

public class BuscaTrocaMatriz {
    static int linhas = 4;
    static int colunas = 2;
    static int posicao_valor[] = new int[2];
    static boolean existe(int matriz[][], int valor){
        for(int i = 0; i < linhas;i++){
            for(int j = 0; j < colunas;j++){
                if(matriz[i][j] == valor){
                    posicao_valor[0] = i;
                    posicao_valor[1] = j;
                    return true;
                } 
            }
        }
        
        return false;
    }
    static void mostar(int matriz[][]){
        System.out.println("");
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    static void substituir(int matriz[][],int valor){
        matriz[posicao_valor[0]][posicao_valor[1]] = valor;
    }
    public static void main(){
        int matriz[][] = {
            {10,20},
            {30,40},
            {50,60},
            {70,80}
        };
        System.out.print("Qual valor deseja buscar?\nResposta: ");
        int resposta = Leituras.lerint();
        if(existe(matriz,resposta)){
            System.out.print("Valor encontrado, por qual valor deseja substitui-lo?\nResposta: ");
            resposta = Leituras.lerint();
            substituir(matriz,resposta);
            System.out.println("Matriz Alterada: ");
            mostar(matriz);
        } else {
            System.out.println("O valor inserido não existe na matriz");
        }
    }
}
