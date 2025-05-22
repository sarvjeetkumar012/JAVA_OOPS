import java.util.Scanner;
interface client{
    void input();//by default public+abstract
    void output();//by default public+abstract
}
public class InterfaceExample implements client {
    String name; double sal;
    public  void input(){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = r.nextLine();
        System.out.print("Enter salary: ");
        sal = r.nextDouble();
    }
    public void output(){
        System.out.println(name+" "+sal);
    }
    public static void main (String[]args){
        client c = new InterfaceExample();
        c.input();
        c.output();
    }
}
