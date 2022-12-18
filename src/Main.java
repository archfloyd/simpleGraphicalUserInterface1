import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is your name");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "how old are you "+name));
        JOptionPane.showMessageDialog(null, "you are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog(null, "enter your height"));
        JOptionPane.showMessageDialog(null, "you are "+height+" cm tall");
    }
}