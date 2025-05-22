//abstract method example
abstract class programming{
    public abstract void developer();
}
class Html extends programming{
    @Override
    public void developer(){
        System.out.println("tim");
    }
}
class java extends programming{
    @Override
    public void developer(){
        System.out.println("james goslin");
    }
}
public class abstractmethod {
    public static void main(String[] args) {
        programming h = new Html();
        h.developer();
        programming j = new java();
        j.developer();
    }
}
