public class NestedCatchBlockEX {
    public static void main(String[] args) {
        try{
            int a=10,b=0,c=a/b;
        }catch(ArithmeticException e){
            System.out.println(" a & b can't divided by zero");
            try{
                String s =null;
                System.out.println(s.toLowerCase());
            }catch(NullPointerException n){
                System.out.println("null value can't converted");
            }
        }
        System.out.println("main method ended");
    }
}
