package datastructure;
/**
 *
 * @author Carlos Dhyego
 * @author Mikael
 * @author Walter
 * 
 */
public class MyStackGenericTest {

    public static void main(String[] args) {
        MyStackGeneric<String> stack = new MyStackGeneric<>();	
		
	for (int i = 0; i  < 10; i++)
		stack.push(""+i);

	System.out.println("Print stack: ");
	stack.print();
	System.out.println("");
	System.out.println("Top: " +stack.top());
	System.out.println("Push: ");
	stack.push(""+10);
	System.out.println("isFull: " + stack.isFull());
	System.out.println("isEmpty: " +stack.isEmpty());
	System.out.println("Top: " + stack.top());
	stack.clear();
	System.out.println("Pop: " + stack.pop());
	System.out.println("Top: " +stack.top());
    }    
}
