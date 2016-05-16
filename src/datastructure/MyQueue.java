package datastructure;
/**
 *
 * @author Carlos Dhyego
 * @author Mikael
 * @author Walter
 */
public class MyQueue {
    
    private int[] queue;
    private int front =  0,
		back  =  0,
		size;
	
    /**
	 * Constructs an empty queue with an initial capacity of ten.
     */
    public MyQueue() {
	this.size = 10;
	this.queue = new int[size];
    }
	
    /**
	 * Constructs an empty queue with the specified initial capacity.
	 * @param size
     */
    public MyQueue(int size) {
	this.size = size;
	this.queue = new int[size];
    }

    /**
	 * Returns true if the queue contains no elements.
	 * @return
     */
    public boolean isEmpty () {
	return back == front;
    }

    /**
         * Returns true if the queue is full.
	 * @return
     */
    public boolean isFull () {
	return front == size -1;
    }

    /**
	 * Returns the size of the queue.
	 * @return
     */
    public int size () {
	return front - back;
    }

    /**
	 * Returns the element that is the end of the queue.
	 * If the referenced element does not exist -1 is returned.
	 * @return
     */
    public int front () {
        try {
            return queue[front-1];
        } catch (ArrayIndexOutOfBoundsException e) {
            return -1;
        }
    }

    /**
	 * Returns the object that is the beginning of the queue
	 * If the referenced element does not exist -1 is returned.
	 * @return
     */
	 
    public int back () {
	try {
		return queue[back];
	} catch (ArrayIndexOutOfBoundsException e) {
		return -1;
	}
    }

    /**
	 * Adds an element in the end of the queue.
	 * @param element
     */
    public void enqueue (int element) {	
	if (isFull()) {
		System.out.println("Error: queue overflow");
	} else {
		queue[front++] = element;
	}
    }

    /**
	 *  Removes an element in the queue and return the first element.
         *  In case of error return -1.
	 * @return
     */
    public int dequeue() {
	if (isEmpty()) {
		System.out.println("Error: queue underflow");
		return -1;
	} else {
		int item = queue[back++];
		return item;
	}
    }

    /**
	 * Removes all elements from the queue.
     */
	
    public void clear () {
	if (!isEmpty()) {
		for (int i = 0; i < front; i++) {
			queue[i] = -1;
		}
	}
        back = 0;
	front = 0;
    }
	
    /**
	 * Prints all elements that are in the queue.
     */
    public void print () {
	if (!isEmpty()) {
		for (int i = back; i < front; i++) {
			System.out.print(queue[i] + " ");
		}
	}
    }    
}