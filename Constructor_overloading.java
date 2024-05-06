//if constructor have same and different parameter , it is called constructor overloading
//it's done by using two method
//1. changing the number of argument
//2. changing the data type

class box3{
    double width,height,deapth;

    box3(double w,double h, double d){
        width = w;
        height = h;
        deapth = d;
    }

    box3(){
        width=0;
        height=0;
        deapth=0;
    }

    box3(double len){
        width=height=deapth=len;
    }

    double volume(){
        return width*height*deapth;
    }
}
public class Constructor_overloading {
    public static void main(String[] args) {
        box3 mybox1 = new box3(10,20,30);
        box3 mybox2 = new box3();
        box3 mybox3 = new box3(12);

        double vol;
        vol =   mybox1.volume();
        System.out.println("volume of mybox1 is " + vol);

        vol =   mybox2.volume();
        System.out.println("volume of mybox2 is " + vol);

        vol =   mybox3.volume();
        System.out.println("volume of mybox3 is " + vol);


    }

}
