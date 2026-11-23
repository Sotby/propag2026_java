import gxp.Leituras;

public class Primos {
    static int tamanho_vetor = 8;
    static boolean primo(int valor){
        if(valor <=1) return false;
        for(int i = 2; i < valor/2; i++){
            if(valor % i == 0) return false;
        }
        return true;
    }
    static int[] filtrarprimos(int vetor[]){
        int vetor_temp[] = new int[tamanho_vetor];
        int k = 0;
        for(int i = 0; i < tamanho_vetor; i++){
            if(primo(vetor[i])){
                vetor_temp[k] = vetor[i];
                k++;
            }
        }
        int vetor_primo[] = new int[k];
        for(int i = 0; i < k; i++){
            vetor_primo[i] = vetor_temp[i];
        }
        return vetor_primo;
    }
    public static void main(){
        int valores[] = new int[tamanho_vetor];
        for(int i = 0; i < tamanho_vetor; i++){
            System.out.printf("Insira o valor do %dº número: ",i+1);
            valores[i] = Leituras.lerint();
        }
        int primos[] = filtrarprimos(valores);
        System.out.print("Primos encontrados: ");
        for(int primo : primos){
            System.out.print(primo+" ");
        }
        System.out.printf("\nTotal: %d de %d",primos.length,valores.length);
    }
}
