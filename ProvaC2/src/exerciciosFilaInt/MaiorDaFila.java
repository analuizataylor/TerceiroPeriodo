package exerciciosFilaInt;

import java.util.Scanner;
import entidades.FilaInt;
import entidades.NoInt;

public class MaiorDaFila {

    /*
     * -> receber uma lista de inteiros
     * -> encontrar o maior elemento
     * -> imprimir lista e maior elemento
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        FilaInt fila = new FilaInt();
        int maior;

        preenche(fila);
        maior = maior(fila);
        System.out.println("Fila: " + fila);
        System.out.println("O maior elemento da fila é: "+maior);
    }


    public static void preenche(FilaInt fila) {
        int quant, num;

        System.out.println("Insira a quantidade de elementos da fila: ");
        quant = scanner.nextInt();

        for (int i = 0; i < quant; i++) {
            System.out.println("Insira o elemento " + i + " :");
            num = scanner.nextInt();
            scanner.nextLine();
            fila.enqueue(num);
        }

    }

    public static int maior(FilaInt fila) {
        NoInt maior = fila.peek();
        NoInt aux = fila.peek().getProx();

        while (aux != null) {
            if (aux.getElemento() > maior.getElemento()) {
                maior = aux;
            }
            aux = aux.getProx();
        }
        return maior.getElemento();
    }
}
