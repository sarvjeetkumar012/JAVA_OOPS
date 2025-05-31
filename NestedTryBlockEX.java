public class NestedTryBlockEX {
    public static void main(String[] args) {
        try{//outer try block
            int a=10,b=2,c=a/b;
            System.out.println(c);
            try{//inner try block
                int arr[]={4,5,6,7,8,9};
                System.out.println(arr[8]);
            }catch(Exception e){//inner catch block 
                System.out.println(e);
                System.out.println("you can not find element of 8th index");
            }
        }catch(Exception e){//oter catch block
            System.out.println(e);
        }
        System.out.println("main method closed ");
    }
}
