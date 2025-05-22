//this keyword 
// class A{
//     int a;
//     A(int a){
//         a=a;
//     }
//      void disp(){
//         System.out.println(this.a);
//         // System.out.println(a);
//     }
// }
public class thiskeyword {
    int a;
    thiskeyword(int a){
       this.a=a;
    }
     void disp(){
        System.out.println(a);
        // System.out.println(a);
    }
    public static void main(String[] args) {
        thiskeyword r = new thiskeyword(100);
        r.disp();
    }
}
