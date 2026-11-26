package aula11_11_2;
public class Escolha {
    public static void main(){
        int avaliacao = 0;
        switch (avaliacao) {
            case 5:
                System.out.println("Otimo");    
            break;
            case 4:
                System.out.println("Boa");    
            break;
            case 3:
                System.out.println("Ok");    
            break;
            case 2:
                System.out.println("Ruim");    
            break;
            case 1:
                System.out.println("Péssimo");    
            break;
            default:
                System.out.println("Execução por enforcamento");
                break;
        }
    }

}
