package com.company._11_Proxy._4_1_virtualProxy;

//import javax.swing.*;
import javax.swing.JComponent;
import javax.swing.Icon;
//import java.awt.*;
import java.awt.Graphics;

class ImageComponent extends JComponent {
	private static final long serialVersionUID = 1L;
	private Icon icon;

	public ImageComponent(Icon icon) {
		this.icon = icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int w = icon.getIconWidth();
		int h = icon.getIconHeight();
		int x = (800 - w)/2;
		int y = (600 - h)/2;
		icon.paintIcon(this, g, x, y);
	}
}
