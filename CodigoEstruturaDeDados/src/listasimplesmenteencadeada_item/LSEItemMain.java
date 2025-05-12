package listasimplesmenteencadeada_item;
import java.util.Scanner;

public class LSEItemMain {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;
        LSEItem lista = new LSEItem();

        do {
            System.out.print("Digite uma opcao\n"+
                    "1 - Cadastrar\n"+
                    "2 - Pesquisar\n"+
                    "3 - Alterar nome\n"+
                    "4 - Remover ultimo\n"+
                    "5 - Remover Item\n"+
                    "6 - Imprimir\n "+
                    "7 - Terminar");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrar (lista);
                    break;
                case 2:
                    pesquisar (lista);
                    break;
                case 3:
                    alterar (lista);
                    break;
                case 4:
                    removerUltimo(lista);
                    break;
                case 5:
                    remover (lista);
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

    }

    public static void cadastrar(LSEItem lista) {
        /*
         * 1 - pedir a posicao, o nome e o codigo
         * 2 - Instanciar um Item (com nome e codigo)
         * 3 - Chamar o metodo inserir da classe LSEItem
         */

        System.out.println("Insira uma posicao: ");
        int pos = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insira o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Insira o codigo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        Item item = new Item(codigo, nome);
        boolean ok = lista.insere(item, pos);
        if (!ok) {
            System.out.println("Posicao invalida. Nao pode cadastrar");
        } else {
            System.out.println("CADASTRO EFETUADO COM SUCESSO");
        }
    }

    private static void pesquisar(LSEItem lista) {
        /*
         * 1 - pedir o codigo
         * 2 - chamar o metodo pesquisar da classe LSEItem
         * 3 - imprimir o resultado na tela
         */
        System.out.println("Entre com o codigo:");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        NoItem no = lista.pesquisa(codigo);
        if (no == null) {
            System.out.println(codigo + " nao existe");
        } else {
            System.out.println(no.getItem().toString());
        }
    }


    private static void alterar(LSEItem lista) {
        /*
         * 1 - pedir o codigo
         * 2 - chamar o metodo pesquisa
         * 3 - acessar o elemento da posicao pesquisada e modificar seu nome
         *     ou mostrar mensagem se o elemento não existir
         */
            System.out.println("Insira o codigo:");
            int codigo = scanner.nextInt();
            scanner.nextLine();

            NoItem no = lista.pesquisa(codigo);
            if (no == null) {
                System.out.println(codigo + " nao existe");
            } else {
                Item item = no.getItem();
                System.out.println(item.toString());

                System.out.println("Insira o novo nome:");
                String novoNome = scanner.nextLine();
                item.setNome(novoNome);
            }
        }

    private static void removerUltimo(LSEItem lista) {
        /*
         * 1 - chamar o remover na posicao getQuant-1
         * 2 - mostrar na tela msg de erro ou o elemento removido
         */

        Integer removido = lista.removePos(lista.tamanho() - 1);
        if (removido == null) {
            System.out.println("nao foi possivel remover");
        } else {
            System.out.println("Item " + removido + "   removido com sucesso");
        }
    }

    private static void remover(LSEItem lista) {
        /*
         * 1 - pedir o codigo
         * 2 - chamar o remover pelo codigo
         * 3 - mostrar na tela msg de erro ou o elemento removido
         */
        System.out.println("Digite o codigo:");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        Integer removido = lista.remove(codigo);
        if (removido == null) {
            System.out.println("Item nao existe. Nao foi removido");
        } else {
            System.out.println("Item " + removido + "   removido com sucesso");
        }
    }
}