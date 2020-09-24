package com.company._8_TemplateMethod._10_Applet;

import java.applet.Applet;
import java.awt.*;

public class MyAplet extends Applet {
    private static final long serialVersionUID = 2L;
    String message;

    // перехватчик
    public void init() {
        message = "Hello World, I'm alive!";
        repaint();
    }

    // перехватчик
    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }

    // перехватчик
    public void stop() {
        message = "Oh, now I'm being stopped...";
        repaint();
    }

    // перехватчик
    public void destroy() {
        // Аплет уничтожается
        message = "Goodbye, cruel world";
        repaint();
    }

    // перехватчик
    public void paint(Graphics g) {
        g.drawString(message,5,15);
    }
}
