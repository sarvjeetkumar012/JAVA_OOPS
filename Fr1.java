import java.awt.*;

public class Fr1 extends Frame {
    Panel p1;
    Label l1, l2, l3, l4;
    TextField tf1, tf2;
    Button b1;
    Choice c;
    Checkbox cb1, cb2, cb3, cb4;
    Checkbox genderMale, genderFemale;
    CheckboxGroup genderGroup;
    TextArea ta;

    public Fr1() {
        super("My First Frame");
        setSize(500, 600);
        setVisible(true);

        p1 = new Panel();
        p1.setLayout(new FlowLayout());
        add(p1);

        l1 = new Label("User Name");
        l2 = new Label("Password");
        l3 = new Label("Choice");
        l4 = new Label("Gender");

        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf2.setEchoChar('*');

        b1 = new Button("Submit");

        c = new Choice();
        c.add("UP");
        c.add("Bihar");
        c.add("Haryana");

        cb1 = new Checkbox("Singing");
        cb2 = new Checkbox("Dancing");
        cb3 = new Checkbox("Rafting");
        cb4 = new Checkbox("Running");

        // CheckboxGroup for gender (Radio button behavior)
        genderGroup = new CheckboxGroup();
        genderMale = new Checkbox("Male", genderGroup, true);
        genderFemale = new Checkbox("Female", genderGroup, false);

        ta = new TextArea(4, 30);

        // Add components to panel
        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);

        p1.add(l3);
        p1.add(c);

        p1.add(cb1);
        p1.add(cb2);
        p1.add(cb3);
        p1.add(cb4);

        p1.add(l4);
        p1.add(genderMale);
        p1.add(genderFemale);

        p1.add(ta);
        p1.add(b1);
    }

    public static void main(String[] args) {
        new Fr1();
    }
}
