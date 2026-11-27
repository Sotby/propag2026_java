package aula26_11;

public class Produto {
    int id;
    String nome;
    double valor;
    int estoque;
    Produto(String nome, double valor,int id){
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.estoque = 0;
    }
    void adicionar_estoque(int quantia){
        if(quantia > 0){
            this.estoque+=quantia;
        } else {
            System.err.println("Valor inserido inválido!");
        }
    }
    void remover_estoque(int quantia){
        if(quantia > 0){
            if(this.estoque >= quantia){
                this.estoque-=quantia;
            } else {
                System.err.println("Estoque insuficiente!");
            }
        } else {
            System.err.println("Valor inserido inválido!");
        }
    }
    double valor_total(){
        return this.estoque*this.valor;
    }
    void exibir(){
        System.out.printf("%-3d | %-20s | R$ %-4.2f | %20d un.\n",this.id,this.nome,this.valor,this.estoque,valor_total());
    }
}
