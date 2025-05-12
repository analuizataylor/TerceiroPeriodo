package diagnostica;
import java.util.Scanner;

public class Biblioteca {

	public static Scanner entrada = new Scanner(System.in);
	
	// PROCEDIMENTO pois apenas realiza
	public static void inserirElementosVetor(int[] vetor) {  //ome da classe + (tipo do vetor + apelido do vetor)
		
		// percorre a memoria do vetor
		for (int i=0; i < vetor.length; i++) {   
			System.out.println("Digite um número inteiro para inserir no vetor: ");
			vetor[i] = entrada.nextInt();
		}
	}
	

	// PROCEDIMENTO pois apenas exibe
	public static void imprimirElementosVetor(int[] vetor) {
		for (int i=0; i < vetor.length; i++){
			System.out.print(vetor[i] + " | ");
		}
		System.out.println();
	}


	// FUNCAO pois retorna um novo valor produzido
	public static int[] somarVetores(int[] vetor1, int[] vetor2) {

        // instancia um vetor de tamanho com base no tamanho do vetor de soma
        int[] vetorSoma = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }
        return vetorSoma;

    }
}