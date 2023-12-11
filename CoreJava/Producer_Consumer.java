import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                queue.put(i);
                System.out.println("Producing : " + i);
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                queue.take();
                System.out.println("Consumer Taking : " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Producer_Consumer {
    public static void main(String args[]) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Thread ProducerThread = new Thread(new Producer(queue));
        Thread ConsumerThread = new Thread(new Consumer(queue));

        ProducerThread.start();
        ConsumerThread.start();
    }
}
