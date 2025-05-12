package listacontigua_inteiro;

import java.util.Scanner;

public class MaiorDaLista {
    static Scanner scanner = new Scanner (System.in);

    public static void preenche(LCInteiro lista) {
        int quant, num;

        System.out.println("Insira a quantidade de elementos da lista: ");
        quant = scanner.nextInt();

        for (int i = 0; i < quant; i++) {
            num = (int)(Math.random()*50)+1;
            lista.insereFinal(num);
        }
    }

    public static int maior(LCInteiro lista) {
        int maior = lista.get(0);

        for (int i = 1; i < lista.getQuant(); i++) {
            if (lista.get(i)>maior) {
                maior = lista.get(i);
            }
        }
        return maior;
    }
}

/*
MAIN

public static void main(String[] args) {
		LCInteiro lista = new LCInteiro();
		int maior;

		preenche(lista);
		maior = maior(lista);
		System.out.println("LISTA");
		System.out.println(lista);
		System.out.println("O maior elemento : "+maior);

	}
 */