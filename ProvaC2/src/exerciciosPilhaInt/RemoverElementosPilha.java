package exerciciosPilhaInt;

import java.util.Scanner;
import entidades.PilhaInt;
import entidades.NoInt;

public class RemoverElementosPilha {

    /*
    * -> Ler numeros inteiros e armazenar
    * -> Retirar os elementos maiores que 10
    */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PilhaInt pilha = new PilhaInt();

        preencher(pilha);
        System.out.println("Pilha inicial: " + pilha);
        remover(pilha);
        System.out.println("Pilha sem os elementos maiores ou iguais a dez: " + pilha);
    }

    public static void preencher(PilhaInt pilha) {
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

    public static void remover(PilhaInt pilha) {
        PilhaInt aux = new PilhaInt();
        NoInt no;

        while (!pilha.isEmpty()) {
            no = pilha.pop();

            if (no.getElemento() <= 10) {
                aux.push(no.getElemento());
            }
        }

        while (!aux.isEmpty()) {
            no = aux.pop();
            pilha.push(no.getElemento());
        }
    }
}
