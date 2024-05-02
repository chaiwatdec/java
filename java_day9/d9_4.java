package java_day9;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class d9_4 extends JFrame
{
	public d9_4()
	{
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		g.setColor(new Color(0, 0, 0));
		g.fillRect(0, 0, 600, 600);
		g.setColor(new Color(255, 0, 0));
		g.fillRect(80, 200, 250, 200);
		int[] c = new int[]
		{ 185, 225, 240, 225, 205, 185, 170 };
		int[] d = new int[]
		{ 200, 200, 190, 175, 190, 175, 185 };
		g.fillPolygon(c, d, 7);
		g.setColor(new Color(255, 125, 50));
		g.fillRect(80, 350, 250, 50);
		g.setColor(new Color(255, 255, 255));
		g.fillOval(150, 270, 60, 50);
		g.fillOval(200, 270, 60, 50);
		g.setColor(new Color(0, 0, 0));
		g.drawOval(150, 270, 60, 50);// line eye(red)
		g.drawOval(200, 270, 60, 50);// line eye(red)
		g.fillOval(185, 288, 20, 20);// black eye
		g.fillOval(204, 288, 20, 20);// black eye
		int[] x = new int[]
		{ 140, 120, 205, 300, 280, 205 };
		int[] y = new int[]
		{ 245, 275, 291, 280, 250, 275 };
		g.fillPolygon(x, y, 6);
		g.setColor(new Color(255, 180, 0));
		int[] a = new int[]
		{ 165, 205, 240, 255, 205 };
		int[] b = new int[]
		{ 350, 365, 350, 350, 320 };
		g.fillPolygon(a, b, 5);
		g.setColor(new Color(0, 0, 0));
		g.drawLine(165, 350, 255, 350);
		g.drawPolygon(a, b, 5);

		/*
		 * YELLOW BIRD
		 */

		g.setColor(new Color(255, 255, 20));// yellow
		int[] e = new int[]
		{ 400, 250, 550 };
		int[] f = new int[]
		{ 250, 500, 500 };
		g.fillPolygon(e, f, 3);
		g.setColor(new Color(255, 245, 98));// Light yellow
		int[] h = new int[]
		{ 430, 250, 550 };
		int[] i = new int[]
		{ 450, 500, 500 };
		g.fillPolygon(h, i, 3);
		g.setColor(new Color(255, 255, 255));
		g.fillOval(350, 400, 50, 40);// eye (yellow)
		g.fillOval(420, 400, 50, 40);
		g.setColor(new Color(169, 69, 20));
		g.drawOval(350, 400, 50, 40);// line eye yellow
		g.drawOval(420, 400, 50, 40);// line eye yellow
		g.setColor(new Color(255, 180, 0));
		int[] j = new int[]
		{ 360, 415, 445, 485, 420 };
		int[] k = new int[]
		{ 448, 460, 450, 450, 425 };
		g.fillPolygon(j, k, 5);
		int[] l = new int[]
		{ 420, 420, 470, 468 };
		int[] m = new int[]
		{ 405, 415, 395, 390 };
		int[] n = new int[]
		{ 400, 400, 350, 352 };
		g.fillPolygon(l, m, 4);// Brow
		g.fillPolygon(n, m, 4);
		g.setColor(new Color(0, 0, 0));
		g.fillOval(370, 415, 12, 10);// black eye
		g.fillOval(435, 415, 12, 10);
		g.drawPolygon(e, f, 3);// line mouth
		g.drawPolygon(j, k, 5);
		g.drawLine(360, 448, 485, 450);
		g.drawPolygon(l, m, 4);// line brow
		g.drawPolygon(n, m, 4);
	}

	public static void main(String[] args)
	{
		new d9_4();
	}
}
