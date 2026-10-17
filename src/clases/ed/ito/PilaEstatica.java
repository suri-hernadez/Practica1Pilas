package clases.ed.ito;
import excepciones.ed.ito.ExceptionDeDesbordamientoDePila;
import excepciones.ed.ito.ExceptionDePilaVacia;
import Interffaces.ed.ito.Pila;
public class PilaEstatica<E> implements Pila<E> {
    private E[] Pila;
    private int sp;
    public PilaEstatica(int n){
        Pila =(E[]) new Object [n];
        sp = n;
    }
    @Override
    public void push(E item) throws ExceptionDeDesbordamientoDePila {
        if(sp==0)
            throw new ExceptionDeDesbordamientoDePila();
        Pila[--sp]=item;
    }
    @Override
    public E pop() throws ExceptionDePilaVacia {
        if (isEmpty())
            throw new ExceptionDePilaVacia();
        sp++;
        return Pila[sp-1];
    }
    @Override
    public E peek() throws ExceptionDePilaVacia {
        if (isEmpty())
            throw new ExceptionDePilaVacia();
        return Pila[sp];
    }

    @Override
    public boolean isEmpty() {
        return sp==Pila.length;
    }

    @Override
    public int search(E item)throws ExceptionDePilaVacia {
        if (isEmpty())
            throw new ExceptionDePilaVacia();
        int i;
        for(i=sp; i<Pila.length; i++){
            if(Pila[i].equals(item))
                break;
        }
        if(i==Pila.length)
            return -1;
        return i-sp+1;
    }
    public int length() {
        return Pila.length - sp;
    }
}
