package exerciciosLSEInt;

import java.util.Scanner;
import entidades.NoInt;
import entidades.LSEInteiro;

public class MostrarElementosIguais {

    /*
    * -> preencher duas listas de inteiros
    * -> criar uma terceira lista
    * -> armazenar na l3 apenas elementos que aparecem nas duas listas
    * -> imprimir as tres listas
    */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LSEInteiro lista1 = new LSEInteiro();
        LSEInteiro lista2 = new LSEInteiro();
        LSEInteiro lista3;

        preenche(lista1);
        preenche(lista2);
        lista3 = iguais(lista1, lista2);
        System.out.println("LISTA 1:    " + lista1);
        System.out.println("LISTA 2:    " + lista2);
        System.out.println("LISTA 3:    " + lista3);

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

    public static LSEInteiro iguais(LSEInteiro lista1, LSEInteiro lista2) {
        LSEInteiro lista3 = new LSEInteiro();
        NoInt auxL1 = lista1.getPrim();
        NoInt auxL2;

        while (auxL1 != null) {
            auxL2 = lista2.getPrim();

            while (auxL2 != null) {
                if (auxL1.getElemento() == auxL2.getElemento()
                        && lista3.pesquisa(auxL1.getElemento()) == null) {
                    lista3.insereFinal(auxL1.getElemento());
                }
                auxL2 = auxL2.getProx();
            }
            auxL1 = auxL1.getProx();
        }
        return lista3;
    }
}
