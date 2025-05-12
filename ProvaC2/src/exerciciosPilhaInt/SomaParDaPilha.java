package exerciciosPilhaInt;

import java.util.Scanner;
import entidades.NoInt;
import entidades.PilhaInt;


public class SomaParDaPilha {

    /*
    * -> preencher uma lista de inteiros
    * -> imprimir lista
    * -> imprimir soma dos elementos pares da lista
    */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PilhaInt pilha = new PilhaInt();
        int total;

        preenche(pilha);
        System.out.println("Pilha: " + pilha);
        total = somapares(pilha);
        System.out.println("A sona dos pares é: " + total);
    }

    public static void preenche(PilhaInt pilha) {
        int quant, num;

        System.out.println("Insira a quantidade de elementos da pilha: ");
        quant = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quant; i++) {
            System.out.println("Insira o elemento " + (i+1) + ": ");
            num = scanner.nextInt();
            scanner.nextLine();
            pilha.push(num);
        }
    }

    public static int somapares(PilhaInt pilha) {
        int total = 0;
        NoInt aux = pilha.top().getProx();

        while (aux != null) {
            if (aux.getElemento() % 2 == 0) {
                total += aux.getElemento();
            }
            aux = aux.getProx();
        }
        return total;
    }
}
