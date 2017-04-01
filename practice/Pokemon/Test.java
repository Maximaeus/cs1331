import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.ImageIcon;

/**
 * Testy stuff
 *
 * @author jmurphy61
 * @version 1.0
 *
 */
public class Test {
    public Path path = Paths.get("C:Users/jones/Pictures/Dank Memes/ha-got-heem.jpg");
    public ImageIcon dank = new ImageIcon(path.toString());
    
    /**
     * @param args unused
     *
     */
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.dank);
    }
}