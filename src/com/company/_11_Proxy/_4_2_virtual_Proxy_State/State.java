package com.company._11_Proxy._4_2_virtual_Proxy_State;

import java.awt.*;

public interface State {

	int getIconWidth();
	int getIconHeight();
	void paintIcon(final Component c, Graphics  g, int x, int y);
}
