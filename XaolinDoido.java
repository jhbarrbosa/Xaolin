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
			setAhead(10);
			turnGunRight(20);
		}
		
	}

		//Robo inimigo detectado
	public void onScannedRobot(ScannedRobotEvent e)
	{
		double distancia = e.getDistance();
		if (distancia < 190)
		{
			fire(4);
		}
		else
		{
			fire(1);
		}
		scan();
	}
	
	//colisao com a parede
	public void onHitWall(HitWallEvent e)
		{
		back(90);
		turnRight(90);
		}
}
