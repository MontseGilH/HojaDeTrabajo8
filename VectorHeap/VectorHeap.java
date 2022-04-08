import java.util.Vector;
/**
 * Ultima modificacion: 8/04/2022
 * 
 * Clase de los heap 
 * @file VectorHeap.java
 * @author Montserrat Gil
 * @author Gabriela Archila
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {

    private Vector<E> vector;

    /**
     * Constructor de vectorHeap
     */
    public VectorHeap(){
        vector = new Vector<E>();
    }
    /**
     * Metodo que obtiene el vector
     * @return vector
     */
    public Vector<E> getVector() {
        return vector;
    }
    /**
     * Metodo que establece el vector
     * @param vector
     */
    public void setVector(Vector<E> vector) {
        this.vector = vector;
    }
    /**
     * Metodo que obtiene el indice padre de un valor
     * @param int indice del valor
     * @return int
     */
    private int parent(int i){
        if(i==0){
            return 0;
        }
        return (i-1)/2;
    }
    /**
     * Metodo que obtiene el indice izquierdo de un valor
     * @param int indice del valor
     * @return int
     */
    private int LEFT(int i){
        return (2*i+1);
    }

    /**
     * Metodo que obtiene el indice derecho de un valor
     * @param int indice del valor
     * @return int
     */
    private int RIGHT(int i){
        return (2*i+2);
    }
    /**
     * Metodo que intercambia 2 valores
     * @param i1 indice del valor 1
     * @param i2 indice del valor 2
     */
    void swap (int i1, int i2){
        E temp = vector.get(i1);
        vector.setElementAt(vector.get(i2),i1);
        vector.setElementAt(temp,i2);
    }

    /**
     * Metodo que ordena desde un valor hacia abajo
     * @param i indice desde el valor del que se ordena
     */
    private void heapify_down(int i){
        int left = LEFT(i);
        int right = RIGHT(i);
        int small = i;
        if (left<size()&&vector.get(left).compareTo(vector.get(i))<0){
            small = left;
        }
        if (right<size()&&vector.get(right).compareTo(vector.get(small))<0){
            small = right;
        }
        if (small !=i){
            swap(i,small);
            heapify_down(small);
        }

    }
    /**
     * Metodo que ordena desde un valor hacia arriba
     * @param i indice desde el valor del que se ordena
     */
    private void heapify_up(int i){
        if (i>0&&vector.get(parent(i)).compareTo(vector.get(i))>0){
            swap(i,parent(i));
            heapify_up(parent(i));
        }
    }
    /**
     * Metodo que regresa el size del heap
     * @return int size
     */
    public int size(){
        return vector.size();
    }

    /**
     * Metodo que regresa si esta vacio
     * @return boolean
     */
    public boolean isEmpty(){
        return vector.isEmpty();
    }
    /**
     * Metodo que agrega un valor
     * @param key valor a agregar
     */
    public void add(E key){
        vector.addElement(key);
        int index = size()-1;
        heapify_up(index);
    }
    /**
     * Metodo que quita y regresa el primer valor
     * @return E valor retirado
     */
    public E remove() throws Exception{
        if (size()==0){
            throw new Exception("Empty heap");
        }
        E root = vector.firstElement();
        vector.setElementAt(vector.lastElement(),0);
        vector.remove(size()-1);
        heapify_down(0);
        return root;
    }
    /**
     * Metodo que regresa el primer valor
     * @return E valor retirado
     */
    public E getFirst() throws Exception{
        if (size()==0){
            throw new Exception("Empty heap");
        }
        return vector.firstElement();
    }
    /**
     * Metodo que vacia el vector heap
     */
    public void clear() throws Exception{
        while(!vector.isEmpty()){
            remove();
        }
    }
}
