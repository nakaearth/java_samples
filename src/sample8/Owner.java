package sample8;

public class Owner<E> {
    private E element;
    public E get() {
    	return element;
    }
    
    public void put(E element) {
    	this.element = element;
    }
}
