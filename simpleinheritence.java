//simple inheritence example
class simple{
    int roll ,marks ;
    String name;
    void input (){
        System.out.println("enter the detail");
    }
}
class sub extends simple{
    void disp()
    {
        roll=43;marks=98;
        name="sonu";
        System.out.println(roll+" "+marks+" "+name);
    }
}
public class simpleinheritence {
    public static void main(String[] args) {
        sub r = new sub();
        r.input();
        r.disp();
    }
}
