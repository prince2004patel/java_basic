//constructor is special method that automatically called when object is created
//constructor has same name of class
//Java constructor cannot be abstract, static, final, and synchronized

//A constructor is called "Default Constructor" when it doesn't have any parameter.
class Box
{
    double width;
    double height;
    double depth;

    Box ( )
    {
        System.out.println(" Constructing Box ");
        width = 10;
        height = 10;
        depth = 10;
    }
    double volume( )
    {

        return width * height * depth;
    }
}
public class Default_construactor {

    public static void main(String args[])
    {
        Box myBox1 = new Box();
        double vol;
        vol = myBox1.volume();
        System.out.println(" Volume is "+vol);

    }
}