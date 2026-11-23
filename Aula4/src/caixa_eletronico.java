import java.util.*;
public class caixa_eletronico {
    static Scanner scan = new Scanner(System.in);
    public static double input_valor(){
        double v = 0;
        boolean erro = false;
        System.out.println("Insira o valor:");
        do{
            erro = false;
            try{
                v = scan.nextDouble();
                scan.nextLine();
                if(v <= 0) System.err.println("O valor não pode ser zero ou negativo! Tente novamente:");
            } catch (Exception e){
                erro = true;
                scan.nextLine();
                System.err.println("Entrada inválida! Tente novamente:");
            }
        } while (erro == true || v <=0);
        return v;
    }
    public static int input_resposta(){
        int v = 0;
        boolean erro = false;
        System.out.println("Insira o valor: ");
        do{
            erro = false;
            try{
                v = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                erro = true;
                scan.nextLine();
                System.err.println("Entrada inválida! Tente novamente:");
            }
        } while (erro == true);
        return v;
    }
    public static  void main(){
        double saldo = 1000;
        int resposta = -1;
        do{
            System.out.printf("===%s===%n1 - Consultar saldo%n2- Depositar%n3 - Sacar%n0 - Sair%n","Caixa Eletrônico");
            resposta = input_resposta();
            switch(resposta){
                case 1:
                    System.out.println("Saldo atual:"+saldo);
                break;
                case 2:
                    saldo+=input_valor();
                break;
                case 3:
                    saldo-=input_valor();
                break;
                case 0:
                    System.out.println("Saindo...");
                break;
                default:
                    System.err.println("Entrada Invalida!");
                break;
            }
        } while(resposta != 0);
    }
}
