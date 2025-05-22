//method overloading example
class A{
    int a=10;String name="sonu";
    void disp(int a,int b){
        int z=a+b;
        System.out.println(z);
    }
    void disp1(int a,double c){
        c=43.5;
        System.out.println(a+" "+c);
    }
    void disp2(int a, double c,String name){
        c=43.5;
        System.out.println(a+" "+c+" "+name);

    }
    void disp3(int a,int b,double c){
        c=43.5;
        double k=a+b+c; 
        System.out.println(k);

    }
}
public class methodoverloading {
    public static void main(String[] args) {
        A a = new A();
        a.disp(10,15);
        a.disp1(12,12.5);
        a.disp2(32,32.5,"sanruj");
        a.disp3(40,40,40.5);
    }
}
