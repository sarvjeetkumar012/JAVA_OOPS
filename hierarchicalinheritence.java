//hirerchical inhertence
class Ipl{
    int run ,ballfaced,four;
    String playername;
    void show(){
        System.out.println("this is ipl players record : ");
    }
}   
class Rcb extends Ipl{
    void disp(){
        run =34563;ballfaced=4000;four=450;
        playername="virat kohli";
        System.out.println(run + " "+ ballfaced+ " " + four+ " "+playername);
    }
} 
class Mi extends Ipl{
    void disp1(){
        run= 28453;ballfaced=3500;four=420;
        playername="Rhit sharma ";
        System.out.println(run+ " "+ballfaced+" "+four+ " "+ playername);
    }
}  
class Gt extends Ipl  {
    void disp2(){
        run= 14569;ballfaced=2000;four=320;
        playername="Subhamn gill";
        System.out.println(run+" "+ballfaced+" "+four+" "+playername);
    }
}                             
public class hierarchicalinheritence {
    public static void main(String[] args) {
        Rcb r = new Rcb();
        Mi m = new Mi();
        Gt g = new Gt();
        r.show();
        r.disp();
        m.show();
        m.disp1();
        g.show();
        g.disp2();
    } 
    
}
