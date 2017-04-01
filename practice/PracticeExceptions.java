// Sentinel values: cases (values) that represent errors
// Ex. in C: NullTerminatedString
import java.io.File;

public class PracticeExceptions {
    public static void main(String[] args) {
        Object[] employees = new Object[10];
        File employeeDataFile = new File("car.txt");
        
        try {
            // Code that may throw an exception
        } catch (Exception e) {
            // Code that is executed if an exception is
            // thrown in the try-block above
        }

        try {
            employees = File.initFromFile(employeeDataFile);
        } catch (FileNotFoundException e) {
            System.out.println("Need an employee data file.");
            System.out.println(e.getMessage());
        }
    }
}