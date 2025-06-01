public class FinalKeywordeX {
    final int a = 10; // variable a cannot be changed

    final class MyClass {
        final void show() {
            System.out.println("this is final method, a = " + a);
        }
    }

    public static void main(String[] args) {
        FinalKeywordeX f = new FinalKeywordeX();
        MyClass obj = f.new MyClass();
        obj.show();
    }
}