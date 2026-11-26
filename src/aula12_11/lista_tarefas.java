package aula12_11;
import java.time.*;
import java.util.*;
public class lista_tarefas {
    final static int max_tarefas = 20;
    static tarefa tarefas[];
    static int nun_tarefas = 0, ultimo_id = 0;
    static Scanner scan = new Scanner(System.in);
    public static int busca_id(int id){
        for(int i = 0; i < nun_tarefas; i++){
            if(tarefas[i].id == id){
                return  i;
            }
        }
        System.err.println("Erro! ID não encontrado!");
        return -1;
    }
    public static void deletar(int id){
        int p = busca_id(id);
        if(p != -1){
            for(int i = p; i < nun_tarefas-1; i++){
                tarefas[i] = tarefas[i+1];
            }
            nun_tarefas--;
        }
    }
    public static void cadastrar(){
       if(nun_tarefas < max_tarefas){
            tarefas[nun_tarefas] = new tarefa();
            System.out.print("Insira o nome da tarefa: ");
            do{
                tarefas[nun_tarefas].nome = scan.nextLine();
                if(tarefas[nun_tarefas].nome.isBlank()){
                    System.err.println("O nome não pode estar vazio!Tente novamente");
                }
            } while(tarefas[nun_tarefas].nome.isBlank());
            System.out.print("Insira a descrição da tarefa: ");
            tarefas[nun_tarefas].id = ultimo_id + 1;
            ultimo_id++;
            tarefas[nun_tarefas].descricao = scan.nextLine();
            tarefas[nun_tarefas].status = "Pendente";
            tarefas[nun_tarefas].data_criacao = LocalDate.now();
            nun_tarefas++;
       }
    }
    public static void Concluir(int id){
        int p = busca_id(id);
        if(p != -1){
            tarefas[p].status = "Concluida";
            tarefas[p].data_atualizacao = LocalDate.now();
        }
    }
    public static void printline(){
        System.out.println("+"+"-".repeat(19+132)+"+");
    }
    public static void listar(){
        printline();
        System.out.printf("| %-4s | %-20s | %-50s | %-20s | %-20s | %-20s |%n","ID","Nome","Descrição","Status","Data de Criação","Data de Atualização");
        printline();
        for(int i = 0; i < nun_tarefas; i++){
            System.out.printf("| %-4s | %-20s | %-50s | %-20s | %-20s | %-20s |%n",tarefas[i].id,tarefas[i].nome, tarefas[i].descricao, tarefas[i].status, tarefas[i].data_criacao, tarefas[i].data_atualizacao);
            printline();
        }
    }
    public static void atualizar(int id){
        int p = busca_id(id);
        if(p != -1){
            int r = 0;
            boolean error = false;
            System.out.println("1-Nome: "+tarefas[p].nome);
            System.out.println("2-Descrição: "+tarefas[p].descricao);
            System.out.println("3-Cancelar alteração");
            System.out.println("O que deseja alterar?");
            do{
                error = false;
                try{
                    r = scan.nextInt();
                    scan.nextLine();
                } catch (Exception e){
                    scan.next();
                    error = true;
                    System.err.println("Entrada Inválida! Tente novamente:");
                }
            } while(error == true);
            switch(r){
                case 1:
                    System.out.println("Insira o novo nome: ");
                    tarefas[p].nome = scan.nextLine();
                break;
                case 2:
                    System.out.println("Insira a nova descrição: ");
                    tarefas[p].descricao = scan.nextLine();
                break;
                case 3:
                    System.out.println("Cancelado");
                break;
                default:
                break;
            }
            if(r == 1 || r == 2){
                tarefas[p].data_atualizacao = LocalDate.now();
            }

        }

    }
    public static void main(String[] args) throws Exception {
        tarefas = new tarefa[max_tarefas];
        int input = 0;
        boolean erro = false;
        do{
            System.out.print("Sistema de Gerenciamento de Tarefas\n1-Cadastrar tarefa\n2-Atualizar Tarefa\n3-Concluir uma tarefa\n4-Listar Tarefas\n5-Deletar Tarefa\n6-Sair\nResposta: ");
            do{
                erro = false;
                try{
                    input = scan.nextInt();
                    scan.nextLine();
                } catch (Exception e){
                    scan.nextLine();
                    erro = true;
                    System.err.println("Entrada inválida! Tente novamente:");
                }
            } while (erro == true);
            switch (input) {
                case 1:
                    cadastrar();
                break;
                case 2:
                    System.out.print("Insira o ID da tarefa que deseja atualizar: ");
                    do{
                        erro = false;
                        try{
                            atualizar(scan.nextInt());
                            scan.nextLine();
                        } catch (Exception e){
                            scan.nextLine();
                            erro = true;
                            System.err.println("Entrada inválida! Tente novamente:");
                        }
                    } while(erro == true);
                break;
                case 3:
                    System.out.print("Insira o ID da tarefa que deseja atualizar: ");
                    do{
                        erro = false;
                        try{
                            Concluir(scan.nextInt());
                            scan.nextLine();
                        } catch (Exception e){
                            scan.nextLine();
                            erro = true;
                            System.err.println("Entrada inválida! Tente novamente:");
                        }
                    } while(erro == true);
                break;
                case 4:
                    listar();
                break;
                case 5:
                    System.out.print("Insira o ID da tarefa que deseja atualizar: ");
                    do{
                        erro = false;
                        try{
                            deletar(scan.nextInt());
                            scan.nextLine();
                        } catch (Exception e){
                            scan.nextLine();
                            erro = true;
                            System.err.println("Entrada inválida! Tente novamente:");
                        }
                    } while(erro == true);
                break;
                case 6: 
                    System.out.println("Saindo...");
                break;
                default:
                break;
            }
        } while(input != 6);
    }
}
