/* Faça um algoritmo para preencher
dois vetores com 5 números inteiros,
preencher um terceiro vetor com a
soma dos dois primeiros e mostrar na
tela os dois vetores de entrada e o vetor
soma */

import java.util.Scanner;

public class VetorSomaDeVetores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vetor1[] = new int[5]; // instancia vetor 1
		int vetor2[] = new int[5]; // instancia vetor 2
		int vetorsoma[] = new int[5]; // instancia vetor soma
		
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println("Digite um valor para o vetor 1: ");
			vetor1[i] = entrada.nextInt(); // adiciona elementos no vetor 1
		}
		
		for (int i = 0; i < vetor2.length; i++) {
			System.out.println("Digite um valor para o vetor 2: ");
			vetor2[i] = entrada.nextInt(); // adiciona elementos no vetor 1
		}
		
		for (int i = 0; i < vetor1.length; i++) {
            vetorsoma[i] = vetor1[i] + vetor2[i]; // soma de elementos no vetor soma
        }

        // Exibe os vetores
        System.out.print("Elementos do vetor 1: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + " ");
        }
        System.out.println(); // nova linha para separar a exibição do próximo vetor
        
        System.out.print("Elementos do vetor 2: ");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.println(); // nova linha para separar a exibição do próximo vetor
        
        System.out.print("Elementos do vetor soma: ");
        for (int i = 0; i < vetorsoma.length; i++) {
            System.out.print(vetorsoma[i] + " ");
        }
	}
}