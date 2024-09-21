// Como está no mesmo pacote, não precisa importar essa classe no Main
package todolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefas {
    
    Scanner sc = new Scanner(System.in);
    List<String> lista = new ArrayList<>();
    
    /* Não houve necessidade desses atributos
    private List<String> nomeTarefa;
    private List<String> descTarefa;
    */  
    
    public void addTarefa(){ // Caso fosse "addTarefa(Scanner sc)", usaria o Scanner passado do main
        System.out.print("\nEntre com o nome da tarefa: ");
        String nomeTarefa = sc.nextLine(); // Usa o Scanner da própria classe
        lista.add(nomeTarefa);  // Adiciona o nome da tarefa na lista
        
        System.out.print("Entre com a descricao da tarefa: ");
        String descTarefa = sc.nextLine();
        lista.add(descTarefa);               
    }
    
    public void listarTarefas(){
        System.out.println("\nTarefas: (Nome e Descricao)");
        System.out.println();
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " \n"); 
        }
        System.out.println();
    }
    
    //sc.close(); Scanner só pode ser fechado dentro do Main para evitar problemas
}
