/*
3) Faça um programa em Java que:
	a) instancie um vetor de 20 posições.
	b) preencha o vetor: deve pedir ao usuário se quer inserir mais um. Deve parar de preencher se:
		• o vetor estiver cheio, nesse caso, deve mostrar uma mensagem na tela,
		• o usuário não quiser mais inserir.
	c) mostre na tela todos os elementos do vetor
	
- instancia vetor 20 elementos
- preencher vetor
- imprimir elementos do vetor
*/


package diagnostica;
import java.util.Scanner;

public class VetorVinteElementos {
	
	public static Scanner entrada = new Scanner(System.in);
	public static int contador = 0;
	
	public static void main (String[] args ) {
		
		int[] vetor = new int[20];
		
		inserirElementosVetorComPerguntas(vetor);
		Biblioteca.imprimirElementosVetor(vetor);
		
	}
	
	
	private static void inserirElementosVetorComPerguntas(int[] vetor) {
		char opcao;
		do {
			if (contador < vetor.length) {
				System.out.println("Digite um numero inteiro: ");
				vetor[contador] = entrada.nextInt();
				contador ++;
				
				System.out.println("Quer continuar preenchendo? <S> ou <N>: ");
				opcao = entrada.next().toUpperCase().charAt(0);
			} else {
				System.err.println("Vetor cheio.");
				opcao = 'N';
			}
		} while (opcao == 'S');
	}

}
