package entidades;

public class FilaInt {

    /*
     * ATRIBUTOS
     * head → Representa o no de inicio da fila
     * tail → Representa o no do final da fila
     * quant → Representa a quantidade de elementos que foram enfileirados
     */

    private NoInt head, tail;
    private int quant;

    /*
     * METODOS
     * IsEmpty → Verifica se a Lista esta vazia
     * Enfileirar → Insere um elemento no final da fila (enqueue)
     * Desenfileirar → Remove o elemento do inicio da fila (dequeue)
     * Size → Retorna o tamanho da pilha
     * Peek → Retorna o elemento do inicio da fila
     */

    public FilaInt() {
        this.head = null;
        this.tail = null;
        this.quant = 0;
    }

    public boolean isEmpty() {
        return (this.head == null);
    }

    public int size() {
        return this.quant;
    }

    public NoInt peek () {
        return this.head;
    }

    /*
     * enqueue → Insere um elemento no final da fila
     */

    public void enqueue (int info) {
        NoInt novoNo = new NoInt(info);

        if (this.isEmpty()) {
            this.head = novoNo;
        }else {
            this.tail.setProx(novoNo);
        }
        this.tail = novoNo;
        this.quant++;

    }

    /*
     * dequeue → Remove o elemento do início da fila
     */

    public NoInt dequeue () {
        NoInt aux = this.head;

        if (this.isEmpty()) {
            return null;
        }else {
            if (this.quant==1) {
                this.tail = null;
            }
            this.head = this.head.getProx();
            this.quant--;
            return aux;
        }
    }
    public String toString () {
        String str = "";
        NoInt aux=head;

        while (aux!=null) {
            str += aux.getElemento()+"  ";
            aux = aux.getProx();
        }
        return str;
    }
}
