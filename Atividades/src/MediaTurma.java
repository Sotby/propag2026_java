import gxp.Leituras;
public class MediaTurma {
    static int nNotas = 5;
    public static void main(){
        double notas[];
        int aprovados = 0,reprovados = 0;
        double total = 0;
        notas = new double[nNotas];
        for(int i = 0; i < nNotas; i++){
            System.out.print("Insira a nota do "+(i+1)+"º aluno:");
            notas[i] = Leituras.lerdouble();
            if(notas[i]>10) notas[i] = 10;
            if(notas[i]<0) notas[i] = 0;
            total += notas[i];
            if(notas[i] >= 7) aprovados++;
            else reprovados++;
        }
        System.out.println("Média dos alunos: "+(total/nNotas));
        System.out.println("Aprovados: "+aprovados);
        System.out.println("Reprovados: "+reprovados);
    }
}
