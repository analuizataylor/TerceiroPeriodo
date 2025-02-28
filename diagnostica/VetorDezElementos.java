/* 
1) Faca um algoritmo para preencher um vetor de 10 numeros inteiros e mostra-los na tela*/


package diagnostica;
import java.util.Scanner;
import biblioteca.Biblioteca;

public class VetorDezElementos {
	
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		
		Biblioteca.inserirElementosVetor(vetor);
		Biblioteca.imprimirElementosVetor(vetor);
		
	}
	

} 

