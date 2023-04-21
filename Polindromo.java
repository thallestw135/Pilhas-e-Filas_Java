import java.util.*;

public class Polindromo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String texto = input.nextLine();
        input.close();

        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                pilha.push(c);
            }
        }

        System.out.println("Texto em ordem inversa: ");
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());

        }
        System.out.println();

        boolean polindromo = true;
        int i = 0;
        int j = texto.length() - 1;

        while (i < j) {
            char c1 = texto.charAt(i);
            char c2 = texto.charAt(j);

            if (!Character.isLetterOrDigit(c1)) {
                i++;
            }

            if (!Character.isLetterOrDigit(c2)) {
                j--;
            }

            else if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                polindromo = false;
                break;
            } else {
                i++;
                j--;
            }
        }

        System.out.println(polindromo ? "O texto é um polindromo." : "O texto não é um polindromo.");

    }

}