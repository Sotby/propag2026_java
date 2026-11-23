import  java.util.*;
public class sucessor_antecessor {
    static Scanner scan = new Scanner(System.in);
    public static void main(){
        int v = 0;
        boolean error = false;
        System.out.print("Insira um valor: ");
        do{
            error = false;
            try{
                v = scan.nextInt();
            } catch(Exception e){
                scan.nextLine();
                error = true;
                System.err.println("Valor inválido! Tente novamente: ");
            }
        } while(error == true);
        System.out.println("Numero: "+v+"\nSucessor: "+(v+1)+"\nAntecessor: "+(v-1));
    }
}
