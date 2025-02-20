import java.util.Scanner;

public class Vetor20Elementos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[20]; // instancia vetor de 20 posições
        int tamanho = 0; // controle de elementos

        // Preenche o vetor
        tamanho = MaisElementos(vetor, tamanho, entrada);

        // Exibe os elementos do vetor após todas as inserções
        MostrarElementosVetor(vetor, tamanho);
    }

    // Método para inserir mais elementos no vetor
    public static int MaisElementos(int[] vetor, int tamanho, Scanner entrada) {
        int resposta = 1; // 1 significa que o usuário quer continuar inserindo

        while (resposta == 1 && tamanho < vetor.length) {
            System.out.println("Digite um número para inserir no vetor: ");
            vetor[tamanho] = entrada.nextInt();
            tamanho++;

            if (tamanho < vetor.length) {
                // Pergunta ao usuário se ele deseja inserir outro elemento
                System.out.println("Deseja inserir outro elemento?");
                System.out.println("1 - SIM");
                System.out.println("2 - NÃO");
                resposta = entrada.nextInt();
            } else {
                System.out.println("Vetor cheio!");
                resposta = 2; // Não deseja inserir mais elementos
            }
        }

        return tamanho; // Retorna o tamanho atual do vetor
    }

    // Método para mostrar os elementos do vetor
    public static void MostrarElementosVetor(int[] vetor, int tamanho) {
        System.out.println("Elementos do vetor: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(); // Para dar um espaço após exibir todos os elementos
    }
}
