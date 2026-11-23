import gxp.Leituras;
public class PesquisaValores {
    static int tamanho_vetor = 10;
    public static void main(){
        int vetor[] = new int[tamanho_vetor];
        for(int i = 0; i < tamanho_vetor; i++){
            System.out.printf("Insira o valor da %2dº posição do vetor: ",i+1);
            vetor[i] = Leituras.lerint();
        }
        int soma = 0, pares = 0, impares = 0;
        for(int i = 0; i < tamanho_vetor; i++){
            soma+=vetor[i];
            if(vetor[i] % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }
        System.out.printf("Pares: %d\nImpares: %d\nSoma: %d",pares,impares,soma);
    }
}
