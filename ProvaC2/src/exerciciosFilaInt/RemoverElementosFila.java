package exerciciosFilaInt;

import java.util.Scanner;
import entidades.NoInt;
import entidades.FilaInt;

public class RemoverElementosFila {

    /*
     * -> Ler numeros inteiros e armazenar
     * -> Retirar os elementos maiores que 10
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FilaInt fila = new FilaInt();

        preencher(fila);
        System.out.println("Fila inicial: ");
        remover(fila);
        System.out.println("Fila depois remover elementos igual ou maiores que dez: " + fila);
    }

    public static void preencher(FilaInt fila) {
        int quant, num;

        System.out.println("Insira a quantidade de elementos da lista: ");
        quant = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quant; i++) {
            System.out.println("Insira o elemento " + (i+1) + ": ");
            num = scanner.nextInt();
            scanner.nextLine();
            fila.enqueue(num);
        }

    }

    public static void remover(FilaInt fila) {
        FilaInt aux = new FilaInt();

        while (!fila.isEmpty()) {
            int elemento = fila.dequeue(); // Remove do início da fila original

            if (elemento < 10) {
                aux.enqueue(elemento); // Insere na temp apenas se < 10
            }
        }

        while (!aux.isEmpty()) {
            fila.enqueue(aux.dequeue());
        }

    }


}
