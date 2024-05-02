package java_day9;

import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JFrame;

public class d9_7_Ball2 extends JPanel
{
	Ball2[] balls;

	public d9_7_Ball2() // constructor
	{
		balls = new Ball2[10];
		for (int i = 0; i < balls.length; i++)
		{
			balls[i] = new Ball2();
		}

		Thread t = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				while (true)
				{
					try
					{
						Thread.sleep(20);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}

					for (int i = 0; i < balls.length; i++)
					{
						balls[i].move();
					}
					repaint();
				}
			}
		});

		t.start();
		JFrame f = new JFrame();
		f.add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 500);
		f.setVisible(true);
	}

	public void paint(Graphics g) // override
	{
		super.paint(g);
		for (int i = 0; i < balls.length; i++)
		{
			balls[i].draw(g);
		}
	}

	public static void main(String[] args)
	{
		new d9_7_Ball2();
	}

}
