import javax.swing.JOptionPane;

public class GUIbasic {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null,"Your name is "+ name);

    }
    
}
