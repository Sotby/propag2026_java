package aula17_11;
import gxp.Leituras;
public class pesquisa {
    static int max_numeros = 10;
    public static int ContarPares(int vetor[]){
        int contagem = 0;
        for(int numero : vetor){
            if(numero % 2 == 0) contagem++;
        }
        return contagem;
    }
    public static void imprimir(int vetor[]){
        for(int numero : vetor){
            System.out.print(numero+" ");
        }
        System.out.println("");
    }
    public static void main() {
        int numeros[];
        numeros = new int[max_numeros];
        int soma = 0;
        for(int i = 0; i < max_numeros; i++){
            System.out.print("Insira o "+(i+1)+"º número: ");
            numeros[i] = Leituras.lerint();
            soma+= numeros[i];
        }
        int nPares = ContarPares(numeros);
        int nImpares = max_numeros - nPares;
        imprimir(numeros);
        System.out.println("Pares: "+nPares);
        System.out.println("Impares: "+nImpares);
        System.out.println("Total: "+soma);
    }
}
