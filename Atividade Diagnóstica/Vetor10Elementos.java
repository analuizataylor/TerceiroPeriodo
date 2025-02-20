/* Faça um algoritmo para preencher
um vetor de 10 números inteiros e
mostrá-los na tela */

import java.util.Scanner;

public class Vetor10Elementos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // entrada de dados
        int vetor[] = new int[10]; // instancia vetor de 20 elementos

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = entrada.nextInt(); // adiciona elemento
        }

        for (int i = 0; i < vetor.length; i++) {
        	System.out.print(vetor[i]); // retorna elementos
        }
        entrada.close();
    }
    

}