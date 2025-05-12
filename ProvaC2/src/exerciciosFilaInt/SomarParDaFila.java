package exerciciosFilaInt;

import java.util.Scanner;
import entidades.NoInt;
import entidades.FilaInt;

public class SomarParDaFila {

    /*
    * -> preencher uma lista de inteiros
    * -> imprimir lista
    * -> imprimir soma dos elementos pares da lista
    */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FilaInt fila = new FilaInt();
        int total;

        preenche(fila);
        System.out.println("Fila: " + fila);
        total = somapares(fila);
        System.out.println("A soma dos pares é: " + total);
    }

    public static int somapares(FilaInt fila) {
        int total = 0;
       NoInt aux = fila.peek();

       while (aux != null) {
           if (aux.getElemento() % 2 == 0) {
               total += aux.getElemento();
           }
           aux = aux.getProx();
       }
       return total;
    }


    public static void preenche(FilaInt fila) {
        int quant, num;

        System.out.println("Insira a quantidade de elementos: ");
        quant = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quant; i++) {
            System.out.println("Insira o elemento " + (i+1) + ": ");
            num = scanner.nextInt();
            scanner.nextLine();
            fila.enqueue(num);
        }

    }
}
