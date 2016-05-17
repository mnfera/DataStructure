package datastructure;
/**
 *
 * @author Carlos Dhyego 
 * @author Mikael
 * @author Walter
 * 
 * @param <T>
 */
public class MyStackGeneric <T> {
    private T[] stack;
    private int position = -1;
    private int size;

    /**
	 * Constructs an empty stack with an initial capacity of ten.
     */
    public MyStackGeneric () {
	this.size = 10;
	this.stack = (T[])new Object[size];
    }

    /**
	 * Constructs an empty stack with the specified initial capacity.
	 * @param size
     */
    public MyStackGeneric(int size) {
	this.stack = (T[])new Object[size];
	this.size = size;
    }

    /**
	 * Returns true if the stack contains no elements.
	 * @return
     */
    public boolean isEmpty () {
	return position == -1;
    }

    /**
	 * Returns true if the stack is full.
	 * @return
     */
    public boolean isFull () {
	return position == size - 1;
    }

    /**
	 * Returns the object that is on top of the stack.
	 * @return
     */
    public T top () {
	return stack[position];
    }

    /**
	 *
	 * Adds an object on top of the stack.
	 * If the stack is full you will receive an error message: stack overflow.
	 * @param element
     */
    public void push (T element) {
	try {
		stack[++position] = element;
        } catch (ArrayIndexOutOfBoundsException e) {
		--position;
		System.out.println ("Error: stack overflow");
	}
    }

    /**
	 *
	 * Removes an object from the top of the stack.
	 * Stack underflow: stack is empty if a message is thrown.
	 * @return
     */
    public T pop () {
	try{
		T top = stack[position];
		stack[position--] = null;
		return top;
	} catch (ArrayIndexOutOfBoundsException e) {
		++position;
		System.out.println("Error: stack underflow");
		return null;
	}
    }

    /**
	 * Removes all objects from the stack.
     */
    public void clear () {
	if (!isEmpty()) {
		for (int i = 0; i <= position; i++) {
			stack[i] = null;
		}
		position = -1;
	}
    }

    /**
	 * Prints all objects that are on the stack.
     */
    public void print () {
	if (!isEmpty()) {
		for (int i = 0; i <= position; i++) {
			System.out.print (stack[i] + " ");
		}
	}
    }    
}
