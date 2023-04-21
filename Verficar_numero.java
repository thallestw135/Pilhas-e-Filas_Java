import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Verficar_numero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Quantos números deseja inserir: ");
        int numbers = input.nextInt();

        List<Integer> f = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i <= 1000; i++) {
            int num = random.nextInt(1001);
            f.add(num);
        }

        Stack<Integer> p = new Stack<>();
        for (int i = 0; i < numbers; i++) {
            System.out.print("Insira o número na lista: ");
            int number = input.nextInt();
            f.add(number);
            //verificar se o número inserido na lista já existia.
            for(int j = 0; j < f.size(); j++){
                if(f.get(j) ==  number){
                    p.push(number);
                }
            }

        }
        input.close();
        System.out.println("Fila f: " + f);
        System.out.println("Pilha p: " + p);

    }
}