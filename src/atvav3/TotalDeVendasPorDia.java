package atvav3;
import gxp.Leituras;
public class TotalDeVendasPorDia {
    static int linhas = 3;
    static int colunas = 4;
    public static void main(){
        int[][] vendas = new int[linhas][colunas];
        for(int i = 0; i < linhas;i++){
            for(int j = 0; j < colunas;j++){
                System.out.printf("Insira o número de vendas do vendedor %d no dia %d: ",i+1,j+1);
                vendas[i][j] = Leituras.lerint();
            }
        }
        int maior = 0, maiordia = 0;
        for(int j = 0; j < colunas; j++){
            int soma = 0;
            for(int i = 0; i < linhas; i++){
                soma+=vendas[i][j];
            }
            if(j == 0){
                maior = soma;
                maiordia = j;
            } else{
                if(soma>maior){
                    maior = soma;
                    maiordia = j;
                }
            }
            System.out.printf("Dia %d: %d\n",j+1,soma);
        }
        System.out.printf("Maior total: Dia %d (%d)",maiordia+1,maior);

    }
}
