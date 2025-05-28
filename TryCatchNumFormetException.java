//Execution process of try and catch // Number FOrmet Execution

public class TryCatchNumFormetException {
    public static void main(String[] args) {
    String str = "123";
    try{
        int a = Integer.parseInt(str);
        System.out.println(a);
    }
    catch(NumberFormatException n){
        System.out.println("String " +str+" can't be converted to Integer");
    }
    System.out.println("Main method ended ");
    }
}
