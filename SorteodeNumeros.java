import java.util.Random;
import java.util.Stack;

public class SorteodeNumeros {

    public static void main(String[] args) {
        Stack<Integer> P = new Stack<>();
        Stack<Integer> N = new Stack<>();

        Random random = new Random();
        for(int i = 0; i <= 1000; i++){
            int num = random.nextInt(201) - 100;

            if(num > 0){
                P.push(num);
            }else{
                N.push(num);
            }
        }
        while(!P.isEmpty() && !N.isEmpty()){
            //se igual a 0 printar o topo da fila e remover esse elemento
            if(P.pop() + N.pop() == 0){
                System.out.println(P.pop() + " e " + N.pop());
            }
        }
    }
}


/* Outra solução
 
Stack<Integer> P = new Stack<>();
        Stack<Integer> N = new Stack<>();

        Random random = new Random();
        for(int i = 0; i <= 1000; i++){
            int num = random.nextInt(201) - 100;

            if(num > 0){
                P.push(num);
            }else{
                N.push(num);
            }
        }
        while(!P.isEmpty() && !N.isEmpty()){
            int numP = P.pop();
            int numN = N.pop();

            if(numP + numN == 0){
                System.out.println(numP + " e " + numN);
            }
        }
    }



 */