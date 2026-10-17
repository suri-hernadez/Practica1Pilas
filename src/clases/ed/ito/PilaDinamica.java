package clases.ed.ito;
import excepciones.ed.ito.ExceptionDeDesbordamientoDePila;
import excepciones.ed.ito.ExceptionDePilaVacia;
import Interffaces.ed.ito.Pila;

public class PilaDinamica<E> implements Pila<E> {
    private Nodo<E> sp;
    private  int length;
    public PilaDinamica (){
        this.sp=null;
        this.length=0;
    }
    @Override
    public void push(E item) throws ExceptionDeDesbordamientoDePila {
        Nodo<E> nuevo = new Nodo(item);
        nuevo.setNext(sp);
        sp = nuevo;
        length++;
    }
    @Override
    public E pop() throws ExceptionDePilaVacia {
        if(isEmpty())
            throw new ExceptionDePilaVacia();
        E item = sp.getItem();
        sp=sp.getNext();
        length--;
        return item;
    }

    public boolean isEmpty(){
        return length==0;
    }
    @Override
    public E peek() throws ExceptionDePilaVacia {
        if(isEmpty())
            throw new ExceptionDePilaVacia();
        return sp.getItem();
    }

    public int search (E item) throws ExceptionDePilaVacia{
        if(isEmpty())
            throw new ExceptionDePilaVacia();
        int i=1;
        Nodo<E> aux=sp;
        while (aux!=null){
            if(aux.getItem().equals(item))
                return i;
            aux=aux.getNext();
            i++;
        }
        return -1;
    }

    public int length(){
        return length;
    }
}
