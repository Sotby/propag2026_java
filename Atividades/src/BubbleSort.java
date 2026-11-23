import gxp.Leituras;

public class BubbleSort {
    static int tamanho_vetor = 8;
    static void bubblesort(int vetor[]){
        boolean troca = false;
        int passos = 0;
        System.out.print("\nAntes: ");
        imprimir(vetor);
        do{
            troca = false;
            for(int i = 0; i < tamanho_vetor-1; i++){
                if(vetor[i] > vetor[i+1]){
                    troca = true;
                    int temp = vetor[i+1];
                    vetor[i+1] = vetor[i];
                    vetor[i] = temp;
                }
            }
            passos++;
            System.out.printf("Passada %d: \n",passos);
            imprimir(vetor);
        } while (troca == true);
        System.out.print("Ordenado: ");
        imprimir(vetor);
    }
    static void imprimir(int vetor[]){
        for(int valor : vetor){
            System.out.print(valor+" ");
        }
        System.out.println("");
    }
    public static void main(){
        int valores[] = new int[tamanho_vetor];
        for(int i = 0; i < tamanho_vetor;i++){
            System.out.printf("Insira o %dº valor: ",i+1);
            valores[i] = Leituras.lerint();
        }
        bubblesort(valores);
    }
}
