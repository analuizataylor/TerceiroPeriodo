package listacontigua_item;

public class LCItem {

    // lista array de itens
    private Item[] lista;
    // quantidade de elementos na lista
    private int quantidade;

    // construtor vazio que deve instanciar o vetor com tamanho 10
    public LCItem() {
        this.lista = new Item[10];
        this.quantidade = 0;
    }

    // construtor que recebe o tamanho do vetor e instancia
    public LCItem(int tamanho) {
        this.lista = new Item[tamanho];
        this.quantidade = 0;
    }

    // tamanho() => retorna o tamanho do vetor.
    public int tamanho() {
        return this.lista.length;
    }

    // getquantidade() => retorna a quantidade de elementos da lista.
    public int getQuantidade() {
        return this.quantidade;
    }

    // eVazia() => retorna verdadeiro se a lista estiver vazia e falso caso contrário.
    public boolean eVazia() {
        return this.quantidade == 0;
    }

    // eCheia() => retorna verdadeiro se a lista estiver cheia e falso caso contrário.
    public boolean eCheia() {
        return this.quantidade == this.lista.length;
    }

    // getItem (posicao) => retorna o elemento que esta na posicao paramentro
    public Item getItem(int posicao) {
        if (posicao >= 0 && posicao < tamanho()) {
            return this.lista[posicao];
        }
        // retorna null caso false
        return null;
    }

    // pesquisa => qual a posicao do elemento
    public int pesquisa(int codigo) {
        // for para passear na lista
        for (int i = 0; i < this.quantidade; i++) {
            // se o codigo informado esta na posicao, entao retorna a posicao
            if (codigo == this.lista[i].getCodigo()) {
                return i;// achou o codigo e retorna sua posicao
            }
        }
        return -1; // terminou o for e nao achou
    }

    /*
     * insereFim (Item) => insere um Item no final da lista. Se ela estiver cheia,
     * deve aumentar o tamanho em 50%.
     */

    // insereFim (Item) => insere um Item no final da lista, se estiver cheia aumenta 50%
    public void insereFim(Item item) {
        if (eCheia()) {
            // metodo abaixo
            aumenta();
        } else {
            this.lista[this.quantidade] = item;
            this.quantidade++;
        }
    }

    // aumenta 50% da lista
    private void aumenta() {
        Item[] novo = new Item[(int) (this.lista.length * 1.5)];// casting
        for (int i = 0; i < this.quantidade; i++) {
            novo[i] = this.lista[i];
        }
        this.lista = novo;
    }

    // insere (Item, posicao) => insere um item em uma posicao da lista
    // fazendo todos os outros elementos deslocarem para o prox indice
    // se estiver cheia, aumenta 50%
    // se posicao for invalida retorna false
    public boolean insere(Item item, int posicao) {

        // condicao que nao eh valida
        if (posicao < 0 || posicao > this.quantidade) {
            return false;
        }
        // condicao se lista estiver cheia
        if (eCheia()) {
            aumenta();
        }

        // deslocar os itens da lista uma posicao para frente ate a posicao
        for (int i = this.quantidade - 1; i >= posicao; i--) {
            this.lista[i + 1] = this.lista[i];
        }
        // adiciona elemento
        this.lista[posicao] = item;
        this.quantidade++;
        return true;
    }

    // insere (Item) => no inicio da lista, ou seja, index = 0
    public void insereInicio(Item item) {
        insere(item, 0);
    }

    // removePosicao (posicao) => deve remover um elemento que esta na posicao informada
    // se conseguir, deve retornar item removido
    // se nao, retorna null
    public Item removePosicao(int posicao) {
        Item aux;

        // invalida
        if (posicao < 0 || posicao >= quantidade) {
            return null;
        }

        // utiliza o auxiliar
        aux = this.lista[posicao];
        for (int i = posicao; i < quantidade - 1; i++) {
            this.lista[i] = this.lista[i + 1];
        }

        // remove elemento
        this.lista[quantidade - 1] = null;
        this.quantidade--;
        return aux;
    }

    // remove com base no codigo informado
    public Item remove(int codigo) {
        Item aux;
        // se a posicao eh igual o codigo
        int posicao = this.pesquisa(codigo);
        // remove
        aux = removePosicao(posicao);
        return aux;
    }

    // toString retorna a lista
    public String toString() {
        String aux = "";
        for (int i = 0; i < this.quantidade; i++) {
            aux += this.lista[i].toString() + "\n";
        }
        return aux;
    }
}
