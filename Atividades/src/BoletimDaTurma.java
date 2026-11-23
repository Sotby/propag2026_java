import java.util.Scanner;

import gxp.Leituras;
public class BoletimDaTurma {
    static int nAlunos = 4;
    static int nNotas = 3;
    static Scanner scan = new Scanner(System.in);
    public static void main(){
        String nomes[] = new String[nAlunos];
        String Disciplinas[] = {"Logica","Banco de Dados","Redes"};
        double notas[][] = new double[nAlunos][nNotas];
        for(int i = 0; i < nAlunos; i++){
            System.out.printf("Insira o nome do %dº aluno: ",i+1);
            nomes[i] = scan.nextLine();
            for(int j = 0; j < nNotas; j++){
                System.out.printf("Insira a nota de %s em %s: ",nomes[i],Disciplinas[j]);
                notas[i][j] = Leituras.lerdouble();
            }
        }
        double MaiorMedia = 0;
        int MaiorMediaNumero = 0;
        for(int i = 0; i < nAlunos; i++){
            double soma = 0;
            for(int j = 0; j < nNotas; j++){
                soma+=notas[i][j];
            }
            double media = soma/nNotas;
            if(i == 0) MaiorMedia = media;
            else {
                if (media > MaiorMedia){
                    MaiorMedia = media;
                    MaiorMediaNumero = i;
                } 
            }
            if(media>=7){
                System.out.printf("%s: %.2f - Aprovado\n",nomes[i],media);
            } else if(media >=5){
                System.out.printf("%s: %.2f - Recuperação\n",nomes[i],media);
            } else {
                System.out.printf("%s: %.2f - Reprovado\n",nomes[i],media);
            }
        }
        for(int j = 0; j < nNotas; j++){
            double soma = 0;
            for(int i = 0; i < nAlunos; i++){
                soma+=notas[i][j];
            }
            double media = soma/nAlunos;
            System.out.printf("%s: %.2f\n",Disciplinas[j],media);
        }
        System.out.printf("Maior média: %s (%.2f)",nomes[MaiorMediaNumero],MaiorMedia);
    }
}
