package exerciciosLSEInt;

import java.util.Scanner;
import entidades.NoInt;
import entidades.LSEInteiro;

public class RemoverElementosLSE {

    /*
    * -> Ler numeros inteiros e armazenar
    * -> Retirar os elementos maiores que 10
    */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LSEInteiro lista = new LSEInteiro();

        preencher(lista);
        System.out.println("Lista inicial: " + lista);
        remover(lista);
        System.out.println("Lista depois de remover elementos igual ou maiores que dez: " + lista);
    }

    public static void preencher(LSEInteiro lista) {
        int quant, num;

        System.out.println("Insira a quantidade de elementos da lista: ");
        quant = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quant; i++) {
            System.out.println("Insira o elemento " + (i+1) + ": ");
            num = scanner.nextInt();
            scanner.nextLine();
            lista.insereInicio(num);
        }
    }

    public static void remover(LSEInteiro lista) {
        NoInt aux = lista.getPrim();

        while (aux != null) {
            int atual = aux.getElemento(); // guarda o elemento do aux
            aux = aux.getProx(); // avanca antes de remover para noa perder a referencia
            if (atual >= 10) {
                lista.remove(atual);
            }
        }
    }
}
