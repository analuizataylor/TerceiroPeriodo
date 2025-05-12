package entidades;

public class NoDupla {
    private Item item;
    private NoDupla prox;
    private NoDupla ant;

    public NoDupla(Item item) {
        super();
        this.item = item;
        this.prox = null;
        this.ant = null;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public NoDupla getProx() {
        return prox;
    }

    public void setProx(NoDupla prox) {
        this.prox = prox;
    }

    public NoDupla getAnt() {
        return ant;
    }

    public void setAnt(NoDupla ant) {
        this.ant = ant;
    }

    @Override
    public String toString() {
        return "NoDupla [item=" + item + "]";
    }
}
