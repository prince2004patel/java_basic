//Protected: The access level of a protected modifier is within the package
// and outside the package through child class.
// If you do not make the child class, it cannot be accessed from outside the package.

//The protected access modifier is accessible within package and outside the package but through inheritance only


package mypack2;
import packOFprotected_keyword.*;

class Protected_keyword extends B {
    public static void main(String args[]){
        Protected_keyword obj = new Protected_keyword();
        obj.msg2();
    }
}

/* see the file B */