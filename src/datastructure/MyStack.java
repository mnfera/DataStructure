package datastructure;
/**
 *
 * @author Carlos Dhyego
 * @author Mikael
 * @author Walter
 */
public class MyStack {
    private int[] stack;
    private int position = -1;
    private int size;
    
    /**
        * Constructs an empty stack with an initial capacity of ten.
    */
    public MyStack() {
	this.size = 10;
	this.stack = new int[size];
    }

    /**
        * Constructs an empty stack with the specified initial capacity.
        * @param size
    */
    public MyStack(int size) {
	this.stack = new int[size];
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
	 * Returns the lenght of the stack.
	 * @return
     */
    public int size () {
        if(!isEmpty()) {
            int tam = position;
            return ++tam;
        }
        return 0;
    }
    
    /**
	 * Returns the object that is on top of the stack.
	 * @return
     */
    public int top () {
	return stack[position];
    }
    
    /**
	 * 
	 * Adds an object on top of the stack. 
	 * If the stack is full you will receive an error message: stack overflow.
	 * @param element
     */
    public void push (int element) {
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
         * Return -1 in case of error.
	 * @return
     */
    public int pop () {
	try{
		int top = stack[position];
		--position;
		return top;
	} catch (ArrayIndexOutOfBoundsException e) {
		++position;
		System.out.println("Error: stack underflow");
		return -1;
	}
    }

    /**
	 * Removes all objects from the stack.
     */
    public void clear () {
	if (!isEmpty()) {
		for (int i = 0; i <= position; i++) {
			stack[i] = -1;
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
