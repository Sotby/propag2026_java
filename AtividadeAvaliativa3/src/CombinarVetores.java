import gxp.Leituras;

public class CombinarVetores {
    static int nValores = 5;
    public static void main(){
        int A[] = new int[nValores], B[] = new int[nValores];
        for(int i = 0; i < nValores; i++){
            System.out.printf("Insira o %dº valor do vetor A: ",i+1);
            A[i] = Leituras.lerint();
        }
        for(int i = 0; i < nValores; i++){
            System.out.printf("Insira o %dº valor do vetor B: ",i+1);
            B[i] = Leituras.lerint();
        }
        int C[] = new int[nValores];
        int D[] = new int[nValores*2];
        for(int i = 0; i < nValores;i++){
            C[i] = A[i] + B[i];
            D[i*2] = A[i];
            D[(i*2)+1] = B[i];
        }
        System.out.print("A: ");
        for(int i = 0; i < nValores;i++){
            System.out.print(A[i]+" ");
        }
        System.out.print("\nB: ");
        for(int i = 0; i < nValores;i++){
            System.out.print(B[i]+" ");
        }
        System.out.print("\nC:");
        for(int i = 0; i < nValores;i++){
            System.out.print(C[i]+" ");
        }
        System.out.print("\nD: ");
        for(int i = 0; i < nValores*2;i++){
            System.out.print(D[i]+" ");
        }

    }  
}
