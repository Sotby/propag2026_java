package aula13_11;
import java.util.*;
public class App {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        boolean erro = false, existe = false;
        int numeros[] = {1,2,3,4,5,6,7,8,9,10};
        int valor = 0;
        System.out.println("Insira um valor a ser buscado: ");
        do{
            try{
                erro = false;
                valor = scan.nextInt();
                scan.nextLine();
            } catch (Exception e) {
                erro = true;
                scan.nextLine();
                System.err.println("Entrada inválida! Tente novamente: ");
            }
        } while(erro == true);
        for(int numero : numeros){
            if(numero == valor){
                existe = true;
                break;
            }
        }
        String resposta = existe?"existe no vetor":"não existe no vetor";
        System.out.println("O valor inserido "+ resposta);
    }
}
