import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class PkmnGame extends JFrame {

    JPanel panel = new JPanel();
    JButton button = new JButton("Stuff");
    JTextField text = new JTextField("Yo");
    JTextArea area = new JTextArea("what\nis\nup?");

    public static void main(String[] args) {
        PkmnGame mainWindow = new PkmnGame();
    }

    public PkmnGame() {
        super("Pokemon Overworld");
        setSize(400,300);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel.add(button);
        panel.add(text);
        panel.add(area);
        add(panel);

        setVisible(true);
    }
}