// Bank thread class extending Thread
public class SynchronizationMethod extends Thread {
    static int balance = 5000;  // Shared balance among all threads
    int withdraw;

    SynchronizationMethod(int withdraw) {
        this.withdraw = withdraw;
    }

    // synchronized method to ensure one thread withdraws at a time
    public synchronized void run() {
        String name = Thread.currentThread().getName();

        if (withdraw <= balance) {
            System.out.println(name + " is withdrawing " + withdraw);
            balance = balance - withdraw;
            System.out.println(name + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(name + " – Insufficient Balance! Available: " + balance);
        }
    }

    // main method to create customer threads
    public static void main(String[] args) {
        SynchronizationMethod customer1 = new SynchronizationMethod(5000);
        SynchronizationMethod customer2 = new SynchronizationMethod(5000);

        customer1.setName("Customer1 - Sonu");
        customer2.setName("Customer2 - Sarvjeet");

        customer1.start();
        customer2.start();
    }
}
