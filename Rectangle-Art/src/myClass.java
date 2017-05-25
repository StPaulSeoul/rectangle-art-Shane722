import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class myClass extends JPanel {
	private static final long serialVersionUID = 1L;
	public static Dimension size;

	public myClass() {
		super();
		setBackground(Color.BLACK);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		g2.setColor(Color.GREEN);
		Rectangle2D a = new Rectangle2D.Double(0, 0, 400, 600);
		Rectangle2D b = new Rectangle2D.Double(300, 500, 150, 150);
		Rectangle2D c = new Rectangle2D.Double(100, 250, 200, 500);
		g2.fill(a);
		g2.fill(b);
		g2.fill(c);

		g2.setColor(Color.GREEN);
		Rectangle2D d = new Rectangle2D.Double(100, 550, 440, 980);
		Rectangle2D e = new Rectangle2D.Double(600, 450, 0, 450);
		Rectangle2D f = new Rectangle2D.Double(1300, 0, 400, 200);
		g2.fill(d);
		g2.fill(e);
		g2.fill(f);

		g2.setColor(Color.YELLOW);
		Rectangle2D h = new Rectangle2D.Double(400, 0, 800, 400);
		Rectangle2D i = new Rectangle2D.Double(950, 800, 700, 200);
		Rectangle2D j = new Rectangle2D.Double(1000, 500, 200, 100);
		g2.fill(h);
		g2.fill(i);
		g2.fill(j);

		g2.setColor(Color.BLACK);
		Rectangle2D k = new Rectangle2D.Double(600, 400, 500, 750);
		Rectangle2D l = new Rectangle2D.Double(500, 900, 300, 300);
		Rectangle2D m = new Rectangle2D.Double(1720, 500, 1000, 400);
		g2.fill(k);
		g2.fill(l);
		g2.fill(m);

	}

	public void setupDisplay() {
		JFrame application = new JFrame();
		application.add(this);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(1920, 1080);
		application.setExtendedState(JFrame.MAXIMIZED_BOTH);
		application.setUndecorated(true);
		application.setVisible(true);
		size = application.getSize();
	}

	public static void main(String[] args) {
		myClass program = new myClass();
		program.setupDisplay();

		program.repaint();
	}
}
