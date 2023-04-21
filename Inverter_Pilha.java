import java.util.Stack;

public class Inverter_Pilha {   
    public static void PilhaIversa(){
        Stack<Integer> pilha = new Stack<>();
        for(int i = 1; i < 21; i++){
            pilha.add(i);
        }System.out.println("Pilha original: " + pilha);
        

        Stack<Integer> pilhaInversa = new Stack<>();
        int tamanhoPilhaOriginal = pilha.size();

        for (int i = 0; i < tamanhoPilhaOriginal; i++) {
            pilhaInversa.push(pilha.pop());
        }System.out.println("Pilha inversa: " + pilhaInversa);
    }
    
    public static void main(String[] args) {
        /* Caso retire o "static" deverá instanciar o objeto

        Pilha_7 pilhas = new Pilha_7();
        pilhas.PilhaIversa(); 
        
        */
        
        PilhaIversa();
    }    
}
