import javax.swing.*;

public class SimpleFrame extends JFrame{
    JButton abort = new JButton("Abort");
    JButton retry = new JButton("Retry");
    JButton fail = new JButton("Fail");

    public SimpleFrame() {
        super("Button Frame");
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JPanel pane = new JPanel();
        pane.add(abort);
        pane.add(retry);
        pane.add(fail);
        setContentPane(pane);
    }

    public static void main(String[] args) {
        SimpleFrame sf = new SimpleFrame();
        sf.show();
    }
}
