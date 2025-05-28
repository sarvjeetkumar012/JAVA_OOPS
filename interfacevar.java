interface customerRaj  {
    int amount = 5; // public + static + final
    public abstract void purchase(); // public + abstract 
}

class sellerSanju implements customerRaj {
    @Override
    public void purchase() {
        // amount = 5 final
        System.out.println("Raj needs " + amount + " kg rice");
    }
}

public class interfacevar {
    public static void main(String[] args) {
        customerRaj c = new sellerSanju();
        c.purchase();
        System.out.println(customerRaj.amount);
    }
}