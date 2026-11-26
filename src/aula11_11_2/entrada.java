package aula11_11_2;
import java.util.*;
public class entrada {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        String nome;
        int idade = 0;
        float altura = 0;
        boolean error = false;
        System.out.println("Digite o seu nome: ");
        nome = scan.nextLine();
        System.out.println("Digite a sua idade: ");
        do{
            error = false;
            try{
                idade = scan.nextInt();
            } catch(Exception e){
                scan.next();
                System.err.println("Entrada inválida! Tente novamente:");
                error = true;
            }
        } while(error == true);
        System.out.println("Digite sua altura em metros: ");
        do{
            error = false;
            try{
                altura = scan.nextFloat();
            } catch(Exception e){
                scan.next();
                System.err.println("Entrada inválida! Tente novamente:");
                error = true;
            }
        } while(error == true);
        System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nAltura: "+altura);
    }
}
