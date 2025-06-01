public class NestedFInallyBlockEX {
    public static void main(String[] args) {
        try{
            int a=10,b=0,c=a/b;
            System.out.println(c);
        }catch(Exception e){
            System.out.println("can not divided by zero");
        }finally{
            try{
                int arr[]={4,5,6,6,7};
                System.out.println(arr[8]);
            }catch(ArrayIndexOutOfBoundsException a){
                System.out.println("given index se jayda index print nhi hoga");
            }finally{
                System.out.println("Inner finally block ");
            }
            System.out.println("outer finally block ");
        }
    }
}
