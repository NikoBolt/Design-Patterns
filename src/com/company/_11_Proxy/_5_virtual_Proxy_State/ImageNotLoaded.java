package com.company._11_Proxy._5_virtual_Proxy_State;

//import java.awt.*;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class ImageNotLoaded implements State {
    ImageProxy imageProxy;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageNotLoaded(ImageProxy imageProxy) {
        this.imageProxy = imageProxy;
    }

    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }

    @Override
    public void paintIcon(final Component c, Graphics  g, int x, int y) {
        g.drawString("Loading album cover, please wait...", x+300, y+190);


        if (!retrieving) { // проверка, началась ли загрузка
            retrieving = true;	// если нет, то МОЖНО начать

            // Создаем новый поток, чтобы загрузка не парализовала пользовательский интерфейс
            retrievalThread = new Thread(new Runnable() {
                public void run() {
                    try {
                        // СИНХРОННО загружается НАСТОЯЩЕЕ изображение
                        imageProxy.setImageIcon(new ImageIcon(imageProxy.imageURL, "Album Cover"));
                        // ImageIcon возвращает управление
                        c.repaint();
                        // оповещаем Swing о необходимости перерисовки
                        // Изображение прорисовывается на экране
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

            // Через лямбда
//				retrievalThread = new Thread(() -> {
//						try {
//							imageProxy.setImageIcon(new ImageIcon(imageProxy.imageURL, "Album Cover"));
//							c.repaint();
//						} catch (Exception e) {
//							e.printStackTrace();
//						}
//				});
            retrievalThread.start();

        }
    }
}
