//this program copy the content of file1 to paste file2
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileCopy{
    public static void main(String[] args) throws IOException {
        FileInputStream r = new FileInputStream("C:\\Users\\91635\\java_basic\\src\\file1");
        FileOutputStream w = new FileOutputStream("C:\\Users\\91635\\java_basic\\src\\file2");

        int i;
        while((i=r.read())!= -1){
            w.write((char)i);
        }
        System.out.println("data copied successfully");
    }
}
