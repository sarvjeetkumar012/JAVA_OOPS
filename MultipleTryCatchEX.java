public class MultipleTryCatchEX {
    public static void main(String[]args){
        try{
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println(e);

        }try{
            int arr[]={2,3,4,5,6};
            System.out.println(arr[6]);
        }catch(ArrayIndexOutOfBoundsException r){
            System.out.println(r);
        }
        System.out.println("main method ended");
    }
}
