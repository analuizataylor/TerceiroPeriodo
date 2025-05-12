package exerciciosLSEInt;

import java.util.Scanner;
import entidades.NoInt;
import entidades.LSEInteiro;

public class SomarParDaLSE {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LSEInteiro lista = new LSEInteiro();
        int total;

        preenche(lista);
        System.out.println("Lista: " + lista);
        total = somaPar (lista);
        System.out.println("A soma de todos os pares é: "+ total);

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

    public static int somaPar(LSEInteiro lista) {
        int total = 0;
        NoInt aux = lista.getPrim().getProx();

        while (aux != null){
            if (aux.getElemento() % 2 == 0) {
                total += aux.getElemento();
            }
            aux = aux.getProx();
        }
        return total;
    }
}