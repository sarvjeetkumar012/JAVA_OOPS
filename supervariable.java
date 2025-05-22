//example of super keyword for variable 
class A{
    int a=20; String name = "sarvjeet kumar";
}
class B extends A{
    int a=30; String name = "Suraj bisht ";
    void show(){
    System.out.println(a+" "+name);// print subclass
    System.out.println(super.a+" "+super.name);//print superclass 
    System.out.println(super.a+" "+name);//print superclass variable a not name:output a=20 ,name=suraj bist  
    }
    
}
public class supervariable {
    public static void main(String[] args) {
        B b1 = new B();
        b1.show();
    }
    
}
