public class CustomEx2 {
    public void check(int a,int b) throws NumberException{
        if (a<1&&b>1){
            NumberException ne = new NumberException(" raise exception");
            throw ne ;
        }
        else{
            System.out.println("you can do ");
        }
    }
    public static void main(String[] args) {
        CustomEx2 c = new CustomEx2();
        try{
            c.check(29,57);
        }
        catch(NumberException e){
            System.out.println("cosider the error" +e);
        }
    }
}
