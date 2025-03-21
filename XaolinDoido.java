package emanuelSilva;
import robocode.*;
import java.awt.Color;

/**
 * MyClass - a class by (Emanuel da Silva Coelho,Junior Henrique Barbosa de Sá,Thales Pereira Melgaço)
 */
	//Cores do Robocode XaolinDoido
public class XaolinDoido extends AdvancedRobot
{

		public void run()
	{
		
		setColors(Color.yellow,Color.black,Color.red,Color.red,Color.green);

		while (true)
		{
		
			setAhead(80);
			setTurnRight(90);
			turnGunLeft(180);
			setAhead(50);
			setTurnRight(180);
			turnGunLeft(360);

			for (int voltasDir=0;voltasDir<4;voltasDir++)
			{
				ahead(100);
				turnRight(90);
				turnGunRight(90);
			}
		}
	}

		//Robo inimigo detectado
	public void onScannedRobot(ScannedRobotEvent e)
	{
		double distancia = e.getDistance();
		if (distancia < 150)
		{
			fire(3);
		}
		else
		{
			fire(1);
		}
	}
	//colisao com a parede
	public void onHitWall(HitWallEvent e)
		{
		back(90);
		turnRight(90);
		}
}
