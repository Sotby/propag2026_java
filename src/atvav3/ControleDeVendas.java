package atvav3;
import gxp.Leituras;

public class ControleDeVendas {
    static int linhas = 3;
    static int colunas = 4;
    public static void main(){
        int[][] vendas = new int[linhas][colunas];
        int total = 0, maior = 0;
        for(int i = 0; i < linhas;i++){
            for(int j = 0; j < colunas;j++){
                System.out.printf("Insira o número de vendas do vendedor %d no dia %d: ",i+1,j+1);
                vendas[i][j] = Leituras.lerint();
                if(i == 0 && j == 0){
                    maior = vendas[i][j];
                } else {
                    if(vendas[i][j]>maior) maior = vendas[i][j];
                }
            }
        }
        for(int i = 0; i < linhas; i++){
            int soma = 0;
            for(int j = 0; j < colunas; j++){
                soma+=vendas[i][j];
            }
            System.out.printf("Funcionario %d: %d\n",i+1,soma);
            total+=soma;
        }
        System.out.println("Total Geral: "+total);
        System.out.println("Maior Venda: "+maior);
        
    }
}
