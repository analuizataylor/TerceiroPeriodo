package exerciciosLSEInt;

import java.util.Scanner;
import entidades.NoInt;
import entidades.LSEInteiro;

public class MaiorDaListaLSE {

    /*
    * -> receber uma lista de inteiros
    * -> encontrar o maior elemento
    * -> imprimir lista e maior elemento
    */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LSEInteiro lista = new LSEInteiro();
        int maior;

        preenche(lista);
        maior = maior(lista);
        System.out.println("Lista: ");
        System.out.println(lista);
        System.out.println("O maior elemento da lista é: "+ maior);

    }

    public static void preenche(LSEInteiro lista) {
        int quant, num;

        System.out.println("Insira a quantidade de elementos da lista: ");
        quant = scanner.nextInt();

        for (int i = 0; i < quant; i++) {
            num = (int)(Math.random()*50)+1;
            lista.insereFinal(num);
        }
    }

    public static int maior(LSEInteiro lista) {
        NoInt maior = lista.getPrim();
        NoInt aux = lista.getPrim().getProx();

        while (aux != null){
            if (aux.getElemento() > maior.getElemento()) {
                maior = aux;
            }
            aux = aux.getProx();
        }
        return maior.getElemento();
    }
}
