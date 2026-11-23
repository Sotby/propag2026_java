import gxp.Leituras;

public class MaiorMenorMatriz {
    static int linhas = 4;
    static int colunas = 3;
    public static void main(){
        int matriz[][] = new int[linhas][colunas];
        int maior=0, menor=0;
        for(int i = 0; i < linhas;i++){
            for(int j = 0; j < colunas; j++){
                System.out.printf("Insira o valor da posição [%d][%d]: ",i,j);
                matriz[i][j] = Leituras.lerint();
                if(i == 0 && j==0){
                    maior = menor = matriz[i][j];
                } else{
                    if(matriz[i][j]> maior) maior = matriz[i][j];
                    else if(matriz[i][j]<menor) menor = matriz[i][j];
                }
            }
        }
        System.out.printf("Maior: %d\nMenor: %d",maior,menor);
    }   
}
