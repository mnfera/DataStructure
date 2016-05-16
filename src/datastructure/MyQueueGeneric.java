package datastructure;
/**
 *
 * @author Carlos Dhyego 
 * @author Mikael
 * @author Walter
 * 
 * @param <T>
 */
public class MyQueueGeneric <T> {
    private T[] queue;
    private int front =  0,
		back  =  0,
		size;
	
    /**
	 * Constructs an empty queue with an initial capacity of ten.
    */
    public MyQueueGeneric () {
	this.size = 10;
	this.queue = (T[])new Object[size];
    }
	
    /**
	 * Constructs an empty queue with the specified initial capacity.
	 * @param size
     */
    public MyQueueGeneric (int size) {
	this.size = size;
	this.queue = (T[])new Object[size];
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
	return front == size - 1;
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
	 * If the referenced element does not exist null is returned.
	 * @return
	 */
    public T front () {
	try {
		return queue[front-1];
	} catch (ArrayIndexOutOfBoundsException e) {
		return null;
	}
    }

    /**
	 * Returns the object that is the beginning of the queue
	 * If the referenced element does not exist null is returned.
	 * @return
     */
	 
    public T back () {
	try {
		return queue[back];
	} catch (ArrayIndexOutOfBoundsException e) {
		return null;
	}
    }

    /**
	 * Adds an element in the queue.
	 * @param element
     */
    public void push (T element) {	
	if (isFull()) {
		System.out.println("Error: queue overflow");
	} else {
		queue[front++] = element;
	}
    }

	/**
	 *  Removes an element in the queue.
	 * @return
	 */
    public T pop () {
	if (isEmpty()) {
		System.out.println("Error: queue underflow");
		return null;
	} else {
		T item = queue[back++];
		return item;
	}
    }

    /**
	 * Removes all elements from the queue.
     */
    public void clear () {
	if (!isEmpty()) {
		for (int i = 0; i < front; i++) {
			queue[i] = null;
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
