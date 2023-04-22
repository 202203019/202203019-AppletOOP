import java.awt.*;  
import java.awt.Color;
import java.awt.Graphics;
import java.applet.Applet; 
public class Background extends Applet {
    Choice ch = new Choice();
    public void init(){
        setBackground(Color.white);
        ch.addItem("Orange");
        ch.addItem("Blue");
        ch.addItem("Red");
        ch.addItem("Yellow");
        ch.addItem("Green");
        add(ch);
        }
        public void paint(Graphics g) {
            String colour = ch.getSelectedItem();
            
        if(colour=="Orange"){
        setBackground(Color.orange);}
        if(colour=="Blue"){
        setBackground(Color.blue);}
        if(colour=="Red"){
        setBackground(Color.red);}
        if(colour=="Yellow"){
        setBackground(Color.yellow);}
        if(colour=="Green"){
        setBackground(Color.green);}
                        
        
    

    }
}