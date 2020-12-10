package com.company._11_Proxy._4_1_virtualProxy;

//import javax.swing.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
//import java.awt.*;
import java.awt.Component;
import java.awt.Graphics;
//import java.net.*;
import java.net.URL;

class ImageProxy implements Icon {
	volatile ImageIcon imageIcon; // Хранится настоящий объект
	final URL imageURL;
	Thread retrievalThread;
	boolean retrieving = false;
     
	public ImageProxy(URL url) { // Передается адрес изображения,
		imageURL = url; 		// которое бедет отображаться на странице
	}

	// До завершения загрузки ширина и высота возвращается по умолчанию
	public int getIconWidth() {
		if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
			return 800;
		}
	}
 
	public int getIconHeight() {
		if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
			return 600;
		}
	}

	// volatile для защиты чтения
	// synchronized для защиты операции записи
	synchronized void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}


	// Метод вызывается тогда, когда надо перерисовать изображение
	public void paintIcon(final Component c, Graphics  g, int x, int y) {
		if (imageIcon != null) {
				// Если оюъект уже создан, то требование о перерисовке передаем ему
			imageIcon.paintIcon(c, g, x, y);
		} else {
				// Иначе выводится сообщение о загрузке
			g.drawString("Loading album cover, please wait...", x+300, y+190);

				// Загружается НАСТОЯЩЕЕ изображение
			if (!retrieving) { // проверка, началась ли загрузка
				retrieving = true;	// если нет, то МОЖНО начать

					// Создаем новый поток, чтобы загрузка не парализовала пользовательский интерфейс
				retrievalThread = new Thread(new Runnable() {
					public void run() {
						try {
								// СИНХРОННО загружается НАСТОЯЩЕЕ изображение
							setImageIcon(new ImageIcon(imageURL, "Album Cover"));
									// ImageIcon возвращает управление
							c.repaint();
								// оповещаем Swing о необходимости перерисовки
								// =================
								// Изображение прорисовывается на экране
								// =================
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});

				// Через лямбда
//				retrievalThread = new Thread(() -> {
//						try {
//							setImageIcon(new ImageIcon(imageURL, "Album Cover"));
//							c.repaint();
//						} catch (Exception e) {
//							e.printStackTrace();
//						}
//				});
				retrievalThread.start();
				
			}
		}
	}
}
