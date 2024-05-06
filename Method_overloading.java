//If a class has multiple methods having same name but different in parameters,
// it is known as Method Overloading.

//There are two ways to overload the method in java
//1.By changing number of arguments
//2.By changing the data type
class adder{
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }

    static double add(double a, double b, double c){
        return a+b+c;
    }
}
public class Method_overloading {
    public static void main(String[] args) {
        System.out.println(adder.add(11,10));
        System.out.println(adder.add(11,10,9));
        System.out.println(adder.add(11.10,10.9,9.8));
    }
}
