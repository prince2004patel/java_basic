//0,1,1,2,3,5,8,13,21,34,55,89,144 and so on
// work as 0+1 =1 , 1+1=2 , 1+2=3, 2+3=5, 3+5=8 , 5+8=13 , ...

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {

        int n, firstTerm=0 ,secondTerm=1 ;

        Scanner sc = new Scanner(System.in);
        System.out.println("how many number you want for fibonacci series--");
        n = sc.nextInt();
        System.out.println("fibonacci series  till " +n+ " terms--");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
