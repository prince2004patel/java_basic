//throws keyword is used to declare an exception.
//Throws is used with the method .
//You can declare multiple exceptions.

class throws_example
{
    static void divide() throws ArithmeticException
    {
        int a=8,d=0;
        a=42/d;
    }
    public static void main(String args[])
    {
        try
        {
            divide();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Please Enter Valid Data");
        }
    }
}