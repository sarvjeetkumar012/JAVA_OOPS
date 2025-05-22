public class box {
    //WAP to define a class, describe its constructor,
    //overload the constructors and instantiat its object.
    float width;
    float height;
    float breath;

    box(){
        width=2.5f;
        height=2.5f;
        breath=2.5f;
    }
    box(float w,float h, float b){
        width=w;
        height=h;
        breath=b;
    }
    public float volume(){
        return width*breath*height;
    }
    public static void main(String[] args) {
        box b = new box();
        box b1 = new box(2,2,2);

        float vol =b.volume();
        float vol1 =b1.volume();

        System.out.println("volume by calling default constructor="+vol);
        System.out.println("volume by calling parameterized constructor="+vol1);

    }
}
