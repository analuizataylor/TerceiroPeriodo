package pilha_inteiro;

public class PilhaInteiroMain {

    public static void main(String[] args) {
        PilhaInteiro pilha = new PilhaInteiro();
        int num;

        for (int i = 0; i < 10; i++) {
            num = (int)(Math.random()*50+1);
            pilha.push(num);
        }
        System.out.println(pilha);
        System.out.println("TOPO = "+pilha.top());
        System.out.println("desempilhar = "+ pilha.pop().getElemento());
        System.out.println("desempilhar = "+ pilha.pop().getElemento());
    }

}
