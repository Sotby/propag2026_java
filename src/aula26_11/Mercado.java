package aula26_11;
import java.util.Scanner;
public class Mercado {
    static int max_produtos = 100;
    static Produto produtos[] = new Produto[100];
    static int prox_id = 1;
    static int nprodutos = 0;
    static Scanner scan = new Scanner(System.in);
    static void registrar(){
        if(nprodutos < max_produtos){
            scan.nextLine();
            System.out.print("Insira o nome do produto> ");
            String nome = scan.nextLine();
            System.out.print("Insira o valor do produto> ");
            double valor = scan.nextDouble();
            produtos[nprodutos] = new Produto(nome,valor,prox_id);
            prox_id++;
            nprodutos++;
        } else {
            System.err.println("Espaço insuficiente para novos registros!");
        }
    }
    static int busca_id(){
        System.out.print("Insira o ID do produto> ");
        int id = scan.nextInt();
        for(int i = 0; i < nprodutos; i++){
            if(produtos[i].id == id){
                return i;
            }
        }
        return -1;
    }
    static void adicionar_estoque(){
        int p = busca_id();
        if(p != -1){
            System.out.print("Insira a quantia a ser adicionada ao estoque> ");
            int estoque = scan.nextInt();
            produtos[p].adicionar_estoque(estoque);
        } else {
            System.err.println("ID inválido");
        }
    }
    static void remover_estoque(){
        int p = busca_id();
        if(p != -1){
            System.out.print("Insira a quantia a ser removida do estoque> ");
            int estoque = scan.nextInt();
            produtos[p].remover_estoque(estoque);
        } else {
            System.err.println("ID inválido");
        }
    }
    static void listar_produtos(){
        System.out.println("PRODUTOS");
        for(int i = 0; i < nprodutos; i++){
            produtos[i].exibir();
        }
    }
    static void remover_produto(){
        int p = busca_id();
        if(p != -1){
            for(int i = p; i < nprodutos; i++){
                produtos[i] = produtos[i+1];
            }
            nprodutos--;
        } else {
            System.err.println("ID inválido");
        }
    }
    static void atualizar_produto(){
        int p = busca_id();
        if(p != -1){
            int r = 0;
            System.out.print("O que deseja atualizar?\n1-Nome\n2-Valor\nResposta> ");
            r = scan.nextInt();
            switch(r){
                case 1:
                    System.out.print("Insira o novo nome> ");
                    String nome = scan.nextLine();
                    produtos[p].nome = nome;
                break;
                case 2:
                    System.out.print("Insira o novo preço> ");
                    double preco = scan.nextDouble();
                    if(preco > 0){
                        produtos[p].valor = preco;
                    } else {
                        System.err.println("Valor inválido!");
                    }
                break;
                default:
                    System.err.println("Valor inserido inválido!");
                break;
            }
        } else {
            System.err.println("ID inválido");
        }
    }
    static void valor_total(){
        int p = busca_id();
        if(p != -1){
            System.out.printf("O valor total de %s é : %.2f\n",produtos[p].nome,produtos[p].valor_total());
        } else {
            System.err.println("ID inválido");
        }
    }
    static void buscar_produto(){
        System.out.print("Como deseja buscar?\n1-ID\n2-Nome\nResposta> ");
        int r = scan.nextInt();
        scan.nextLine();
        switch(r){
            case 1:
                int p = busca_id();
                if(p != -1){
                    produtos[p].exibir();
                } else {
                    System.err.println("ID invalido");
                }
            break;
            case 2:
                System.out.print("Insira o nome do produto buscado> ");
                String nome = scan.nextLine();
                for(int i = 0; i < nprodutos; i++){
                    if(produtos[i].nome.contains(nome)){
                        produtos[i].exibir();
                    }
                }
        }
    }
    public static void main(){
        int r = -1;
        do{
            System.out.printf("x===Sistema Mercado===x\n1-Registrar Produto\n2-Adicionar Estoque\n3-Remover Estoque\n4-Listar Produtos\n5-Remover produto\n6-Atualizar Produto\n7-Valor total de um produto\n8-Buscar Produto\n0-Sair\nResposta> ");
            r = scan.nextInt();
            switch(r){
                case 1:
                    registrar();
                break;
                case 2:
                    adicionar_estoque();
                break;
                case 3:
                    remover_estoque();
                break;
                case 4:
                    listar_produtos();
                break;
                case 5:
                    remover_produto();
                break;
                case 6:
                    atualizar_produto();
                break;
                case 7:
                    valor_total();
                break;
                case 8:
                    buscar_produto();
                break;
                case 0:
                    System.out.println("Saindo...");
                break;
                default:
                    System.err.println("Valor inválido!");
                break;
            }
        } while(r != 0);
    }
}
