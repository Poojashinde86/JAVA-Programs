import java.applet.Applet;
import java.awt.*;

public class rectangle extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.RED);
g.drawString("Welcome to the World of Applet",20,100);
g.setColor(Color.BLACK);
}
}
/*
<html>
<body>
<applet code="rectangle.class" width="1000" height="500">
</applet>
</body>
</html>
*/
