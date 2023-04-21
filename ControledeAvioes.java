import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ControledeAvioes {
    public static void main(String[] args) {
        int opcao = 1;
        Scanner input = new Scanner(System.in);
        Stack<String> avioes = new Stack<>();
        Stack<String> caracter = new Stack<>();

        while (opcao != 0) {
            System.out.println("\n------MENU------");
            System.out.println("1- Listar o n�mero de avi�es aguardando na fila de decolagem.");
            System.out.println("2- Autorizar a decolagem do primeiro avi�o da fila.");
            System.out.println("3- Adicionar um avi�o � fila de espera.");
            System.out.println("4- Listar todos os avi�es na fila de espera.");
            System.out.println("5- Listar as caracter�sticas do primeiro avi�o da fila.");
            System.out.print("\nEscolha uma op��o ou digite 0 para sair: ");
            opcao = input.nextInt();

            input.nextLine();

            switch (opcao) {
                case 0:
                    System.out.println("\nEncerrando programa...\n");
                    break;

                case 1:
                    int aguardando = avioes.size();
                    System.out.println("\nExiste " + aguardando + " avi�o(oes) aguardando na fila de decolagem.");
                    break;

                case 2:
                    if (avioes.isEmpty()) {
                        System.out.println("\nN�o a avi�es na fila.");
                        break;
                    } else {
                        System.out.println("Est� autorizada a decolagem do avi�o: " + avioes.firstElement());
                        avioes.remove(0);
                    }
                    break;

                case 3:
                    int index = avioes.size() + 1;

                    System.out.print("Digite o avi�o que deseja adicionar � lista: ");
                    String addElemento = input.nextLine();
                    avioes.push(addElemento);
                    System.out.println("O avi�o " + addElemento + " foi adicionado a fila com o indentificador " + index);
                    index++;

                    System.out.print("Adicione uma caracter�stica ao avi�o " + addElemento + ": ");
                    String addCaracter = input.nextLine();
                    caracter.push(addCaracter);

                    break;

                case 4:
                    if (avioes.isEmpty()) {
                        System.out.println("\nN�o h� avi�es na fila.");
                    } else {
                        System.out.println("Avi�es na fila: ");
                        System.out.println(Arrays.toString(avioes.toArray()));
                    }
                    break;

                case 5:
                    if(caracter.isEmpty()){
                        System.out.println("N�o foi registrado nenhuma caracter�stica.");
                    }else{
                        System.out.println("Caracter�stica do primeiro avi�o da fila: " + caracter.firstElement());
                    }
                    break;
                
                default:
                    System.out.println("\nOp��o inv�lida. Por favor, escolha uma op��o v�lida.");
            }
        }input.close();
    }
}