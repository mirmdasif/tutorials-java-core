import java.util.List;
import java.util.ArrayList;
import java.util.Collection;


public class Main {

	public static <T> void  printAndAdd(T ob , Collection<T> collection){
		System.out.println(ob);
		collection.add(ob);
	}
	
	public static void printCollection(List<?> collection) {
		for(Object object : collection) {
			System.out.println(object);
		}
	}
	public static<T extends Shape> void drawShapes(List<T> shapes ) {
		for(T shape : shapes) {
			shape.draw();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
		 List<String> lists= new ArrayList<String>();		
		 printAndAdd("name",lists);
	
		 printCollection(lists);
		
		
		
		
	   Box<String> box = new Box<String>();
	   Box<Integer> integerBox =  new Box<Integer>();
	   
	   integerBox.set(new Integer(1));
	   System.out.println(integerBox.get());
	   
	   
	   NonGenericStatk stack1 = new NonGenericStatk();
	   stack1.push("a");
	   stack1.push(1);
	   GenericStatk<String> stackString = new GenericStatk<String>();
	   stackString.push("as");
	   String  s1 = (String)stackString.pop();

	}

}
