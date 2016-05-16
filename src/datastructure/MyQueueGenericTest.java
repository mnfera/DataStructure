package datastructure;
/**
 *
 * @author Carlos Dhyego
 * @author Mikael
 * @author Walter
 * 
 */
public class MyQueueGenericTest {

    public static void main(String[] args) {
        MyQueueGeneric<Integer> queue = new MyQueueGeneric<>();
		
	System.out.println(queue.isEmpty());
	queue.push(2);
	queue.push(2);
	queue.push(2);
	System.out.println(queue.isFull());
	queue.pop();
	queue.pop();
	queue.pop();
	queue.pop();

	queue.push(2);
	queue.push(2);
	queue.push(2);

	System.out.println(queue.size());
	System.out.println(queue.front());
	System.out.println(queue.back());
	
	queue.print();
	queue.clear();
    }    
}
