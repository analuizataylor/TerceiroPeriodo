package listasimplesmenteencadeada_item;

public class LSEItem {
    // instancia o primeiro e o ultimo item
    private NoItem prim, ult;
    // instancia a quantidade de elementos
    private int quant;

    public LSEItem() {
        // instancia a lista vazia
        this.prim = null;
        this.ult = null;
        this.quant = 0;
    }

    public NoItem getPrim() {
        return prim;
    }

    public NoItem getUlt() {
        return ult;
    }

    public int tamanho() {
        return this.quant;
    }

    public boolean eVazia() {
        return (quant == 0);
    }

    public NoItem get(int pos) {
        NoItem aux;

        // verificar se a posicao e valida:
        // precisa ser maior que zero
        // precisa ser menor que a quantidade de elementos

        if (pos >= 0 && pos < quant) {

            if (pos == quant - 1) {
                return this.ult; // verifica se eh o ultimo elemento
            }

            aux = this.prim; // o auxiliar passa a ser o primeiro item

            for (int i = 0; i < pos; i++) {
                aux = aux.getProx(); // o auxiliar, a cada looping, passa a ser o proximo elemento
            }
            return aux; // retorna o item
        }
        return null; // se a posicao for invalida
    }

    public NoItem pesquisa(int cod) {
        NoItem aux;

        aux = this.prim; // instancia o auxiliar como primeiro item

        while (aux != null) { // enquanto nao for o ultimo item...


            if (aux.getItem().getCodigo() == cod) { // se o codigo do item pelo qual voce passou eh igual o codigo informado
                return aux; // retorna a pesquisa feita
            }
            aux = aux.getProx(); // caso contrario, continua no while para o proximo item
        }
        return aux; // se sair do looping, eh porque nao encontrou, entao esse retorno de aux vai ser null
    }

    public void insereInicio(Item item) {
        NoItem no = new NoItem(item); // cria um novo no com o item passado como parametro

        if (this.eVazia()) {
            this.ult = no; // se lista estiver vazia, o novo no sera o primeiro e o ultimo
        } else {
            no.setProx(this.prim); // o novo no aponta para o atual primeiro no
            // como ele sera o novo primeiro elemento, ele deve apontar para quem ja era o primeiro
        }
        this.prim = no; // atualiza o ponteiro prim para o novo no
        this.quant++; // incrementa a quantidade de elementos na lista
    }

    public void insereFinal(Item item) {
        NoItem no = new NoItem(item); // cria um novo no com o item passado como parametro

        if (this.eVazia()) {
            this.prim = no; // se lista estiver vazia, o novo no sera o primeiro e o ultimo
        } else {
            this.ult.setProx(no); // o antigo ultimo no aponta para o novo no
            // como sera o novo ultimo elemento, o atual ultimo deve apontar para ele


            // insereInicio: novo → prim
            // insereFinal: ult → novo
        }
        this.ult = no; // atualiza o ponteiro ult para o novo no
        this.quant++; // incrementa a quantidade de elementos na lista
    }

    public boolean insere(Item item, int pos) {
        NoItem no = new NoItem(item); // cria um novo no com o item passado
        NoItem aux;

        if (pos >= 0 && pos < this.quant) { // verifica se a posicao e valida (entre 0 e quant-1)
            if (pos == 0) {
                insereInicio(item); // se for na primeira posicao, chama o metodo de inserir no inicio
            } else if (pos == this.quant - 1) {
                insereFinal(item); // se for na ultima posicao, chama o metodo de inserir no final
            } else {
                aux = this.get(pos - 1); // pega o no anterior a posicao desejada
                no.setProx(aux.getProx()); // o novo no aponta para o proximo do anterior
                aux.setProx(no); // o anterior agora aponta para o novo no
                this.quant++; // incrementa a quantidade de elementos
            }
            return true; // insercao feita com sucesso
        }
        return false; // posicao invalida

    }

    public NoItem removeInicio() {
        NoItem noRemovido;
        if (this.eVazia()) {
            return null; // se a lista estiver vazia, nao ha o que remover
        }
        noRemovido = this.prim; // guarda o primeiro no para retornar depois
        this.prim = this.prim.getProx(); // atualiza o primeiro para o proximo
        this.quant--; // reduz a quantidade de elementos

        if (this.quant == 0) {
            this.ult = null; // se a lista ficou vazia, zera o ultimo tambem
        }

        return noRemovido; // retorna o no que foi removido
    }


    public NoItem removeFinal() {
        NoItem noRemovido, aux;

        if (this.eVazia()) {
            return null; // se a lista estiver vazia, nao ha o que remover
        }

        if (this.quant == 1) { // se houver apenas um elemento
            noRemovido = this.prim; // guarda o unico no
            this.prim = null; // zera o ponteiro do primeiro
            this.ult = null; // zera o ponteiro do ultimo
        } else {
            aux = this.get(quant - 2); // pega o penultimo no
            aux.setProx(null); // retira o ultimo no (penultimo aponta para null)
            noRemovido = this.ult; // guarda o ultimo no
            this.ult = aux; // atualiza o ultimo para o penultimo
        }

        this.quant--; // reduz a quantidade de elementos
        return noRemovido; // retorna o no removido
    }




    public Integer remove(int cod) {
        NoItem aux = this.prim;
        NoItem anterior = null;

        if (eVazia()) {
            return null;
        }

        while (aux != null) {

            if (aux.getItem().getCodigo() == cod) {
                if (aux == this.prim) {
                    removeInicio().getItem().getCodigo();
                    {
                    }
                    if (aux == this.ult) {
                        removeFinal().getItem().getCodigo();
                    } else {
                        anterior.setProx(aux.getProx());
                        this.quant--;
                        return cod;
                    }
                }
                anterior = aux;
                aux = aux.getProx();
            }
        }
        return null;
    }

    public Integer removePos ( int pos){
        NoItem noRemovido;
        NoItem noanterior = this.get(pos - 1);

        if (pos < 0 || pos >= this.quant) {
            return null;
        }

        if (pos == 0) {
            return removeInicio().getItem().getCodigo();
        }
        if (pos == this.quant - 1) {
            return removeFinal().getItem().getCodigo();

        } else {
            noRemovido = noanterior.getProx();
            noanterior.setProx(noRemovido.getProx());
            this.quant--;
        }

        return noRemovido.getItem().getCodigo();
    }


        public String toString () {
            String temp = "";
            NoItem aux = this.prim; // comeca pelo primeiro no

            while (aux != null) {
                temp += aux.getItem() + "\n"; // adiciona a representacao do item na string
                aux = aux.getProx(); // passa para o proximo no
            }

            return temp; // retorna a string com todos os itens da lista
        }

    }
