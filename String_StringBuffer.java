//string is basically an object that represents sequence of char values.
//An array of characters works same as Java string

//There are two ways to create String object:
//1.By string datatype ---- String s = "welcome";
//2.By new keyword ----  String s = new String("welcome");

//string buffer is used to created modifiable string  object
//create by new keyword

public class String_StringBuffer {
    public static void main(String[] args) {
        String a = "prince";
        String b = new String("patel");
        StringBuffer c = new StringBuffer("hyy");
        StringBuffer d = new StringBuffer("hello");
        StringBuffer e= new StringBuffer("hi");
        StringBuffer f = new StringBuffer("hy");


        System.out.println(a.charAt(1));  // r
        System.out.println(a.length());   //6

        System.out.println(b.toUpperCase()); //PATEL

        System.out.println(a.concat(b)); //princepatel
        System.out.println(b.indexOf("e")); //3


        System.out.println(c.insert(2,"PRINCE")); //hePRINCEy
        System.out.println(d.replace(1,4,"ELL")); // hELLo
        System.out.println(e.reverse()); //ih
        System.out.println(f.append("hy")); //hyhy
        
    }
}
