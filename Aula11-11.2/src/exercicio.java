import java.util.*;
public class exercicio {
    static Scanner scan = new Scanner(System.in);
    static final int max_notas = 3;
    public static void main(){
        float notas[];
        boolean error;
        notas = new float[max_notas];
        for(int i = 0; i < max_notas;i++){
            System.out.print("Insira a "+(i+1)+("ª nota: "));
            do{
                error = false;
                try{
                notas[i] = scan.nextFloat();
                } catch(Exception e){
                    error = true;
                    scan.next();
                    System.err.print("Entrada inválida! Tente novamente:");
                }
            } while(error == true);
        }
        float sum = 0;
        for(int i = 0; i < max_notas; i++){
            sum+=notas[i];
        }
        System.out.println("A média de nota dos alunos é: "+sum/max_notas);
    }
}
