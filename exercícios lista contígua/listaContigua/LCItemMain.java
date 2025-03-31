package listaContigua;

import entidades.*;
import java.util.Scanner;

public class LCItemMain {

    public static void main(String[] args) {

        int opcao;
        LCItem lista = new LCItem();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite uma opcao\n" +
                    "1 - Cadastrar\n" +
                    "2 - Pesquisar\n" +
                    "3 - Alterar nome\n" +
                    "4 - Remover ultimo\n" +
                    "5 - Remover Item\n" +
                    "6 - Imprimir\n" +
                    "7 - Terminar");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrar(lista, scanner);
                    break;
                case 2:
                    pesquisar(lista, scanner);
                    break;
                case 3:
                    alterar(lista, scanner);
                    break;
                case 4:
                    removerUltimo(lista);
                    break;
                case 5:
                    remover(lista, scanner);
                    break;
                case 6:
                    System.out.println(lista.toString());
                    break;
                case 7:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("OPCAO INVALIDA");
            }

        } while (opcao != 7);
        scanner.close();
    }

    public static void cadastrar(LCItem lista, Scanner scanner) {
        /*
         * 1 - pedir a posicao, o nome e o codigo
         * 2 - Instanciar um Item (com nome e codigo)
         * 3 - Chamar o metodo inserir da classe LCItem
         */

        System.out.print("Insira a posicao: ");
        int posicao = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Insira o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Insira o codigo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        // cria o novo item
        Item item = new Item(codigo, nome);

        // chama o metodo no modelo lista.metodo
        boolean ok = lista.insere(item, posicao);

        // verifica se deu certo
        if (!ok) { // (ok == false) ou (ok != true)
            System.out.println("posicao invalida. Nao pode cadastrar");
        } else {
            System.out.println("CADASTRO EFETUADO COM SUCESSO");
        }
    }

    private static void pesquisar(LCItem lista, Scanner scanner) {
        /*
         * 1 - pedir o codigo
         * 2 - chamar o metodo pesquisar da classe LCItem
         * 3 - imprimir o resultado na tela
         */

        System.out.print("Insira o codigo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        // chama o metodo pesquisa com base no parametro
        int posicao = lista.pesquisa(codigo);

        // verifica se eh valido
        if (posicao < 0) {
            System.out.println(codigo + " nao existe");
        } else {
            // imprime com o tostring
            System.out.println(lista.getItem(posicao).toString());
        }
    }

    private static void alterar(LCItem lista, Scanner scanner) {
        /*
         * 1 - pedir o codigo
         * 2 - chamar o metodo pesquisa
         * 3 - acessar o elemento da posicao pesquisada e modificar seu nome
         * ou mostrar mensagem se o elemento nao existir
         */

        String novoNome;
        System.out.print("Insira o codigo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        // chama o metodo pesquisa com base no parametro
        int posicao = lista.pesquisa(codigo);
        Item item;

        // verifica se eh valido
        if (posicao < 0) {
            System.out.println(codigo + " nao existe");
        } else {

            // pega o item da posicao
            item = lista.getItem(posicao);

            // retorna tostring
            System.out.println(item.toString());

            // altera os dados
            System.out.print("Insira o novo nome: ");
            novoNome = scanner.nextLine();

            // seta a nova informacao
            item.setNome(novoNome);
        }
    }

    private static void removerUltimo(LCItem lista) {
        /*
         * 1 - chamar o remover na posicao getQuant-1
         * 2 - mostrar na tela msg de erro ou o elemento removido
         */

        // chama o removeposicao quanto getQuant-1 para remover o ultimo
        Item item = lista.removePosicao(lista.getQuantidade() - 1);

        // verifica se eh valido
        if (item == null) {
            System.out.println("nao foi possivel remover");
        } else {
            System.out.println("Item " + item.toString() +
                    " removido com sucesso");
        }
    }

    private static void remover(LCItem lista, Scanner scanner) {
        /*
         * 1 - pedir o codigo
         * 2 - chamar o remover pelo codigo
         * 3 - mostrar na tela msg de erro ou o elemento removido
         */

        System.out.print("Insira o codigo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        // chama o remover com base no parametro codigo
        Item item = lista.remove(codigo);

        // verifica se eh valido
        if (item == null) {
            System.out.println("Item nao existe. Nao foi removido");
        } else {
            System.out.println("Item " + item.toString() +
                    " removido com sucesso");
        }
    }
}