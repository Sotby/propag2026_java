package atvav3;
import java.util.Scanner;
public class MensagemBoasVindas {
    static Scanner scan = new Scanner(System.in);
    public static void apresentar(String nome){
        System.out.println("Olá, "+nome+"! Seja bem-vindo(a).");
    }
    public static void main(){
        System.out.print("Insira o seu nome: ");
        String nome = scan.nextLine();
        apresentar(nome);
    }
}
