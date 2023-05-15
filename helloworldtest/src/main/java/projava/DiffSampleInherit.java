package projava;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.function.Consumer;


public class DiffSampleInherit {
	public static void main(String[] args) {
		var f = new JFrame("差分プログラミング");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		var img = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
		var g = img.createGraphics();
		g.setBackground(Color.WHITE);
		g.clearRect(0, 0, 600, 400);
		g.drawImage(lineImage(), 10, 10, f);
		g.drawImage(rectImage(), 300, 80, f);
		var label = new JLabel(new ImageIcon(img));
		f.add(label);
		f.pack();
		f.setVisible(true);
	}

	@FunctionalInterface
	interface ImageDrawer {
		static BufferedImage createImage(Consumer<Graphics2D> drawer) {
			var image = new BufferedImage(250, 200, BufferedImage.TYPE_INT_RGB);
			var graphics = image.createGraphics();
			drawer.accept(graphics);
			return image;
		}
		
		void draw(Graphics2D g);
	}

	static BufferedImage lineImage() {
		return ImageDrawer.createImage(g -> g.drawLine(10, 10, 220, 180));
		// ImageDrawer drawer = g -> g.drawLine(10, 10, 220, 180);
		// return drawer.createImage();
	}

	static BufferedImage rectImage() {
		return ImageDrawer.createImage(g -> g.drawRect(10, 10, 200, 150));
	}
}
