// Bank thread class extending Thread
public class SynchronizationBlock extends Thread {
    static int balance = 5000;  // Shared balance among all threads
    int withdraw;
    static Object lock = new Object();  // Lock object for synchronization block

    SynchronizationBlock(int withdraw) {
        this.withdraw = withdraw;
    }

    public void run() {
        String name = Thread.currentThread().getName();

        // Only this block is synchronized
        synchronized (lock) {
            if (withdraw <= balance) {
                System.out.println(name + " is withdrawing " + withdraw);
                balance = balance - withdraw;
                System.out.println(name + " completed withdrawal. Remaining balance: " + balance);
            } else {
                System.out.println(name + " – Insufficient Balance! Available: " + balance);
            }
        }
    }

    // main method to create customer threads
    public static void main(String[] args) {
        SynchronizationBlock customer1 = new SynchronizationBlock(5000);
        SynchronizationBlock customer2 = new SynchronizationBlock(5000);

        customer1.setName("Customer1 - Sonu");
        customer2.setName("Customer2 - Sarvjeet");

        customer1.start();
        customer2.start();
    }
}
