import java.util.*;
import java.awt.*;
import javax.swing.*;
//import start.*;
public class starter extends Canvas {
	public static void main(String[] args) {
		DisplayGraphics m = new DisplayGraphics();
        JFrame f=new JFrame();  
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(m);  
        f.setSize(400,400);  
        //f.setLayout(null);  
        f.setVisible(true);  
    }
}
