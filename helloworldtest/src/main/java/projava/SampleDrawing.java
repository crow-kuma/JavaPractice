package projava;

import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SampleDrawing {
	public static void main(String[] args) {
		var f = new JFrame("drawing");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

		var label = new JLabel("test");
		f.add(label);

		var image = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
		label.setIcon(new ImageIcon(image));
		f.pack();

		var g = image.createGraphics();
		g.drawLine(0, 0, 600, 400);
		label.repaint();
		g.setColor(Color.RED);
		g.fillRect(300, 200, 150, 100);
		label.repaint();
		g.setColor(Color.GREEN);
		g.drawLine(0, 400, 600, 0);
		label.repaint();
		g.setColor(Color.BLUE);
		g.fillOval(200, 300, 100, 100);
		label.repaint();
	}
}
