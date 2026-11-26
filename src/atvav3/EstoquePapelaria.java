package atvav3;
import gxp.Leituras;
import java.util.Scanner;
public class EstoquePapelaria {
    static Scanner scan = new Scanner(System.in);
    public static class Produto{
        String nome;
        int quantidade;
        double preco;
        Produto(String nome, int quantidade, double preco){
            this.nome = nome;
            this.quantidade = quantidade;
            this.preco = preco;
        }
        public void retorno(){
            System.out.printf("| %-10s | %-10d | %-10f |\n",this.nome,this.quantidade,this.preco);
        }
    }
    static void listar(Produto[] produtos){
        System.out.printf("\n    | %-10s | %-10s | %-10s |\n","Produto","Quantidade","Preço");
        int i = 1;
        for(Produto p : produtos){
            System.out.print(i+" - ");
            p.retorno();
            i++;
        }
        System.out.println("");
    }
    static int buscar(Produto produtos[]){
        listar(produtos);
        System.out.print("Insira o codigo do produto: ");
        int codigo = Leituras.lerint();
        if(codigo-1 < produtos.length && codigo>0){
            return codigo-1;
        }
        return -1;
    }
    static void entrada(Produto produtos[]){
        int pos = buscar(produtos);
        if(pos != -1){
            System.out.print("Quantos produtos entraram no estoque?\nResposta> ");
            int entrada = Leituras.lerint();
            produtos[pos].quantidade+=entrada;
            System.out.println("Estoque atualizado!");
        } else {
            System.out.println("Produto não registrado!");
        }
    }
    static void venda(Produto produtos[]){
        int pos = buscar(produtos);
        if(pos != -1){
            System.out.print("Quantas unidades foram vendidas?\nRespota> ");
            int vendas = Leituras.lerint();
            if(produtos[pos].quantidade>=vendas){
                produtos[pos].quantidade-=vendas;
                System.out.println("Venda: "+vendas*produtos[pos].preco+". Restam "+produtos[pos].quantidade);
            } else {
                System.out.println("Estoque insuficiente. Disponivel: "+produtos[pos].quantidade);
            }
        }
    }
    static void total(Produto produtos[]){
        double total = 0;
        for(Produto p : produtos){
            total+=p.preco*p.quantidade;
        }
        System.out.println("Valor total: "+total);
    }
    public static void main(){
        Produto estoque[] = {
            new Produto("Caderno",10,18.9),
            new Produto("Caneta",25,2.5),
            new Produto("Lápis",30,1.2),
            new Produto("Borracha",8,3.0)
        };
        int resposta = 0;
        do{
            System.out.printf("===Papelaria===\n1 - Listar estoque\n2 - Entrada de produto\n3 - Venda\n4 - Valor Total do Estoque\n0 - Sair\nResposta> ");
            resposta = Leituras.lerint();
            switch (resposta) {
                case 1:
                    listar(estoque);
                break;
                case 2:
                    entrada(estoque);
                break;
                case 3:
                    venda(estoque);
                break;
                case 4:
                    total(estoque);   
                break;
                case 0:
                    System.out.println("Saindo...");
                break;
                default:
                    System.out.println("Entrada inválida!");
                break;
            }
        } while(resposta != 0);
    }
}
