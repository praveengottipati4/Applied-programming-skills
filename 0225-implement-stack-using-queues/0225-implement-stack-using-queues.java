import java.util.*;

class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        // move all except last
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        int top = q1.poll(); // last element

        // swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    public int top() {
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        int top = q1.peek();
        q2.add(q1.poll());

        // swap
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}