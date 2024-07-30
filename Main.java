public class Main {
    
    public static void main(String [] args){

        Celula c1 = new Celula(10);
        Celula c2 = new Celula(20);
        Celula c3 = new Celula(30);

        Pilha pilha = new Pilha();

        pilha.stack(c1);
        pilha.stack(c2);
        pilha.stack(c3);

        pilha.print();

    }
}
