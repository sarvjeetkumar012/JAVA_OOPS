//default constructor call using this keyword
class A{
    // A(){
    //     System.out.println("Default Constructor");
    // }
    // A(int a){
    //     this(); // this() ye default constructor ko call karega 
    //     System.out.println(a);
    // }



    //-----------------------------------
    // it also called parametrized constructor of its own class
     
    A(){
        this(200,"sonu");
    }
    A(int a ,String name){
        System.out.println(a +" "+name );
    }
}
public class thiskeyword2 {
    public static void main(String[] args) {
        A r = new A ();
       

    }
}
