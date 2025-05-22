//abstract class example 
abstract class Animal{
    public abstract void sound();//here show is method
}
class Dog extends Animal{
    public void sound(){
        System.out.println("dog barks");
    }
}
class Lion extends Animal{
    public void sound (){
        System.out.println("lion roar");
    }
}
public class abstractclass {
    public static void main(String[] args) {
        Animal d = new Dog();
        Lion l = new Lion();
        d.sound();
        l.sound();
    }
}
