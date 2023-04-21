import java.util.*;

public class Remover_Caracter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String texto = input.nextLine();
        System.out.print("Digite o elemento que deseja remover: ");
        String remove = input.nextLine();
        input.close();

        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                pilha.push(c);
            }
        }

        Stack<Character> temp = new Stack<>();
        while (!pilha.isEmpty()) {
            char c = pilha.pop();
            if (String.valueOf(c).equals(remove)) {
                // não adiciona o elemento removido na nova pilha
            } else {
                temp.push(c);
            }
            System.out.println(temp);
        }

        // reverte a ordem dos elementos na nova pilha e armazena na pilha original
        while (!temp.isEmpty()) {
            pilha.push(temp.pop());
        }
        System.out.println(pilha);
    }
}
