import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Demo extends Frame{
public Demo(){
    addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    });
}
public void paint(Graphics g){
    g.drawLine(20, 40, 100, 90);
    g.drawRect(20,50, 100, 50);    
}
public static void main(String[] args) {
    Demo appwin= new Demo();
    appwin.setSize(new Dimension(370,700));
    appwin.setTitle("Graphics Demo ");
    appwin.setVisible(true);
}
    
}
