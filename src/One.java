import javax.swing.*;

public class One {
    private JPanel rootPanel;
    private JButton button1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("One");
        frame.setContentPane(new One().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
