package java_day13;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

public class Stock extends JFrame
{
	int wsize = 5;
	ArrayList<Double> a, mv;

	public Stock()
	{
		a = new ArrayList<Double>();

		try
		{
			File f = new File("C://java/BEAUTY.xls");
			Scanner sc = new Scanner(f);

			while (sc.hasNext())
			{
				String s = sc.nextLine();
				double x = Double.parseDouble(s);
				a.add(x);
			}
			sc.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}

		mv = new ArrayList<Double>();

		for (int k = 0; k < a.size(); k++)
		{
			if (k < wsize)
			{
				mv.add(0.0);
			} else
			{
				double sum = 0;
				for (int i = k - wsize; i < k; i++)
				{
					sum = sum + a.get(i);
				}
				double avg = sum / wsize;
				mv.add(avg);
			}
		}

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 700);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		for (int i = 1; i < a.size(); i++)
		{
			g.drawLine((int) ((i - 1) * 2), (int) (700 - a.get(i) * 14), (int) (i * 2),
					(int) (700 - a.get(i - 1) * 14));
			g.setColor(Color.RED);
		}

		for (int i = 0; i < mv.size(); i++)
		{
			g.drawLine((int) ((i - 1) * 2), (int) (700 - mv.get(i - 1) * 14), (int) (i * 2),
					(int) (700 - mv.get(i) * 14));
			g.setColor(Color.RED);
		}
	}
}
