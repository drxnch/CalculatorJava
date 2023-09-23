
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {

  JButton button;
  JLabel label;
  int count;

  MyFrame() {

    // Creating an image
    ImageIcon icon = new ImageIcon("SleepyMonkeyGif.gif");
    ImageIcon icon2 = new ImageIcon("WOW.png");

    // CRaeting label to see button change something
    label = new JLabel();
    label.setIcon(icon2);
    label.setBounds(150, 250, 150, 150);
    label.setVisible(false);

    // Setting Up Buttons Here
    button = new JButton();
    button.setBounds(100, 500, 50, 50);
    button.addActionListener(this);
    button.setText("1");
    button.setFocusable(false);
    button.setIcon(icon);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(500, 800);
    this.setVisible(true);
    this.add(button); // We need to add the button to the frame afterwards
    this.add(label);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      count++;
      System.out.println(count);
    }
  }
}

