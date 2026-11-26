package aula16_11;
import java.util.Scanner;
public class ExercicioPares {
    static Scanner scan = new Scanner(System.in);
    public static void main(){
        int n = 0;
        boolean erro = false;
        System.out.println("Insira um valor inteiro:");
        do{
            erro = false;
            try{
                n = scan.nextInt();
                scan.nextLine();
            } catch(Exception e){
                erro = true;
                System.err.println("Entrada Inválida! Tente novamente:");
            }
        } while(erro == true);
        for(int i = 1; i <= n;i++){
            if(i%2 == 0){
                System.out.println(i+" é par");
            } else {
                System.out.println(i+" é impar");
            }
        }
    }
}
