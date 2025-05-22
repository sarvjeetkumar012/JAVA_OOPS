//method overriding example
class shape{
    void show(){
        System.out.println("can not difine");
    }
}
class circle extends shape{
  @Override
    void show(){
        System.out.println("this shape is circle ");
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        shape r = new circle();
        r.show();
    }
}
