package revisao;
public class lista_encadeada {
    node head = null;
    public void createnode(int valor){
        node new_node = new node(valor);
        if(head == null){
            head = new_node;
        } else if(head.valor > valor || head.valor == valor){
            new_node.prox = head;
            head = new_node;
        } else {
            node p = head;
            while (p.prox!=null && p.prox.valor < valor) {
                p = p.prox; 
            }
            new_node.prox = p.prox;
            p.prox = new_node;
        }
    }
    public void deletarnode(int valor){
        if(head == null) return;
        if(head.valor == valor){
            head = head.prox;
        } else {
            node p = head;
            while(p.prox != null && p.prox.valor < valor){
                p = p.prox;
            }
            if(p.prox != null && p.prox.valor == valor){
                p.prox = p.prox.prox;
            }
        }
    }
    public void imprimir(){
        if(head != null){
            node p = head;
            while(p != null){
                System.out.print(p.valor+" ");
                p = p.prox;
            }
            System.out.println("");
        }  
    }
}
