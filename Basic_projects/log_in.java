//Here i coded log in screen
import java.awt.event.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class log_in extends JFrame {
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    JButton b1, b2, b3;
    log_in(String s){
        super(s); 
        // When we will pass string while creating object child class constructur will automatically call
        //parent class constructor....
    }
    log_in(){
        //This constructor is just to insure that a error should not came if user does not pass any value at the
        //time of object creation...
    }
    void setComponets(){
        Cursor c1 =new Cursor(Cursor.HAND_CURSOR );//To show curson on buttom, creating object.
        Font f1 =new Font("Times New Roman",Font.BOLD,28);//To customize font

       l1 = new JLabel("Welcomw to StockX");
       l1.setFont(f1);
       l1.setForeground(Color.RED);
       l2 = new JLabel("USERNAME");
       l3 = new JLabel("PASSWORD");
       l4 = new JLabel();
       t1 = new JTextField();
       t2 = new JTextField();
       b1 = new JButton("Login");
       b1.setBackground(Color.GREEN);
       b1.setForeground(Color.white);
       b2 = new JButton("Clear");
       b2.setBackground(Color.RED);
       b2.setForeground(Color.WHITE);
       b3=new JButton("AutoFill");

       setLayout(null);//to keep elements as we arrange them

       add(l1);
       add(l2);
       add(l3);
       add(l4);
       add(t1);
       add(t2);
       add(b1);
       add(b2);
       add(b3);
       l1.setBounds(200, 50, 300, 30);
       l2.setBounds(150, 150, 100, 30);
       l3.setBounds(150, 300, 100, 30);
       l4.setBounds(100, 500, 400, 30);
       t1.setBounds(350, 150, 100, 30);
       t2.setBounds(350, 300, 100, 30);
       b1.setBounds(150,450, 100, 30);
       b2.setBounds(350, 450, 100, 30);
       b1.addActionListener(new log());
       b1.setCursor(c1);
       b2.addActionListener(new clear());
       b2.setCursor(c1);
       b3.setBounds(450, 500, 100, 30);
       b3.addActionListener(new auto() );
       b1.addMouseListener(new MouseL());
       b2.addMouseListener(new MouseL());
       
    }
    public static void main(String[] args) {
        //JFrame j1 =new JFrame("Welcome to Facebook");//Jframe is class that contain methods so we made oject of that class.
        //we can also extend our Log_in class with jframe and use all its function
        log_in j1=new log_in("Welcome to StockX");
        j1.setVisible(true);//its used to show jframe 
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to close the program once we close the frame 
        //the frame is looking to small so we will set size for it 
        j1.setSize(600, 600);
        j1.setComponets();
    }
    class log implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           String s1 = t1.getText();
           String s2 = t2.getText();
           if(s1.equals("StockExplorer") && s2.equals("1234")){
            JOptionPane.showMessageDialog(null, "Login Sucessful....");
            l4.setText("");
           }
           else{
            JOptionPane.
            showMessageDialog(null,
            "Wrong Username or Password....","Login Error",
            JOptionPane.ERROR_MESSAGE );
            l4.setText("");
           }
        }
    }
    class MouseL implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
             b1.setForeground(Color.BLACK);
             b2.setForeground(Color.BLACK);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            b1.setForeground(Color.WHITE);
            b2.setForeground(Color.WHITE);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
           
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

    }
    class clear implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           t1.setText("");
           t2.setText("");
        }
    }
    class auto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           t1.setText("StockExplorer");
           t2.setText("1234");
        }

}
    }
