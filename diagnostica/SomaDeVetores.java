/* 
2) Faca um algoritmo para preencher dois vetores com 5 números inteiros,
preencher um terceiro vetor com a soma dos dois primeiros e mostrar na
tela os dois vetores de entrada e o vetor soma


- preencher 2 vetores [5]
- somar os dois vetores e preencher o outro
- mostrar na tela os 3 vetores
*/


package diagnostica;
import java.util.Scanner;
import biblioteca.Biblioteca;

public class SomaDeVetores {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {

		int[] vetor1 = new int[5];
		int[] vetor2 = new int[5];
		int[] vetorsoma = new int[5];
		
		Biblioteca.inserirElementosVetor(vetor1);
		Biblioteca.inserirElementosVetor(vetor2);
		
		vetorsoma = Biblioteca.somarVetores(vetor1, vetor2);
		
		System.out.println("Vetor 1: ");
		Biblioteca.imprimirElementosVetor(vetor1);
		System.out.println("Vetor 2: ");
		Biblioteca.imprimirElementosVetor(vetor2);
		System.out.println("Vetor Soma: ");
		Biblioteca.imprimirElementosVetor(vetorsoma);
	}
}