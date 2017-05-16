package de.suchomsky.Images;

import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;

class ClipMover extends MouseInputAdapter
{
    Cropping cropping;
    Point offset;
    boolean dragging;

    public ClipMover(Cropping c)
    {
        cropping = c;
        offset = new Point();
        dragging = false;
    }

    public void mousePressed(MouseEvent e)
    {
        Point p = e.getPoint();
        if(cropping.clip.contains(p))
        {
            offset.x = p.x - cropping.clip.x;
            offset.y = p.y - cropping.clip.y;
            dragging = true;
        }
    }

    public void mouseReleased(MouseEvent e)
    {
        dragging = false;
    }

    public void mouseDragged(MouseEvent e)
    {
        if(dragging)
        {
            int x = e.getX() - offset.x;
            int y = e.getY() - offset.y;
            cropping.setClip(x, y);
        }
    }
}