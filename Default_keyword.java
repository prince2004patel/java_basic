//If you don't use any modifier, it is treated as default by default.
// The default modifier is accessible only within package.
// It cannot be accessed from outside the package. It provides more accessibility than private.
// But, it is more restrictive than protected, and public.

package mypack4;
import packOFdefault_keyword.*;
class Default_keyword{
    public static void main(String args[]){
        D obj = new D();//Compile Time Error
        obj.msg4();//Compile Time Error
    }
}