import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class PositivoseNegativos {

    public static void main(String[] args) {
        
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();
        
        Random random = new Random();
        
        // Sorteia 1000 números positivos e adiciona na fila
        for(int i = 0; i < 1000; i++) {
            int num = random.nextInt(1001);
            fila.add(num);
        }
        
        // Sorteia 1000 números negativos e adiciona na fila
        for(int i = 0; i < 1000; i++) {
            int num = -random.nextInt(1001);
            fila.add(num);
        }
        
        // Enquanto a fila não estiver vazia
        while(!fila.isEmpty()) {
            int num = fila.remove();
            
            // Se for positivo, adiciona na pilha
            if(num > 0) {
                pilha.push(num);
            }
            // Se for negativo, imprime o topo da pilha e remove
            else {
                if(!pilha.isEmpty()) {
                    System.out.println("Topo da pilha: " + pilha.peek());
                    pilha.pop();
                }
            }
        }
    }
}
