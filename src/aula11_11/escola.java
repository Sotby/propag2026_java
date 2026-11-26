package aula11_11;
import java.util.*;
public class escola {
    static int MAX_REGISTROS = 2;
    static  Scanner scanner = new Scanner(System.in);
    public static  void main(String[] args){
        aluno Alunos[];
        Alunos = new aluno[MAX_REGISTROS];
        for(int i = 0; i < MAX_REGISTROS;i++){
            Alunos[i] = new aluno();
            System.out.println("Insira o nome do "+(i+1)+"º aluno:");
            Alunos[i].nome = scanner.nextLine();
            System.out.println("Insira a idade do "+(i+1)+"º aluno:");
            Alunos[i].notas = scanner.nextInt();
            System.out.println("Insira a nota do "+(i+1)+"º aluno:");
            Alunos[i].notas = scanner.nextFloat();
            scanner.nextLine();
        }
        for(int i = 0; i < MAX_REGISTROS; i++){
            System.out.print(Alunos[i].nome+"-"+(Alunos[i].notas>7?"Aprovado":"Reprovado")+"\n");
        }
    }
}
