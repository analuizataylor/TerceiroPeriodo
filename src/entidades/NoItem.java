package entidades;

import listasimplesmenteencadeada_item.Item;

// NoItem eh classe
public class NoItem {
    // atributo
    private listasimplesmenteencadeada_item.Item item;
    // atributo
    private NoItem prox;

    // Construtor so recebe o objeto da classe Item
    public NoItem(listasimplesmenteencadeada_item.Item item) {
        this.item = item;
        this.prox = null;
    }

    public listasimplesmenteencadeada_item.Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public NoItem getProx() {
        return prox;
    }

    public void setProx(NoItem prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return "Item = "+item;
    }
}
