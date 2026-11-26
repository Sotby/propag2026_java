package aula13_11;
import java.util.Scanner;
public class potencia {
    static Scanner scan = new Scanner(System.in);
    public static double pon(int base, int potencia){
        double v = 1;
        if(potencia >= 0){
            for(int i = 0; i < potencia; i++){
                v*=base;
            }
        } else {
            potencia*=-1;
            for(int i = 0; i < potencia; i++){
                System.out.println("Entrou no else");
                v/=base;
            }
        }
        
        return v;
    }
    
    public static void main(){
        boolean erro = false;
        int v = 0, potencia = 0;
        System.out.println("Insira a base: ");
        do{
            erro = false;
            try{
                v = scan.nextInt();
            } catch (Exception e){
                erro = true;
                scan.nextLine();
                System.err.println("Entrada inválida! Tente novamente: ");
            }
        } while (erro == true);
        System.out.println("Insira o expoente: ");
        do{
            erro = false;
            try{
                potencia = scan.nextInt();
            } catch (Exception e){
                erro = true;
                scan.nextLine();
                System.err.println("Entrada inválida! Tente novamente: ");
            }
        } while (erro == true);
        System.out.printf("O resuldato de %d elevado a %d é igual a: %f",v,potencia,pon(v,potencia));
    }
}
