
class MyException extends Exception
{
    public MyException(String msg)
    {
        super(msg);
    }
}
class user_defined_exception
{
    static void div() throws MyException
    {
        int a=2,b=0;
        if(b==0)
            throw new MyException("demo");
        else
        {
            int ar=a/b;
        }
    }
    public static void main(String args[])
    {
        try
        {
            div();
        }
        catch(MyException e)
        {
            System.out.println("Divide problem");
        }
    }
}