package pilha_inteiro;
import entidades.*;

public class PilhaInteiro {

    /*
     * ATRIBUTOS
     * Topo → no que eh o topo da linha
     * Quant → representa a quantidade de elementos empilhados
     */

    private NoInt topo;
    private int quant;

    /*
     * METODOS
     * IsEmpty → Verifica se a Lista está vazia
     * Push → Insere um elemento no topo da pilha (empilhar)
     * Pop → Remove o elemento do topo da pilha (desempilhar)
     * Size → Retorna o tamanho da pilha
     * Top → Retorna o elemento do topo da pilha
     */

    public PilhaInteiro () {
        this.topo = null;
        this.quant = 0;
    }

    public boolean isEmpty() {
        return (this.topo==null);
    }

    public int size() {
        return this.quant;
    }

    public NoInt top(){
        return this.topo;
    }

    public void push (int num) {
        NoInt novo = new NoInt(num);
        novo.setProx(this.topo);
        this.topo = novo;
        this.quant++;
    }

    public NoInt pop() {
        NoInt removido = this.topo;
        if (!isEmpty()) {
            this.topo = this.topo.getProx();
            this.quant--;
        }
        return removido;
    }

    public String toString() {
        NoInt aux = this.topo;
        String str = "";
        while (aux != null) {
            str += aux.getElemento()+"  ";
            aux = aux.getProx();
        }
        return str;
    }

}