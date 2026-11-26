package atvav3;
import gxp.Leituras;

public class Diagonais {
    static int tamanho = 4;
    public static void ImprimirMatriz(int[][] matriz){
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                System.out.printf("%-5d ",matriz[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(){
        int matriz[][] = new int[tamanho][tamanho];
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j<tamanho;j++){
                System.out.printf("Insira o valor da posição [%d][%d]: ",i,j);
                matriz[i][j] = Leituras.lerint();
            }
        }
        int SomaPrincipal = 0,SomaSecundaria = 0;
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                if(i == j){
                    SomaPrincipal+=matriz[i][j];
                }
                if(i+j == tamanho-1){
                    SomaSecundaria+=matriz[i][j];
                } 
            }                    
        }
        ImprimirMatriz(matriz);
        System.out.println("Soma da diagonal principal: "+SomaPrincipal);
        System.out.println("Soma da diagonal secundária: "+SomaSecundaria);
    }
}
