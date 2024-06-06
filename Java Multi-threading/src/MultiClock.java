import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MultiClock extends JFrame implements ActionListener, Runnable {

    JButton createClock = new JButton("new Clock");
    JLabel clock = new JLabel();
    JLabel dateLabel = new JLabel();
    Thread t;

    public MultiClock() {
        java.awt.Container cont = this.getContentPane();
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        clock = new JLabel(timeFormat.format(cal.getTime()), JLabel.CENTER);
        clock.setFont(new Font(clock.getFont().getName(), Font.PLAIN, 40));
        clock.setForeground(Color.RED);
        
        dateLabel = new JLabel(dateFormat.format(cal.getTime()), JLabel.CENTER);
        dateLabel.setFont(new Font(dateLabel.getFont().getName(), Font.PLAIN, 20));
        dateLabel.setForeground(Color.BLUE);

        cont.add(createClock, "North");
        cont.add(clock);
        cont.add(dateLabel, "South");
        this.pack();
        this.setVisible(true);
        createClock.addActionListener(this);
        Thread t = new Thread(this);
        t.start();

    }

    public void tick() {
        try {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            
            clock.setText(timeFormat.format(cal.getTime()));
            dateLabel.setText(dateFormat.format(cal.getTime()));
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            tick();
        }
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        Thread t = new Thread(new MultiClock());
        t.start();
    }

    public static void main(String[] a) {
        new MultiClock();
    }
}
