package datastructure;
/**
 *
 * @author Carlos Dhyego
 * @author Mikael
 * @author Walter
 * 
 */
public class MyQueueTest {

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
		
	System.out.println(queue.isEmpty());
	queue.enqueue(1);
	queue.enqueue(2);
	queue.enqueue(3);
	System.out.println(queue.isFull());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
	
	queue.enqueue(4);
	queue.enqueue(5);
	queue.enqueue(6);
	
	System.out.println(queue.size());
	System.out.println(queue.front());
	System.out.println(queue.back());
		
	queue.print();
	queue.clear();
        queue.print();
    }    
}
