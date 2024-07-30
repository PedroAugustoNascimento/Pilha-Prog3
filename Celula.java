public class Celula{

     private int valor;
     Celula prox;

    public Celula(int valor){
       this.valor = valor;
       prox = null;
    }

    public int getValor(){
        return valor;
    }

    public void setValor(int aux){
        valor = aux;
    }

}