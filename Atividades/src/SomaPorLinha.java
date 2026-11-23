import gxp.Leituras;

public class SomaPorLinha {
    static int linhas = 3;
    static int colunas = 2;
    public static void main(){
        int notas[][] = new int[linhas][colunas];
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.printf("Insira a %dª nota do aluno %d: ",j+1,i+1);
                notas[i][j] = Leituras.lerint();
            }
        }
        int total = 0;
        for(int i = 0; i < linhas; i++){
            int soma = 0;
            for(int j = 0; j < colunas;j++){
                soma+=notas[i][j];
            }
            System.out.printf("Soma do aluno %d: %d\n",i+1,soma);
            total+=soma;
        }
        System.out.println("Total Geral: "+total);
    }
}
