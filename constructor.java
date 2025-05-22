public class constructor {
    int a;String name;
    constructor(){// default constructor and constructor 
        a=10;name="sonu rajkumar";
    }
    void show(){
        System.out.println(a+" "+name);//metod
    }
    
    public static void main(String[] args) {
        constructor c1 = new constructor();
        c1.show();//call method which name is show
        
    }
}
