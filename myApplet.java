import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class myApplet extends Applet implements ActionListener
{
    String name =" ";
    String print=" ";
    TextField n = new TextField(10);
    Label l1 = new Label("Enter name: ");
    Button b1 = new Button("Output");
    public void init()
    {
        add(l1);
        add(n);
        add(b1);
        b1.addActionListener(this);
    }
    public void paint(Graphics g)
    {
	g.drawString(print,100,200);
    }
    public void actionPerformed(ActionEvent e){
        name = n.getText();
        if(name.length()>0){
        print = "Hello "+name;
        repaint();
    }
    else{
        print = "";
        repaint();
    }
    }
    
     
}