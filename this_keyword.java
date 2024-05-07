//"this" is a reference variable that refers to the current object.

class Demo {
    int no;
    String name;

    Demo(int no, String name) {
        this.no = no;
        this.name = name;
    }

    void display() {
        System.out.println(no + " " + name);
    }
}
public class this_keyword{
       public static void main(String[] args) {

        Demo s1 = new Demo(324,"prince");
        Demo s2 = new Demo(330,"purv");

        s1.display();
        s2.display();
       }
}
