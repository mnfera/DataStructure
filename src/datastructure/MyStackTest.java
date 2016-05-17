package datastructure;
/**
 *
 * @author Carlos Dhyego
 * @author Mikael
 * @author Walter
 * 
 */
public class MyStackTest {

    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();	
		
	for (int i = 0; i  < 10; i++)
		stack.push(""+(i*2+1));

	System.out.println("Print stack: ");
	stack.print();
	System.out.println("");
	System.out.println("Top: " +stack.top());
        System.out.println("Size: " +stack.size());
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
