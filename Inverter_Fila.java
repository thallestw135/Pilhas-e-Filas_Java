import java.util.*;

public class Inverter_Fila {
    
    public static Queue<Integer> inverterFila(Queue<Integer> f1){
        Queue<Integer> f2 = new LinkedList<>();
        Stack<Integer> pilha = new Stack<Integer>();

        while(!f1.isEmpty()){
            pilha.push(f1.remove());
        }

        while(!pilha.isEmpty()){
            f2.add(pilha.pop());
        }

        return f2;
    }
    
    public static void main(String[] args) {
        Queue<Integer> f1 = new LinkedList<Integer>();
        Random random = new Random();
        for(int i = 0; i<= 100; i++){
            int num = random.nextInt(101);
            f1.add(num);
        }

        
        System.out.println("Fila original: " + f1);
        Queue<Integer> f2 = inverterFila(f1);
        System.out.println("Fila invertida: " + f2);
        
    }
}
