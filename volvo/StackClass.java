package volvo;

import java.util.Stack;

public class StackClass {
	/*
	 Stack implements Stack Data structure, it is extended from Vector & it also subclass of Vector
	 
	 https://www.geeksforgeeks.org/stack-class-in-java/
	 
1. Object push(Object element) : Pushes an element on the top of the stack.
2. Object pop() : Removes and returns the top element of the stack. An ‘EmptyStackException’ exception is thrown if we call pop() when the invoking stack is empty.
3. Object peek() : Returns the element on the top of the stack, but does not remove it.
4. boolean empty() : It returns true if nothing is on the top of the stack. Else, returns false.
                     int search(Object element) : It determines whether an object exists in the stack. If the element is found, 
                     it returns the position of the element from the top of the stack. Else, it returns -1.
	 */
	
	static void stack_push(Stack<Integer> stack){
		for(int i=0; i<5;i++){
			stack.push(i);
		}
		System.out.println(stack);
	}
	static void stack_pop(Stack<Integer> stack){
		System.out.println("Pop : ");
		for(int i=0;i<5 ;i++){
			Integer j=(Integer)stack.pop();
			System.out.println(j);
		}
		System.out.println(stack.size());
	}
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack_push(stack);
		stack_pop(stack);
	}
}
