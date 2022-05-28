import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] a = new int[5];
        int sum = 0;
	Scanner input = new Scanner(System.in);	
	int number = input.nextInt();
        for (int i = 0; i <= number; i++) { // BAD
            sum += a[i];
        }
    }

    public static void introduceIssue() {

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("may_not_exist.txt"));
        } catch (FileNotFoundException e) {
            // ask the user and try again
        } catch (IOException e) {
            // more serious, abort
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    /* ignore */ }
            }
        }
    }

    public void createDir(File dir) {
        if (dir != null || !dir.exists()) // BAD
            dir.mkdir();

        Boolean done = false;
        while (!done) {
            // ...
            done = true;
            // ...
        }
    }
}
