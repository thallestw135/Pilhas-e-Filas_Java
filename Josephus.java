import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Josephus {
    public static void josephus(int n, int k) {
        List<Pessoa> pessoas = new ArrayList<>();
     
        for (int i = 1; i <= n; i++) {
            pessoas.add(new Pessoa("Nome" + i, "Telefone" + i, "Endereço" + i, "CPF" + i));
        }

        int index = 0; //2, 4, 6
        while (pessoas.size() > 1) {
            index = (index + k - 1) % pessoas.size();
            Pessoa pessoaEliminada = pessoas.remove(index);
            
            System.out.println("Eliminado: " + pessoaEliminada.getNome() + ", " + pessoaEliminada.getTelefone() + ", " + pessoaEliminada.getEndereco() + ", " + pessoaEliminada.getCpf());
        }

        Pessoa sobrevivente = pessoas.get(0);
        System.out.println("Sobrevivente: " + sobrevivente.getNome() + ", " + sobrevivente.getTelefone() + ", " + sobrevivente.getEndereco() + ", " + sobrevivente.getCpf());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas tem: ");
        int n = input.nextInt();
        int k = 3;
        josephus(n, k);

        input.close();
    }
}
/*


{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}


*/