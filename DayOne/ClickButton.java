import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClickButton {
    public static void main(String[] args) {
        int[] count = {0};

        JButton button = new JButton("Click me");
        JButton rButton = new JButton("Reset");
        JLabel countLabel = new JLabel("Count: " + count[0]);
        JFrame frame = new JFrame("Click Button");
        JPanel panel = new JPanel();

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(e -> count[0]++);
        rButton.addActionListener(e -> count[0] = 0);

        panel.add(button);
        panel.add(rButton);
        panel.add(countLabel);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        while (true) {
            countLabel.setText("Count: " + count[0]);
            System.out.println("Count: " + count[0]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
