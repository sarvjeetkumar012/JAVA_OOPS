public class FinallyExample {
    public static void main(String[] args) {
        try{
            System.out.println("this is sarvjeet");//statement 1
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);//statement 2
            System.out.println("this is a sonu");//statement 
        }catch(ArithmeticException e){
            System.out.println("Exception catch");//statement 4
        }finally{
            System.out.println("This is always be printed");//statement 5
        }
        System.out.println("this is golu");//statement 2
    }
    
}
