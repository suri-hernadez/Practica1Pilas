package Interffaces.ed.ito;

import excepciones.ed.ito.ExceptionDeDesbordamientoDePila;
import excepciones.ed.ito.ExceptionDePilaVacia;

public interface Pila<E>{
    public void push(E elemento) throws ExceptionDeDesbordamientoDePila; //Aca vamos a agregar un elemnto
    E pop() throws ExceptionDePilaVacia; //eliminamos y devolvemos el elemento superior o el numero
    E peek() throws ExceptionDePilaVacia;;//consultamos que elemnto hay en la parte superior
    boolean isEmpty(); //comprobamos si la pila esta vacia (el cuadro)
    int search(E elemento) throws ExceptionDePilaVacia;//buscamos un elemento
    int length();//longitud de la pilaa //aaaa
}
