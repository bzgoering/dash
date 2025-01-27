package application;

import javafx.animation.PauseTransition;
import javafx.geometry.Bounds;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

public class Obstacle extends Control
{
	//custom variables
	private double TIME = 2;
	private final double AMOUNT = 1;
	private final double STARTX = 836;
	private final double STARTY = 282;
	//other variables
	private Shape shape;
	private Shape player;
    private PauseTransition delay = new PauseTransition(Duration.millis(TIME));
    

	public Obstacle(Shape obstacle, Shape player)
	{
		shape = obstacle;
		this.player = player;
		//delayMove();
	}
	
	protected void delayMove()
	{
		delay.setOnFinished(event -> {
			//animation
        	shape.setLayoutX(shape.getLayoutX() - AMOUNT);
        	checkCollision(shape.getLayoutX());
        	
        	//loop case
        	if (shape.getLayoutX() > 0)
        	{
        		delayMove();
        	}
        	else
        	{
        		shape.setLayoutX(STARTX);
        		shape.setLayoutY(STARTY);
        		delayMove();
        	}
        });
		delay.play();
	}

	private void checkCollision(double x)
	{
		Bounds playerBound = player.getBoundsInParent();
		Bounds ObBound = shape.getBoundsInParent();
		
		if (playerBound.intersects(ObBound))
		{
			player.setVisible(false);
			System.out.println("Collision");
		}
	}
}
