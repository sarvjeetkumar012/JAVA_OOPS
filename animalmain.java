class animal {
   //wAP to using inheritence and polymorphism.
    void sound (){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends animal {
    void sound(){
        System.out.println("Dog braks");
    }
}
class Cat extends animal{
    void sound(){
        System.out.println("cat meows");
    }
} 
public class animalmain {
    public static void main (String[]args){
        animal a2 = new Cat();
        animal a1 = new Dog();

        a1.sound();
        a2.sound();
    }

    
}