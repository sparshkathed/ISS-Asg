// 1.8 Multithreading, Thread pool executor, volatile keyword, thread-safe with respect to instance, local variable, Method synchronized and block synchronized

import java.util.concurrent.*;

class SharedResource {
    private int sharedVariable = 0;
    private volatile boolean flag = false;

    // Method synchronized to achieve thread safety with respect to the instance
    public synchronized void incrementSharedVariable() {
        sharedVariable++;
    }

    // Method with local variable to achieve thread safety with respect to the local variable
    public void safeOperationWithLocalVariable() {
        int localVariable = sharedVariable; // Local variable
        localVariable++;
        sharedVariable = localVariable;
    }

    // Method with synchronized block to achieve thread safety with respect to a block of code
    public void safeOperationWithSynchronizedBlock() {
        synchronized (this) {
            sharedVariable++;
        }
    }

    // Volatile flag to achieve visibility among threads
    public void setFlag() {
        flag = true;
    }

    public boolean isFlagSet() {
        return flag;
    }
}

public class Multithreading {
    public static void main(String[] args) {
        int corePoolSize = 2;
        int maxPoolSize = 4;
        long keepAliveTime = 5000;

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                corePoolSize, maxPoolSize, keepAliveTime, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>()
        );

        SharedResource sharedResource = new SharedResource();

        // Multithreading example with ThreadPoolExecutor
        for (int i = 0; i < 5; i++) {
            executor.execute(() -> {
                // Thread-safe operation using method synchronization
                sharedResource.incrementSharedVariable();

                // Thread-safe operation using local variable
                sharedResource.safeOperationWithLocalVariable();

                // Thread-safe operation using synchronized block
                sharedResource.safeOperationWithSynchronizedBlock();
            });
        }

        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if the flag is set in a volatile variable
        sharedResource.setFlag();
        System.out.println("Flag is set: " + sharedResource.isFlagSet());
        // executor.close();
    }
}