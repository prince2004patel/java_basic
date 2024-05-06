//copy constructor is used  to declare one object  using another object

class Student {
    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Copy constructor
    Student(Student s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Copy_constructor {
    public static void main(String[] args) {
        Student s1 = new Student(324, "prince");
        Student s2 = new Student(s1);

        s1.display(); // Outputs: 324 prince
        s2.display(); // Outputs: 324 prince
    }
}