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
            System.out.println("1- Listar o número de aviões aguardando na fila de decolagem.");
            System.out.println("2- Autorizar a decolagem do primeiro avião da fila.");
            System.out.println("3- Adicionar um avião à fila de espera.");
            System.out.println("4- Listar todos os aviões na fila de espera.");
            System.out.println("5- Listar as características do primeiro avião da fila.");
            System.out.print("\nEscolha uma opção ou digite 0 para sair: ");
            opcao = input.nextInt();

            input.nextLine();

            switch (opcao) {
                case 0:
                    System.out.println("\nEncerrando programa...\n");
                    break;

                case 1:
                    int aguardando = avioes.size();
                    System.out.println("\nExiste " + aguardando + " avião(oes) aguardando na fila de decolagem.");
                    break;

                case 2:
                    if (avioes.isEmpty()) {
                        System.out.println("\nNão a aviões na fila.");
                        break;
                    } else {
                        System.out.println("Está autorizada a decolagem do avião: " + avioes.firstElement());
                        avioes.remove(0);
                    }
                    break;

                case 3:
                    int index = avioes.size() + 1;

                    System.out.print("Digite o avião que deseja adicionar à lista: ");
                    String addElemento = input.nextLine();
                    avioes.push(addElemento);
                    System.out.println("O avião " + addElemento + " foi adicionado a fila com o indentificador " + index);
                    index++;

                    System.out.print("Adicione uma característica ao avião " + addElemento + ": ");
                    String addCaracter = input.nextLine();
                    caracter.push(addCaracter);

                    break;

                case 4:
                    if (avioes.isEmpty()) {
                        System.out.println("\nNão há aviões na fila.");
                    } else {
                        System.out.println("Aviões na fila: ");
                        System.out.println(Arrays.toString(avioes.toArray()));
                    }
                    break;

                case 5:
                    if(caracter.isEmpty()){
                        System.out.println("Não foi registrado nenhuma característica.");
                    }else{
                        System.out.println("Característica do primeiro avião da fila: " + caracter.firstElement());
                    }
                    break;
                
                default:
                    System.out.println("\nOpção inválida. Por favor, escolha uma opção válida.");
            }
        }input.close();
    }
}