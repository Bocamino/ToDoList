package todolist;

import java.util.Scanner;

public class ToDoList {

    
    public static void main(String[] args) {        
        
        Scanner sc = new Scanner(System.in);
        Tarefas tarefas = new Tarefas();  // Cria uma instância da classe Tarefas
        
        while (true) {
            System.out.println("\nBem-vindo(a) ao Organizador de Listas!");
            System.out.println("1) - Adicionar Tarefas");
            System.out.println("2) - Listar todas as Tarefas");
            System.out.println("3) - Editar Tarefas");
            System.out.println("4) - Remover Tarefas");
            System.out.println("5) - Sair do Programa");

            int menu = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha após "nextInt();"

            switch (menu) {
                case 1:
                    tarefas.addTarefa(); // Chama o método sem passar Scanner do Main no Parâmetro
                    break;

                case 2:
                    tarefas.listarTarefas(); // Listas exibidas muito grudadas. Arrumar
                    break;

                case 3:
                    // Fazer método de edição. Talvez armazenar algum ID? NetBeans da escola é desatualizado. Cria projeto novo e copia cód
                    break;
                case 4:
                    // Fazer método de remoção. Talvez armazenar algum ID?
                    break;

                case 5:
                    System.out.println("\nSaindo...");
                    sc.close(); // Encerra o Scanner ao sair do programa
                    return; // Sai do programa

                default: // Caso nenhuma das opções acima forem digitadas
                    System.out.println("\nOpcao invalida. Tente novamente.");
                    break;
            }

        }
    }
    
}
