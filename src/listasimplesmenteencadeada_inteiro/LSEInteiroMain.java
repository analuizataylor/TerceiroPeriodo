package listasimplesmenteencadeada_inteiro;
import java.util.Scanner;

public class LSEInteiroMain {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;
        LSEInteiro lista = new LSEInteiro();

        do {
            System.out.print("\nDigite uma opcao:\n"+
                    "1 - Inserir elemento\n"+
                    "2 - Pesquisar elemento\n"+
                    "3 - Alterar elemento\n"+
                    "4 - Remover último\n"+
                    "5 - Remover elemento específico\n"+
                    "6 - Imprimir lista\n"+
                    "7 - Sair\n"+
                    "Opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    inserir(lista);
                    break;
                case 2:
                    pesquisar(lista);
                    break;
                case 3:
                    alterar(lista);
                    break;
                case 4:
                    removerUltimo(lista);
                    break;
                case 5:
                    remover(lista);
                    break;
                case 6:
                    System.out.println("\nLista completa: " + lista.toString());
                    break;
                case 7:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("OPCAO INVALIDA");
            }

        } while (opcao != 7);
    }

    public static void inserir(LSEInteiro lista) {
        System.out.println("\nInserir elemento:");
        System.out.println("1 - No início");
        System.out.println("2 - No final");
        System.out.println("3 - Em posição específica");
        System.out.print("Escolha: ");
        int tipoInsercao = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o valor inteiro a ser inserido: ");
        int valor = scanner.nextInt();
        scanner.nextLine();

        boolean sucesso = false;

        switch(tipoInsercao) {
            case 1:
                lista.insereInicio(valor);
                sucesso = true;
                break;
            case 2:
                lista.insereFinal(valor);
                sucesso = true;
                break;
            case 3:
                System.out.print("Digite a posição: ");
                int pos = scanner.nextInt();
                scanner.nextLine();
                sucesso = lista.insere(valor, pos);
                break;
            default:
                System.out.println("Opção inválida");
        }

        if (sucesso) {
            System.out.println("Elemento " + valor + " inserido com sucesso!");
        } else {
            System.out.println("Falha ao inserir elemento. Posição inválida.");
        }
    }

    private static void pesquisar(LSEInteiro lista) {
        System.out.print("\nDigite o valor a ser pesquisado: ");
        int valor = scanner.nextInt();
        scanner.nextLine();

        NoInt no = lista.pesquisa(valor);
        if (no == null) {
            System.out.println("Valor " + valor + " não encontrado na lista.");
        } else {
            System.out.println("Valor encontrado: " + no.toString());
        }
    }

    private static void alterar(LSEInteiro lista) {
        System.out.print("\nDigite a posição do elemento a ser alterado: ");
        int pos = scanner.nextInt();
        scanner.nextLine();

        NoInt no = lista.get(pos);
        if (no == null) {
            System.out.println("Posição inválida.");
        } else {
            System.out.println("Valor atual: " + no.getElemento());
            System.out.print("Digite o novo valor: ");
            int novoValor = scanner.nextInt();
            scanner.nextLine();
            no.setElemento(novoValor);
            System.out.println("Valor alterado com sucesso.");
        }
    }

    private static void removerUltimo(LSEInteiro lista) {
        NoInt removido = lista.removeFinal();
        if (removido == null) {
            System.out.println("Lista vazia. Nada para remover.");
        } else {
            System.out.println("Último elemento removido: " + removido.getElemento());
        }
    }

    private static void remover(LSEInteiro lista) {
        System.out.println("\nRemover elemento:");
        System.out.println("1 - Por valor");
        System.out.println("2 - Por posição");
        System.out.print("Escolha: ");
        int tipoRemocao = scanner.nextInt();
        scanner.nextLine();

        NoInt removido = null;

        switch(tipoRemocao) {
            case 1:
                System.out.print("Digite o valor a ser removido: ");
                int valor = scanner.nextInt();
                scanner.nextLine();
                removido = lista.remove(valor);
                break;
            case 2:
                System.out.print("Digite a posição:");
                int pos = scanner.nextInt();
                scanner.nextLine();
                removido = lista.removePos(pos);
                break;
            default:
                System.out.println("Opção inválida");
        }

        if (removido == null) {
            System.out.println("Elemento não encontrado ou posição inválida.");
        } else {
            System.out.println("Elemento removido: " + removido.getElemento());
        }
    }
}