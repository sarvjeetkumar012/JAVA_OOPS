// Why only one exception is caught?
// 🔸 Java's Exception Handling Rule:
// When an exception occurs inside a try block, 
// the control immediately jumps to the first matching catch block and skips the rest of the try block.

public class MultipleCatcBlockEX {
    public static void main(String[] args) {
        try{
            int a=10,b=2,c=a/b;
            System.out.println(c);

            int arr[]={4,5,6,7,8,9};
            System.out.println(arr[9]);//this line is skiped

            String s=null;
            System.out.println(s.length());//this line is skiped

        }catch(ArrayIndexOutOfBoundsException r){
            System.out.println(r);

        }catch(ArithmeticException p){
            System.out.println(p);//only this line is execute
            
        }catch(NullPointerException q){
            System.out.println(q);
        }
        System.out.println("main method ended");
    }
}
