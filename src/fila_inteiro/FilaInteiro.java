package fila_inteiro;

import entidades.*;

public class FilaInteiro {

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

    public FilaInteiro() {
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

    public NoInt peek() {
        return this.head;
    }
}


// falta enfileirar e desenfileirar

