package exerciciosPilhaInt;

import java.util.Scanner;
import entidades.PilhaInt;

/*
 * -> verificar se as duas pilhas sao iguais ou nao
 * -> imprimir elas da mesma forma que foram inseridas
 */

public class VerificarPilhasIguais {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		PilhaInt pilha1 = new PilhaInt();
		PilhaInt pilha2 = new PilhaInt();
		boolean igual = false;

		preencher1(pilha1);
		preencher2(pilha2);
		igual = igualdade(pilha1, pilha2);
		System.out.println("Pilha 1: " + pilha1);
		System.out.println("Pilha 2: " + pilha2);
		if (igual == true) {
			System.out.println("As pilhas são iguais");
		} else {
			System.out.println("As pilhas são diferentes");
		}

	}

	public static void preencher1(PilhaInt pilha1) {
		int quant, num;

		System.out.println("Insira a quantidade de elementos da pilha: ");
		quant = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < quant; i++) {
			System.out.println("Insira o elemento " + (i+1) + ": ");
			num = scanner.nextInt();
			scanner.nextLine();
			pilha1.push(num);
		}
	}

	public static void preencher2(PilhaInt pilha2) {
		int quant, num;

		System.out.println("Insira a quantidade de elementos da pilha: ");
		quant = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < quant; i++) {
			System.out.println("Insira o elemento " + (i+1) + ": ");
			num = scanner.nextInt();
			scanner.nextLine();
			pilha2.push(num);
		}
	}

	public static boolean igualdade(PilhaInt pilha1, PilhaInt pilha2) {
		PilhaInt aux1 = new PilhaInt();
		PilhaInt aux2 = new PilhaInt();
		int num1, num2;
		boolean igual = true;

		if (pilha1.size() != pilha2.size()) {
			return false;
		}

		if (pilha1.isEmpty() && pilha2.isEmpty()) {
			return true;
		}

		while (!pilha1.isEmpty() && igual) {
			if (pilha1.top().getElemento() != pilha2.top().getElemento()) {
				igual = false;
			} else {
				num1 = pilha1.pop().getElemento();
				aux1.push(num1);
				num2 = pilha2.pop().getElemento();
				aux2.push(num2);
			}
		}
		while (!aux1.isEmpty()) {
			num1 = aux1.pop().getElemento();
			pilha1.push(num1);;
			num2 = aux2.pop().getElemento();
			pilha2.push(num2);
		}
		return igual;
	}
}
