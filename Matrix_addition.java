import java.util.*;
public class Matrix_addition {
    public static void main(String[] args) {

        int size;
        int a[][], b[][], c[][];
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of array-- ");
        size = sc.nextInt();

        //taking  value for array a
        a = new int[size][size];
        System.out.println("enter the element of array of a-- ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("enter  a[" + i + "][" + j + "] -- ");
                a[i][j] = sc.nextInt();
            }
        }

        // Show array a
        System.out.println("Array a:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        //taking value for array b
        b = new int[size][size];
        System.out.println("enter the element of array of b-- ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print("enter  b[" + i + "][" + j + "] -- ");
                b[i][j] = sc.nextInt();
            }
        }

        // Show array b
        System.out.println("Array b:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        c = new int[size][size];
        System.out.println("matrix addition (c=a+b)--");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
