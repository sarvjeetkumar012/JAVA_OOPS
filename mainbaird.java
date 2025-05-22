interface Flyable {
    void fly();
}
abstract class Bird {
    abstract void sound();
}
class Sparrow extends Bird implements Flyable {
    void sound() {
        System.out.println("Sparrow chirps");
    }
    public void fly() {
        System.out.println("Sparrow can fly");
    }
}

// Main class
public class mainbaird {
    public static void main(String[] args) {
        Sparrow sp = new Sparrow();
        sp.sound();  
        sp.fly();   
    }
}