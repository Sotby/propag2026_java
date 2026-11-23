import gxp.Leituras;

public class MatrizSimetrica {
    static int tamanho = 4;
    static boolean simetrica(int matriz[][]){
        for(int i = 0; i < tamanho; i++){
            for(int j = i+1; j < tamanho; j++){
                if(matriz[i][j] != matriz[j][i]) return false;
            }
        }
        return true;
    }
    static void mostrar(int matriz[][]){
        System.out.println("");
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                System.out.printf("%-5d ",matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void main(){
        int matriz[][] = new int[tamanho][tamanho];
        for(int i = 0; i < tamanho;i++){
            for(int j = 0; j < tamanho; j++){
                System.out.printf("Insira o valor da posição [%d][%d]: ",i,j);
                matriz[i][j] = Leituras.lerint();
            }
        }
        mostrar(matriz);
        if(simetrica(matriz)){
            System.out.println("A matriz é simétrica");
        } else {
            System.out.println("A matriz não é simétrica");
        }
    }
}
