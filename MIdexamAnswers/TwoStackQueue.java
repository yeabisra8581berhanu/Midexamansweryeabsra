package package2;

import java.util.EmptyStackException;

public class TwoStackQueue {
    private Stack stack1;
    private Stack stack2;

    public TwoStackQueue(int capacity) {
        stack1 = new Stack(capacity);
        stack2 = new Stack(capacity);
    }

    public void enqueue(int element) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(element);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack1.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("the queue elements are: ");
        stack1.display();
    }

    public static void main(String[] args) {
        TwoStackQueue queue = new TwoStackQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.display();

        System.out.println("Deqeued: " + queue.dequeue());
        System.out.println("Peeek: " + queue.peek());

        queue.display();
    }
}
