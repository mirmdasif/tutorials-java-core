
public class GenericStatk <E>{

	private E[] elements;
	private int size=0;
	private static final int CAPACITY = 10;
	
	public GenericStatk() {
		elements = (E[])new Object[CAPACITY];
	}
	public void push(E ob) {
		elements[size] = ob;
		size++;
	}
	public E pop() {
		if(size<=0){
			return null;
		}
		size--;
		return elements[size];
		
	}
}

