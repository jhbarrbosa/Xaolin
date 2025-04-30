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
			setAhead(15);
			turnGunRight(20);
		}
		
	}

		//Robo inimigo detectado
	public void onScannedRobot(ScannedRobotEvent e)
	{
		double distancia = e.getDistance();
		if (distancia < 120)		
		{
			setBack(50);
			setTurnRight(20);
			fire(4);
			scan();
		}
		else
		{
			fire(1);
		}
		
	}
	
	//colisao com a parede
	public void onHitWall(HitWallEvent e)
		{
		setBack(50);
		setTurnRight(50);
		ahead(100);
		setTurnRight(45);
		ahead(100);
		setTurnLeft(45);
		}
}
