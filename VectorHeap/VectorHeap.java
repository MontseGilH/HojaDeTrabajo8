import java.util.Vector;

public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {
    private Vector<E> vector;
    public VectorHeap(){
        vector = new Vector<E>();
    }
    public Vector<E> getVector() {
        return vector;
    }
    public void setVector(Vector<E> vector) {
        this.vector = vector;
    }

    private int parent(int i){
        if(i==0){
            return 0;
        }
        return (i-1)/2;
    }

    private int LEFT(int i){
        return (2*i+1);
    }

    private int RIGHT(int i){
        return (2*i+2);
    }
    
    void swap (int i1, int i2){
        E temp = vector.get(i1);
        vector.setElementAt(vector.get(i2),i1);
        vector.setElementAt(temp,i2);
    }

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

    private void heapify_up(int i){
        if (i>0&&vector.get(parent(i)).compareTo(vector.get(i))>0){
            swap(i,parent(i));
            heapify_up(parent(i));
        }
    }
    public int size(){
        return vector.size();
    }

    public boolean isEmpty(){
        return vector.isEmpty();
    }
    public void add(E key){
        vector.addElement(key);
        int index = size()-1;
        heapify_up(index);
    }

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
    public E getFirst() throws Exception{
        if (size()==0){
            throw new Exception("Empty heap");
        }
        return vector.firstElement();
    }
    public void clear() throws Exception{
        while(!vector.isEmpty()){
            remove();
        }
    }
}
