public class NullPointerExce {
   public static void main(String[] args) {
      String str1 = null;//isme koi change nhi hogi 
      String str = "sonu";
 try{
    System.out.println(str.toUpperCase());
    System.out.println(str1.toUpperCase());
 }   
 catch(NullPointerException n){
   System.out.println("null can't be casted");
 }
   }
}
