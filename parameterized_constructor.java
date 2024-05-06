//A constructor which has a specific number of parameters is called a parameterized constructor

class Box2
{
    double width;
    double height;
    double depth;
    Box2 (double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    double volume( )
    {
        return width * height * depth;
    }
}
public class parameterized_constructor {
    public static void main(String args[])
    {

        Box2 myBox1 = new Box2(3, 6, 9);
        double vol;
        vol = myBox1.volume();
        System.out.println(" Volume is "+ vol);
    }
}