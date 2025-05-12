package exerciciosPilhaInt;

import java.util.Scanner;
import entidades.PilhaInt;
import entidades.NoInt;

public class MaiorDaPilha {

    /*
     * -> receber uma lista de inteiros
     * -> encontrar o maior elemento
     * -> imprimir lista e maior elemento
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PilhaInt pilha = new PilhaInt();
        int maior;

        preenche(pilha);
        maior = maior(pilha);
        System.out.println("Pilha: " + pilha);
        System.out.println("O maior elemento da pilha é: " + maior);
    }

    public static void preenche(PilhaInt pilha) {
        int quant, num;

        System.out.println("Insira a quantidade de elementos da pilha: ");
        quant = scanner.nextInt();

        for (int i = 0; i < quant; i++) {
            System.out.println("Insira o elemento " + i + " :");
            num = scanner.nextInt();
            scanner.nextLine();
            pilha.push(num);
        }
    }

    public static int maior(PilhaInt pilha) {
        NoInt maior = pilha.top();
        NoInt aux = pilha.top().getProx();

        while (aux != null) {
            if (aux.getElemento() > maior.getElemento()) {
                maior = aux;
            }
            aux = aux.getProx();
        }
        return maior.getElemento();
    }

}
