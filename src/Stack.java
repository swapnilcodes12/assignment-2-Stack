public class Stack {
    int size = 4;
    int[] stack = new int[size];
    int top = 0;


    public void push(int data) {
        stack[top] = data;
        top++;
    }

    public int pop() {
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int peek() {
        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top <= size;
    }

    public boolean isFull() {
        return top == size;
    }

}
