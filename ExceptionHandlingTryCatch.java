public class ExceptionHandlingTryCatch {
    public static void main(String args[]){
        System.out.println("main method started");//ye pahle run hoga
        int a=10, b=0, c;
        try{
         c=a/b;
        System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println(" main method ended after exception  ");
    }
}
