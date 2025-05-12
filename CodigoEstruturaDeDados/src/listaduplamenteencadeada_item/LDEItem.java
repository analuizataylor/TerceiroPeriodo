package listaduplamenteencadeada_item;

import entidades.Item;
import entidades.NoDupla;

public class LDEItem {
    private NoDupla prim, ult;
    private int quant;

    public LDEItem() {
        this.prim = null;
        this.ult = null;
        this.quant = 0;
    }

    public NoDupla getPrim() {
        return prim;
    }

    public NoDupla getUlt() {
        return ult;
    }

    public boolean eVazia() {
        return (quant==0);
    }

    public void insereUltimo (Item item) {
        NoDupla no = new NoDupla(item);

        if (this.eVazia()) {
            this.prim = no;
        } else {
            this.ult.setProx(no);
            no.setAnt(ult);
        }
        this.ult = no;
        this.quant++;
    }

    public void insereInicio (Item item) {
        NoDupla no = new NoDupla(item);

        if (this.eVazia()) {
            this.ult = no;
        } else {
            no.setProx(this.prim);
            this.prim.setAnt(no);
        }
        this.prim = no;
        this.quant++;
    }

    public boolean insere (Item item, int pos) {
        NoDupla no = new NoDupla(item);
        NoDupla aux;

        if (pos >= 0 && pos <= this.quant) {
            if (pos == 0) {
                insereInicio(item);
            } else if (pos == this.quant) {
                insereUltimo(item);
            } else {
                aux = this.prim;
                for (int i = 0; i < pos; i++) {
                    aux = aux.getProx();
                }
                no.setAnt(aux.getAnt());
                no.setProx(aux);
                aux.getAnt().setProx(no);
                aux.setAnt(no);
                this.quant++;
            }
            return true;
        }
        return false;
    }

    public NoDupla pesquisa (int cod) {
        NoDupla aux;
        aux = this.prim;
        while (aux!=null) {
            if (aux.getItem().getCodigo()==cod) {
                return aux;
            }
            aux = aux.getProx();
        }
        return aux;
    }

    public NoDupla pesquisaAoContrario (int cod) {
        NoDupla aux;
        aux = this.ult;
        while (aux!=null) {
            if (aux.getItem().getCodigo()==cod) {
                return aux;
            }
            aux = aux.getAnt();
        }
        return aux;
    }

    public boolean remove (int cod) {
        NoDupla atual = this.prim;

        if (this.eVazia()) {
            return false;
        }
        if (atual.getItem().getCodigo()==cod) {
            this.removePrim();
            return true;
        }
        while (atual != null) {
            if (atual.getItem().getCodigo()==cod) {
                if (atual.getAnt() != null){
                    atual.getAnt().setProx(atual.getProx());
                }
                if (atual.getProx() != null){
                    atual.getProx().setAnt(atual.getAnt());
                }
                if (atual == this.ult){
                    this.ult = atual.getAnt();
                }
                this.quant--;
                return true;
            }
            atual = atual.getProx();
        }
        return false;
    }

    public boolean removePrim () {
        if (this.eVazia()) {
            return false;
        }
        this.prim = this.prim.getProx();
        this.quant--;

        if (this.prim != null) {
            this.prim.setAnt(null);
        } else {
            this.ult = null;
        }
        return true;
    }

    public boolean removeUlt () {
        NoDupla aux;

        if (this.eVazia()) {
            return false;
        }
        if (this.quant == 1) {
            this.prim = null;
            this.ult = null;
        } else {
            aux = this.ult.getAnt();
            aux.setProx(null);
            this.ult = aux;
        }
        this.quant--;
        return true;
    }

    public boolean removePos (int pos) {
        NoDupla atual, ant, prox;

        if (pos < 0 || pos >= this.quant) {
            return false;
        }
        if (pos == 0) {
            return removePrim();
        }
        if (pos == this.quant-1) {
            return removeUlt();
        }

        atual = this.prim;
        for (int i = 0; i < pos; i++){
            atual = atual.getProx();
        }

        ant = atual.getAnt();
        prox = atual.getProx();

        if (ant != null){
            ant.setProx(prox);
        }
        if (prox != null){
            prox.setAnt(ant);
        }

        this.quant--;
        return true;
    }

    public String toString() {
        String temp="";
        NoDupla aux = this.prim;

        while (aux != null) {
            temp += aux.getItem()+"\n";
            aux = aux.getProx();
        }
        return temp;
    }

    public String toStringInverso() {
        String temp="";
        NoDupla aux = this.ult;

        while (aux != null) {
            temp += aux.getItem()+"\n";
            aux = aux.getAnt();
        }
        return temp;
    }
}
