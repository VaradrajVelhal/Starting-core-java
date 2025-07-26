import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Digital_Clock extends JFrame{
    JLabel l1;
    JLabel l2;
    SimpleDateFormat s1,s2;
    Digital_Clock(String str){
        super(str);
    }
    Digital_Clock(){}
    void setComponents(){
        l1 = new JLabel("TIme");
        l2 = new JLabel();
        l1.setFont(new Font("Verdhana",Font.BOLD,50));
        Color c1 = Color.WHITE;
        Color c2 = c1.brighter();
        l1.setForeground(c2);
        l1.setBackground(Color.black);
        l1.setOpaque(true);

        l2.setFont(new Font("Verdhana",Font.BOLD,50));
        l2.setForeground(c2);
        l2.setBackground(Color.black);
        l2.setOpaque(true);

        setLayout(null);
        add(l1);
        add(l2);
        l1.setBounds(100,50,300,100);
        l2.setBounds(100,300,300,100);
        s1 = new SimpleDateFormat("hh:mm:ss a");
        s2 = new SimpleDateFormat("dd:MM:yyyy");
        String time,day;
        
        while (true) {
            time = s1.format(Calendar.getInstance().getTime());
            l1.setText(time);
            day = s2.format(Calendar.getInstance().getTime());
            l2.setText(day);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
    public static void main(String[] args) {
        Digital_Clock d1 = new Digital_Clock("Digital Clock");
        d1.setVisible(true);
        d1.setSize(500,500);
        d1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        d1.setComponents();
    }
}
