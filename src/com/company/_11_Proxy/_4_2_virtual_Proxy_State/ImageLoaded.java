package com.company._11_Proxy._4_2_virtual_Proxy_State;

//import java.awt.*;
import java.awt.Component;
import java.awt.Graphics;

public class ImageLoaded implements State {
    ImageProxy imageProxy;

    public ImageLoaded(ImageProxy imageProxy) {
        this.imageProxy = imageProxy;
    }

    @Override
    public int getIconWidth() {
        return imageProxy.imageIcon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return imageProxy.imageIcon.getIconHeight();
    }

    @Override
    public void paintIcon(final Component c, Graphics  g, int x, int y) {
        imageProxy.imageIcon.paintIcon(c, g, x, y);
    }
}
