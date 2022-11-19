import java.applet.Applet;
import java.awt.*;

public class wind extends Applet
{
int angle1=90,angle2=210,angle3=330;
public void paint(Graphics g)
{
g.setColor(Color.gray);
int x[]={350,250,450};
int y[]={150,600,600};
g.fillPolygon(x,y,3);

try
{
g.setColor(Color.red);
	g.fillArc(222,30,250,250,angle1,30);
	g.fillArc(222,30,250,250,angle2,30);
	g.fillArc(222,30,250,250,angle3,30);
	
	g.setColor(Color.black);
	g.fillOval(341,145,20,20);
	{
	
	angle1=(angle1-1)%360;
	angle2=(angle2-2)%360;
	angle3=(angle3-3)%360;
	
	Thread.sleep(10);
	repaint();
	}
	}
	catch(Exception ex)
	{
	System.out.println("Problem while putting thread to sleep");
	}
	}
	}
