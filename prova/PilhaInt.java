package prova;

public class PilhaInt {
	
	/*
     * ATRIBUTOS
     * Topo → no que eh o topo da linha
     * Quant → representa a quantidade de elementos empilhados
     */
	
	private NoInt top;
	private int quant;
	
    /*
     * METODOS
     * IsEmpty → Verifica se a Lista está vazia
     * Push → Insere um elemento no topo da pilha (empilhar)
     * Pop → Remove o elemento do topo da pilha (desempilhar)
     * Size → Retorna o tamanho da pilha
     * Top → Retorna o elemento do topo da pilha
     */
	
	public PilhaInt () {
		this.top = null;
		this.quant = 0;
	}
	
	public boolean isEmpty() {
		return (this.top==null);
	}
	
	public int size() {
		return this.quant;
	}
	
	public NoInt top(){
		return this.top;
	}
	
	public void push (int num) {
		NoInt novo = new NoInt(num);
		novo.setProx(this.top);
		this.top = novo;
		this.quant++;
	}
	
	public NoInt pop() {
		NoInt removido = this.top;
		if (!isEmpty()) {
			this.top = this.top.getProx();
			this.quant--;
		}
		return removido;
	}
	
	public String toString() {
		NoInt aux = this.top;
		String str = "";
		while (aux != null) {
			str += aux.getElemento()+"  ";
			aux = aux.getProx();
		}
		return str;
	}
	
}

