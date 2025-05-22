// example of super keyword of method
class A{
    void show(){
        System.out.println("this is super class method ");
    }
}
class B extends A{
    void show(){
        super.show();
        System.out.println("this is subclass method ");
    }
}
public class supermethod {
    public static void main(String[] args) {
        B b1 = new B();
        b1.show();
    }
}
