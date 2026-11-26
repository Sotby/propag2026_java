package atvav3;
import gxp.Leituras;

public class RemoverRepetidos {
    static int tamanho = 10;
    public static void main(){
        int valores[] = new int[tamanho];
        for(int i = 0; i < tamanho;i++){
            System.out.printf("Insira %dº valor: ",i+1);
            valores[i] = Leituras.lerint();
        }
        int SemRepetidos[] = new int[tamanho];
        int k = 0;
        int ContagemRemovidos = 0;
        for(int i = 0; i < tamanho;i++){
            boolean existe = false;
            for(int j = 0; j < k ;j++){
                if(valores[i] == SemRepetidos[j]){
                    existe = true;
                    ContagemRemovidos++;
                } 
            }
            if(existe == false){
                SemRepetidos[k] = valores[i];
                k++;
            }
        }
        System.out.print("Original: ");
        for(int i = 0; i < tamanho; i++){
            System.out.print(valores[i]+" ");
        }
        System.out.print("\nSem repetidos: ");
        for(int i = 0; i < k; i++){
            System.out.print(SemRepetidos[i]+" ");
        }
        System.out.printf("\nValores removidos: %d\n",ContagemRemovidos);
    }
}
