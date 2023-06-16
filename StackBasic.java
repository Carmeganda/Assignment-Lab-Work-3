//2. Let's complete the code
public class StackBasic {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // constructor
    public StackBasic(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // initially stack is empty
    }

    // Add element to top of stack
    public void push(int value) {
        if (top < maxSize - 1) { // Check if stack is not full
            top++;
            stackArray[top] = value;
            System.out.println("Pushed " + value + " to the stack.");
        } else {
            System.out.println("Stack is full. Cannot push " + value + " to the stack.");
        }
    }

    // Remove element from top of stack
    public void pop() {
        if (top >= 0) { // Check if stack is not empty
            int poppedValue = stackArray[top];
            top--;
            System.out.println("Popped " + poppedValue + " from the stack.");
        } else {
            System.out.println("Stack is empty. Cannot pop element.");
        }
    }

    // Return top of stack
    public int peek() {
        if (top >= 0) { // Check if stack is not empty
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot peek element.");
            return -1; // Return a default value indicating an empty stack
        }
    }

    public static void main(String[] args) {
        StackBasic stack = new StackBasic(3);
        stack.push(1);
        stack.push(2);
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("Top element: " + stack.peek());
    }
}
