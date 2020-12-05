import java.awt.*;
import java.util.*;
import javax.swing.*;

public class ShapeIcon implements Icon
{
    public ShapeIcon( int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public int getIconWidth()
    {
        return width;
    }

    public int getIconHeight()
    {
        return height;
    }

    public void paintIcon(Component c, Graphics g, int x, int y)
    {
        Graphics2D g2 = (Graphics2D) g;
        shape.draw(g2);
    }

    private int width;
    private int height;
    private CarShape shape;
}

