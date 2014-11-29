
public class NonGenericStatk {

	private Object[] elements;
	private int size=0;
	private static final int CAPACITY = 10;
	
	public NonGenericStatk() {
		elements = new Object[CAPACITY];
	}
	public void push(Object ob) {
		elements[size] = ob;
		size++;
	}
	public Object pop() {
		if(size<=0){
			return null;
		}
		size--;
		return elements[size];
		
	}
}

