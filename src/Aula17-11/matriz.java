import gxp.Leituras;
public class matriz {
    static int max_linhas = 4;
    static int max_colunas = 3;
    public static int[][] lermatriz(){
        int[][] matriz = new int[max_linhas][max_colunas];
        for(int i = 0; i < max_linhas; i++){
            for(int j = 0; j < max_colunas; j++){
                System.out.print("Insira o valor da linha "+(i+1)+" coluna "+(j+1)+":");
                matriz[i][j] = Leituras.lerint();
            }
        }
        return matriz;
    }
    public static void ImprimirMatriz(int[][] matriz){
        System.out.println("");
        for(int i = 0; i < max_linhas; i++){
            for(int j = 0; j < max_colunas; j++){
                System.out.printf("%-5d ",matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void main(){
        int matriz[][];
        matriz = new int[max_linhas][max_colunas];
        matriz = lermatriz();
        int maior = 0, menor = 0;
        for(int i = 0; i < max_linhas; i++){
            for(int j = 0; j < max_colunas; j++){
                if(i==0 && j==0){
                    maior = menor = matriz[i][j];
                } else {
                    if(matriz[i][j] > maior){
                        maior = matriz[i][j];
                    } else if(matriz[i][j] < menor){
                        menor = matriz[i][j];
                    }
                }
            }
        }
        ImprimirMatriz(matriz);
        System.out.println("Maior elemento:"+maior);
        System.out.println("Menor elemento:"+menor);
    }
}
