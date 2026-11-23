package gxp;
import java.util.Scanner;
public class Leituras {
    public static Scanner scan = new Scanner(System.in);
    public static int lerint(){
        while(true){
            try{
                int a = scan.nextInt();
                return a;
            } catch(Exception e){
                System.err.println("Entrada Inválida! Tente novamente:");
                scan.nextLine();
            }
        }
    }
    public static double lerdouble(){
        while(true){
            try{
                double a = scan.nextDouble();
                return a;
            } catch(Exception e){
                System.err.println("Entrada Inválida! Tente novamente:");
                scan.nextLine();
            }
        }
    }
    public static float lerfloat(){
        while(true){
            try{
                float a = scan.nextFloat();
                return a;
            } catch(Exception e){
                System.err.println("Entrada Inválida! Tente novamente:");
                scan.nextLine();
            }
        }
    }
}
