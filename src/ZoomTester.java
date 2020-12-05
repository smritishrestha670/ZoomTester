import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JLabel;

public class ZoomTester {

    private static CarShape car;
    private static JLabel label;

    public static ActionListener ZoomInOutButtonListener(final double factor ) {
        return new
                ActionListener()
                {
                    public void actionPerformed(ActionEvent event) {
                        int Width = (int) (factor*car.getWidth());
                        //minimum width will be 15pixels
                        if(Width < 15)
                            Width = 15;
                        car.setWidth(Width);
                        label.repaint();//repainting the car depending on users zoom in or out 
                    }
                };
    }

    public static void main(String[] args) {
    	// creating a frame to add other JComponents
        JFrame frame = new JFrame();
        //Creating a Zoom In button
        JButton zoomIn = new JButton("ZoomIn");
        //if user clicks zoomin button actionlistner gets called and the icon of car get enlarged by 1.2x
        zoomIn.addActionListener(ZoomInOutButtonListener(1.2));
        //Creating a Zoom Out button
        JButton zoomOut = new JButton("ZoomOut");
        //if user clicks zoom out button actionlistner gets called and the icon of car get minimized by 1.2x
        zoomOut.addActionListener(ZoomInOutButtonListener(0.8));
        
        JPanel buttons = new JPanel();
        buttons.add(zoomIn);//adding Zoom In button to the panel 
        buttons.add(zoomOut);//adding Zoom Out  button to the panel 
        frame. add(buttons, BorderLayout.PAGE_END);//deciding location of button to the end of the page with BorderLayout
        car = new CarShape(40,40,100);//Initial size of the car icon as viewed 
        label = new JLabel(car);
    
        frame.add(label, BorderLayout.CENTER);//locating the car in the center of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.pack();
        frame.setVisible(true);
    }
}
