
public class Pilha {

    Celula topo;

    public Pilha(){
        topo = null;
    }

    public boolean empty(){
        return (topo == null);
    }

    public void stack(Celula c){
        c.prox = topo;
        topo = c;
    }

    public Celula unstack(){
        if(empty()){
            System.out.println("Pilha ja se encontra vazia ");
            return null;
        } else {
            Celula aux = topo;
            topo = topo.prox;
            aux.prox = null;
            return aux;
        }
    }

    public void print(){
        if(empty()){
            System.out.println("Pilha vazia");
        } else {
            Celula aux = topo;
            while (aux != null){
                System.out.println(aux.getValor());
                aux = aux.prox;
            }
        }
    }
}

