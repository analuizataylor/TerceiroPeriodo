package exercicioemgrupo;
import java.util.Scanner;

public class LCInteiroMain {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	// SOLICITA TAMANHO DA LISTA 1
	System.out.print("Digite o tamanho da primeira lista (L1): ");
	int tamanhoL1 = scanner.nextInt();
	// INSTANCIA LISTA 1
	LCInteiro L1 = new LCInteiro(tamanhoL1);
	
	// SOLICITA TAMANHO DA LISTA 2
	System.out.print("Digite o tamanho da segunda lista (L2): ");
    int tamanhoL2 = scanner.nextInt();
    // INSTANCIA L2
    LCInteiro L2 = new LCInteiro(tamanhoL2);
    
    // ADICIONA ELEMENTOS DA L1
    for (int i = 0; i < tamanhoL1; i++) {
    	System.out.println("Insira o elemento " + (i+1) + " da L1: ");
    	int elemento = scanner.nextInt();
    	L1.insereFinal(elemento);
    }
    
    // ADICIONA ELEMENTOS DA L2
    for (int i = 0; i < tamanhoL2; i++) {
    	System.out.println("Insira o elemento " + (i+1) + " da L2: ");
    	int elemento = scanner.nextInt();
    	L2.insereFinal(elemento);
    }
	
    // IMPRIME AS LISTAS
    System.out.println("Lista 1: " + L1);
    System.out.println("Lista 2: " + L2);
    
    // VERIFICA SE SAO IGUAIS
    if (L1.igual(L2) ) {
    	System.out.println("As listas L1 e L2 são iguais");
    } else {
    	System.out.println("As listas L1 e L2 são diferentes");
    }
    
	// VERIFICA SE L1 ESTA CONTIDA EM L2
    if (L1.estaContida(L2) ) {
    	System.out.println("L1 está contida em L2.");
    } else {
        System.out.println("L1 NÃO está contida em L2.");
    }
    
    // CONCATENA L1 E L2 EM L3
    LCInteiro L3 = L1.concatena(L2);
    System.out.println("Lista L3 (concatenação de L1 e L2): " + L3);

    scanner.close();
    
	}
}
