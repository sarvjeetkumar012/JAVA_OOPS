public class UnchekedExceptionEX {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int c = a / b; // ArithmeticException (runtime error)
        System.out.println(c);
    }
}
