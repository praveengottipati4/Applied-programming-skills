import java.util.*;

class RecentCounter {

    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.offer(t); // add the new request

        // remove requests older than t - 3000
        while (queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
    }
}
