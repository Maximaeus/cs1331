import java.io.File;
import java.util.Scanner;
//This is a checked exception
import java.io.FileNotFoundException;

/**
 *
 *
 * @author jmurphy61
 * @version 1.0 Mar 14, 2017
 *
 */
public class Exceptions {
    public static void main(String[] args) throws Throwable {
        try {
            readFromFile();
        } catch (FileNotFoundException e) {
            System.out.println("The file could not be found");
        }
    }

    public static void readFromFile() throws FileNotFoundException {
        Scanner file = new Scanner(new File("file.txt"));
        System.out.println("Stuff");
        file.close();
    }

    public void foo() throws FileNotFoundException {
        File file = new File("stuff.txt");
    }
}
