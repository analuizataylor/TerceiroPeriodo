package provateste;

import entidades.*;
import java.util.Scanner;

public class ExercicioProva {
	
	/*
	 * -> preenche uma pilha1
	 * -> instancia uma pilha2
	 * -> instancia uma fila
	 * 
	 * -> pares da pilha1 sao colocados na fila
	 * -> impares da pilha1 sao colocados na pilha2
	 */
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main (String[] args) {
		PilhaInt pilha1 = new PilhaInt();
		PilhaInt pilha2 = new PilhaInt();
		FilaInt fila = new FilaInt();
		
		preencher(pilha1);
		
		System.out.println("Pilha de entrada: " + pilha1);
		divide(pilha1, pilha2, fila);
		
		System.out.println("Pilha1: " + pilha1);
		System.out.println("Fila: " + fila);
		System.out.println("Pilha2: " + pilha2);
		
	}

	public static void preencher(PilhaInt pilha1) {
		int quant, num;
		
		System.out.println("Insira o número de elementos da pilha1: ");
		quant = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < quant; i ++) {
			System.out.println("Insira o elemento " + (i+1) + ": ");
			num = scanner.nextInt();
			pilha1.push(num);
		}
	}
	
	public static void divide (PilhaInt pilha1, PilhaInt pilha2, FilaInt fila) {
		PilhaInt pilha2auxiliar = new PilhaInt();
		
		while (! pilha1.isEmpty()) {
			if (pilha1.top().getElemento() % 2 == 0) {
				fila.enqueue(pilha1.pop().getElemento());
			} else {
				pilha2auxiliar.push(pilha1.pop().getElemento());
			}
		}
		
		while (! pilha2auxiliar.isEmpty()) {
			pilha2.push(pilha2auxiliar.pop().getElemento());
		}
	}

}
