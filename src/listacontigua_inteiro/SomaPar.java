package listacontigua_inteiro;

public class SomaPar {
    public static int somaPar(LCInteiro lista) {
        int total = 0;

        for (int i = 0; i < lista.getQuant(); i++) {
            if (lista.get(i)%2 == 0) {
                total += lista.get(i);
            }
        }
        return total;
    }

}



/*
MAIN
public static void main(String[] args) {
		LCInteiro lista = new LCInteiro();
		int total;

		MaiorDaLista.preenche(lista);
		System.out.println(lista);
		total = somaPar (lista);
		System.out.println("A SOMA DE TODOS OS PARES = "+ total);

	}
 */