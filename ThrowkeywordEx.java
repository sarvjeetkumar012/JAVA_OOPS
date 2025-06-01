public class ThrowkeywordEx {
    
    public static void show(int age){
        if (age<18) {
           throw new ArithmeticException("Access denied: You must be 18+ to vote.");
        }else{
            System.out.println("access grante: you can vote ");
        }
    }
    public static void main(String[] args) {
        ThrowkeywordEx t = new ThrowkeywordEx();
        t.show(15);   //this will throw exception
    }

}
