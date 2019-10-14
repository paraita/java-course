import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

class Exemple32 {

    public static Queue<String> getQueue() {
	Queue<String> queue = new LinkedBlockingQueue<>();
	queue.add("Dos");
	queue.add("Cali");
	queue.add("Cali");
	queue.add("Zwan");
	return queue;
    }

    public static void main(String[] args) {
	Queue<String> chiens = getQueue();
        while (!chiens.isEmpty()) {
	    System.out.println("Chien: " + chiens.poll());
	}
    }
}
