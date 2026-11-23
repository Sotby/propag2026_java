import java.util.Scanner;
public class BuscaNomes {
    static int nNomes = 6;
    static Scanner scan = new Scanner(System.in);
    public static void main(){
        String nomes[] = new String[nNomes];
        int contagem = 0;
        for(int i = 0; i < nNomes; i++){
            System.out.printf("Insira o %dº nome: ",i+1);
            nomes[i] = scan.nextLine();
        }
        System.out.printf("Insira um nome para ser buscado: ");
        String busca = scan.nextLine();
        String minuscula = busca.toLowerCase();
        for(int i = 0; i < nNomes; i++){
            if(nomes[i].toLowerCase().equals(minuscula)){
                System.out.printf("Encontrado na posição %d%n",i+1);
                contagem++;
            }
        }
        if(contagem > 0){
            System.out.printf("%s aparece %d vez(es).%n",busca,contagem);
        } else {
            System.out.printf("%s não foi encontrado.%n",busca);
        }
    }
}
