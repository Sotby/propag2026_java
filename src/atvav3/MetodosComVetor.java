package atvav3;
import gxp.Leituras;

public class MetodosComVetor {
    public static int[] LerVetor(int[] vetor){
        for(int i = 0; i < vetor.length;i++){
            System.out.print("Insira o "+(i+1)+"º valor: ");
            vetor[i] = Leituras.lerint();
        }
        return  vetor;
    }
    public static void Mostrar(int[] vetor){
        System.out.print("Vetor: ");
        for(int numero: vetor){
            System.out.print(numero+" ");
        }
        System.out.println("");
    }
    public static int Somar(int[] vetor){
        int soma = 0;
        for(int valor : vetor){
            soma+=valor;
        }
        return soma;
    }
    public static double Media(int[] vetor){
        int soma = Somar(vetor);
        return soma/vetor.length;
    }
    public static int Maior(int[] vetor){
        int maior = 0;
        for(int i = 0; i < vetor.length; i++){
            if(i==0) maior = vetor[i];
            else{
                if(vetor[i]> maior) maior = vetor[i];
            }
        }
        return maior;
    }
    public static int Contar(int[] vetor, int valor){
        int contagem = 0;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == valor) contagem++;
        }
        return contagem;
    }
    public static void main(){
        int vetor[] = new int[6];
        vetor = LerVetor(vetor);
        Mostrar(vetor);
        System.out.println("Soma: "+Somar(vetor));
        System.out.println("Média: "+Media(vetor));
        System.out.println("Maior: "+Maior(vetor));
        System.out.print("Deseja contar qual valor? ");
        int valor = Leituras.lerint();
        System.out.println("O valor "+valor+" aparece "+Contar(vetor,valor)+" vez(es).");
        
    }
}
