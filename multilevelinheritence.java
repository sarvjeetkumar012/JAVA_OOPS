//multilevel inheretence
class tata{
    int speed; double avg;
    String colour , type ;
    
    void input(){
        System.out.println("details of tata cars:");
    } 
}
class nexon extends tata{
    void disp(){
        speed=200; avg=23.5;colour="black";
        System.err.println(speed+" "+avg+" "+ "+colour");
    }
}
class curv extends nexon{
    void show(){
        type = "ev"; 
        System.err.println(speed+" "+avg+" "+ "+colour"+" "+ " "+"ev");
    }
}
public class multilevelinheritence {
    public static void main(String[] args) {
        curv r = new curv();
        r.input();r.disp();r.show();
        
    }
}
